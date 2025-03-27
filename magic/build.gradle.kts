group = C.PROJECT_GROUP_ID
version = C.PROJECT_VERSION

catalog {
    versionCatalog {
        from(rootProject.files("gradle/magic.versions.toml"))
    }
}

plugins {
    alias(magic.plugins.ksp) apply false
    alias(magic.plugins.grgit) apply false
    alias(magic.plugins.spotless) apply false
    alias(magic.plugins.android.application) apply false
}

dependencies {
    versionCatalogs.find("magic").ifPresent { catalog ->
        catalog.libraryAliases.forEach { alias ->
            catalog.findLibrary(alias).ifPresent { dependencyProvider ->
                add(dependencyCheckConfiguration, dependencyProvider)
            }
        }
    }
}
