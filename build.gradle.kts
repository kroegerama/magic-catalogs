import com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask

group = C.PROJECT_GROUP_ID
version = C.PROJECT_VERSION

val nexusUsername: String? by project
val nexusPassword: String? by project
val nexusStagingProfileId: String? by project
val signingKey: String? by project
val signingPassword: String? by project

plugins {
    alias(libs.plugins.nexus.publish)
    alias(libs.plugins.versions)
    `jvm-ecosystem`
}

tasks.withType<DependencyUpdatesTask>().configureEach {
    gradleReleaseChannel = "current"
    revision = "release"
    filterConfigurations = Spec<Configuration> {
        it.name == dependencyCheckConfiguration
    }
    rejectVersionIf {
        isNonStable(candidate.version) && !isNonStable(currentVersion)
    }
    outputFormatter {
        unresolved.dependencies.forEach { dependency->
            logger.error("unresolved: $dependency")
        }
        outdated.dependencies.forEach { dependency ->
            val artifact = dependency.run { "$group:$name:$version" }
            val available = dependency.available.run { listOfNotNull(release, milestone, integration).joinToString() }
            val url = dependency.projectUrl?.let { " $it" }.orEmpty()
            logger.lifecycle(artifact)
            logger.lifecycle("\tavailable: $available$url")
        }
    }
}

subprojects {
    apply {
        plugin("version-catalog")
        plugin("maven-publish")
        plugin("signing")
        plugin("jvm-ecosystem")
    }

    configurations.register(dependencyCheckConfiguration) {
        isTransitive = false
    }

    configure<PublishingExtension> {
        publications {
            register<MavenPublication>("release") {
                groupId = C.PROJECT_GROUP_ID
                version = C.PROJECT_VERSION

                from(components["versionCatalog"])
                pom(BuildConfig.pomAction)
            }
        }
        repositories {
            maven {
                name = "sonatype"
                setUrl("https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/")

                credentials {
                    username = nexusUsername
                    password = nexusPassword
                }
            }
        }
    }

    configure<SigningExtension> {
        sign(extensions.getByType<PublishingExtension>().publications)
        if (signingKey != null && signingPassword != null) {
            useInMemoryPgpKeys(signingKey, signingPassword)
        }
    }
}

nexusPublishing {
    packageGroup.set(C.PROJECT_GROUP_ID)

    repositories {
        sonatype {
            stagingProfileId.set(nexusStagingProfileId)
            username.set(nexusUsername)
            password.set(nexusPassword)

            nexusUrl.set(uri("https://s01.oss.sonatype.org/service/local/"))
            snapshotRepositoryUrl.set(uri("https://s01.oss.sonatype.org/content/repositories/snapshots/"))
        }
    }
}

tasks.wrapper {
    distributionType = Wrapper.DistributionType.ALL
}
