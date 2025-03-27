group = C.PROJECT_GROUP_ID
version = C.PROJECT_VERSION

catalog {
    versionCatalog {
        from(rootProject.files("gradle/androidx.versions.toml"))
    }
}

dependencies {
    versionCatalogs.find("androidx").ifPresent { catalog ->
        catalog.libraryAliases.forEach { alias ->
            catalog.findLibrary(alias).ifPresent { dependencyProvider ->
                add(dependencyCheckConfiguration, dependencyProvider)
            }
        }
    }
}
