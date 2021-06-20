# Magic Catalogs
Dependency versions for modern android applications

![Publish](https://github.com/kroegerama/magic-catalogs/workflows/Publish/badge.svg)

![License](https://img.shields.io/github/license/kroegerama/magic-catalogs)

| Artifact | Version |
|:-|:-:|
| base | [![Maven Central](https://img.shields.io/maven-central/v/com.kroegerama.magic-catalogs/base)](https://search.maven.org/artifact/com.kroegerama.magic-catalogs/base) |
| androidx | [![Maven Central](https://img.shields.io/maven-central/v/com.kroegerama.magic-catalogs/androidx)](https://search.maven.org/artifact/com.kroegerama.magic-catalogs/androidx) |
| plugins | [![Maven Central](https://img.shields.io/maven-central/v/com.kroegerama.magic-catalogs/plugins)](https://search.maven.org/artifact/com.kroegerama.magic-catalogs/plugins) |

## Usage

##### `settings.gradle.kts`

```kotlin
versionCatalogs {
    val magicCatalogs = "<version>"

    create("lib") {
        from("com.kroegerama.magic-catalogs:base:$magicCatalogs")
    }
    create("androidx") {
        from("com.kroegerama.magic-catalogs:androidx:$magicCatalogs")
    }
    create("plg") {
        from("com.kroegerama.magic-catalogs:plugins:$magicCatalogs")
    }
}
```

##### `module.gradle.kts`

```kotlin
implementation(lib.kotlin)
implementation(lib.coroutines.android)

implementation(androidx.bundles.base)
implementation(androidx.bundles.lifecycle)
implementation(androidx.bundles.navigation)

implementation(lib.hilt.android)
kapt(lib.hilt.compiler)

implementation(lib.material)
```
