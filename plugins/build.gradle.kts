@file:Suppress("SpellCheckingInspection")

group = C.PROJECT_GROUP_ID
version = C.PROJECT_VERSION

catalog {
    versionCatalog {
        version("kotlin", V.Base.kotlin)
        version("androidGradle", V.Plugins.androidGradle)
        version("hilt", V.Base.hilt)
        version("navigation", V.AndroidX.navigation)

        library("kotlin", "org.jetbrains.kotlin", "kotlin-gradle-plugin").versionRef("kotlin")
        library("kotlinSerialization", "org.jetbrains.kotlin", "kotlin-serialization").versionRef("kotlin")

        library("android", "com.android.tools.build", "gradle").versionRef("androidGradle")
        library("hiltAndroid", "com.google.dagger", "hilt-android-gradle-plugin").versionRef("hilt")
        library("navigationSafeArgs", "androidx.navigation", "navigation-safe-args-gradle-plugin").versionRef("navigation")

        bundle(
            "all",
            listOf(
                "kotlin",
                "android",
                "hiltAndroid",
                "navigationSafeArgs"
            )
        )
    }
}
