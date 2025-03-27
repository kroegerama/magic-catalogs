dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        google()
    }
    versionCatalogs {
        register("androidx") {
            from(files("gradle/androidx.versions.toml"))
        }
        register("magic") {
            from(files("gradle/magic.versions.toml"))
        }
    }
}


pluginManagement {
    repositories {
        mavenCentral()
        google()
        gradlePluginPortal()
    }
}

rootProject.name = "magic-catalogs"

include(":magic")
include(":androidx")
