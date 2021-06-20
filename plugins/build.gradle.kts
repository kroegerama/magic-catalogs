@file:Suppress("SpellCheckingInspection")

group = C.PROJECT_GROUP_ID
version = C.PROJECT_VERSION

catalog {
    versionCatalog {
        version("kotlin", V.Base.kotlin)
        version("androidGradle", V.Plugins.androidGradle)
        version("hilt", V.Base.hilt)
        version("navigation", V.AndroidX.navigation)

        alias("kotlin").to("org.jetbrains.kotlin", "kotlin-gradle-plugin").versionRef("kotlin")
        alias("android").to("com.android.tools.build", "gradle").versionRef("androidGradle")
        alias("hiltAndroid").to("com.google.dagger", "hilt-android-gradle-plugin").versionRef("hilt")
        alias("navigationSafeArgs").to("androidx.navigation", "navigation-safe-args-gradle-plugin").versionRef("navigation")

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
