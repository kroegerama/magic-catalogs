# Magic Catalogs

Dependency versions for modern android applications

![Publish](https://github.com/kroegerama/magic-catalogs/workflows/Publish/badge.svg)

![License](https://img.shields.io/github/license/kroegerama/magic-catalogs)

| Artifact |                                                                                   Version                                                                                   |
|:---------|:---------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|
| magic    |    [![Maven Central](https://img.shields.io/maven-central/v/com.kroegerama.magic-catalogs/magic)](https://search.maven.org/artifact/com.kroegerama.magic-catalogs/magic)     |
| androidx | [![Maven Central](https://img.shields.io/maven-central/v/com.kroegerama.magic-catalogs/androidx)](https://search.maven.org/artifact/com.kroegerama.magic-catalogs/androidx) |

## Example usage

##### `settings.gradle.kts`

```kotlin
pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        google()
    }

    versionCatalogs {
        val magicCatalogs: String by settings

        create("magic") {
            from("com.kroegerama.magic-catalogs:magic:$magicCatalogs")
        }
        create("androidx") {
            from("com.kroegerama.magic-catalogs:androidx:$magicCatalogs")
        }
    }
}

// [...] include projects
```

##### `build.gradle.kts` (root)
```kotlin
plugins {
    alias(magic.plugins.android.application) apply false
    alias(magic.plugins.android.library) apply false
    alias(magic.plugins.kotlin.android) apply false
    alias(magic.plugins.kotlin.kapt) apply false
    alias(magic.plugins.kotlin.parcelize) apply false
    alias(magic.plugins.kotlin.serialization) apply false

    alias(magic.plugins.hilt.android) apply false
    alias(magic.plugins.ksp) apply false

    alias(magic.plugins.grgit) apply false
    alias(magic.plugins.spotless) apply false
    
    alias(androidx.plugins.navigation.safeArgs) apply false
}
```

##### `build.gradle.kts` (module)
```kotlin
plugins {
    alias(magic.plugins.android.application)
    alias(magic.plugins.kotlin.android)
    alias(magic.plugins.kotlin.kapt)
    alias(magic.plugins.kotlin.parcelize)
    alias(magic.plugins.kotlin.serialization)

    alias(magic.plugins.hilt.android)
    alias(magic.plugins.ksp)

    alias(magic.plugins.grgit)
    alias(magic.plugins.spotless)

    alias(androidx.plugins.navigation.safeArgs)
}

// [...]

dependencies {
    implementation(magic.kotlin.stdlib.jdk8)
    implementation(magic.kotlinx.coroutines.android)
    implementation(magic.kotlinx.serialization.json)

    implementation(androidx.bundles.base)
    implementation(androidx.bundles.lifecycle)
    implementation(androidx.bundles.navigation)
    implementation(androidx.paging.runtime)
    implementation(androidx.work.runtime)

    implementation(androidx.room)
    ksp(androidx.room.compiler)
    implementation(androidx.room.paging)

    implementation(magic.hilt.android)
    kapt(magic.hilt.compiler)

    implementation(androidx.hilt.work)
    implementation(androidx.hilt.navigation.fragment)
    kapt(androidx.hilt.compiler)

    implementation(magic.material)

// [...]
}
```
