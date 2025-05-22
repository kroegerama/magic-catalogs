import com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask

group = C.PROJECT_GROUP_ID
version = C.PROJECT_VERSION

val sonatypeUsername: String? by project
val sonatypePassword: String? by project
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
        unresolved.dependencies.forEach { dependency ->
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
    }

    configure<SigningExtension> {
        sign(extensions.getByType<PublishingExtension>().publications)
        if (signingKey != null && signingPassword != null) {
            useInMemoryPgpKeys(signingKey, signingPassword)
        }
    }
}

nexusPublishing {
    packageGroup = C.PROJECT_GROUP_ID
    repositories {
        sonatype {
            username = sonatypeUsername
            password = sonatypePassword

            nexusUrl = uri("https://ossrh-staging-api.central.sonatype.com/service/local/")
            snapshotRepositoryUrl = uri("https://central.sonatype.com/repository/maven-snapshots/")
        }
    }
}

tasks.wrapper {
    distributionType = Wrapper.DistributionType.ALL
}
