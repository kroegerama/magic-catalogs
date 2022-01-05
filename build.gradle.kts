group = C.PROJECT_GROUP_ID
version = C.PROJECT_VERSION

plugins {
    id("io.github.gradle-nexus.publish-plugin")
}

subprojects {
    apply {
        plugin("version-catalog")
        plugin("maven-publish")
        plugin("signing")
    }

    afterEvaluate {
        configure<PublishingExtension> {
            publications {
                create<MavenPublication>("release") {
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
                        val nexusUsername: String? by project
                        val nexusPassword: String? by project

                        username = nexusUsername
                        password = nexusPassword
                    }
                }
            }
        }

        configure<SigningExtension> {
            sign(extensions.getByType<PublishingExtension>().publications)
            val signingKey: String? by project
            val signingPassword: String? by project
            if (signingKey != null && signingPassword != null) {
                useInMemoryPgpKeys(signingKey, signingPassword)
            }
        }
    }
}

nexusPublishing {
    val nexusUsername: String? by project
    val nexusPassword: String? by project
    val nexusStagingProfileId: String? by project

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
