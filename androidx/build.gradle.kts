@file:Suppress("SpellCheckingInspection")

group = C.PROJECT_GROUP_ID
version = C.PROJECT_VERSION

catalog {
    versionCatalog {
        with(V.AndroidX) {
            version("activity", activity)
            version("appcompat", appcompat)
            version("autofill", autofill)
            version("biometric", biometric)
            version("browser", browser)
            version("constraintlayout", constraintlayout)
            version("core", core)
            version("datastore", datastore)
            version("exif", exif)
            version("fragment", fragment)
            version("hilt", hilt)
            version("lifecycle", lifecycle)
            version("navigation", navigation)
            version("paging", paging)
            version("preference", preference)
            version("recycler", recycler)
            version("room", room)
            version("swiperefresh", swiperefresh)
            version("work", work)
        }

        alias("activity").to("androidx.activity", "activity-ktx").versionRef("activity")

        alias("appcompat").to("androidx.appcompat", "appcompat").versionRef("appcompat")
        alias("autofill").to("androidx.autofill", "autofill").versionRef("autofill")
        alias("biometric").to("androidx.biometric", "biometric").versionRef("biometric")
        alias("browser").to("androidx.browser", "browser").versionRef("browser")
        alias("constraintlayout").to("androidx.constraintlayout", "constraintlayout").versionRef("constraintlayout")

        alias("core").to("androidx.core", "core-ktx").versionRef("core")

        alias("datastore").to("androidx.datastore", "datastore").versionRef("datastore")
        alias("datastorePreferences").to("androidx.datastore", "datastore-preferences").versionRef("datastore")

        alias("exifinterface").to("androidx.exifinterface", "exifinterface").versionRef("exif")

        alias("fragment").to("androidx.fragment", "fragment-ktx").versionRef("fragment")

        alias("hilt-common").to("androidx.hilt", "hilt-common").versionRef("hilt")
        alias("hilt-compiler").to("androidx.hilt", "hilt-compiler").versionRef("hilt")
        alias("hilt-navigation").to("androidx.hilt", "hilt-navigation").versionRef("hilt")
        alias("hilt-navigationFragment").to("androidx.hilt", "hilt-navigation-fragment").versionRef("hilt")
        alias("hilt-work").to("androidx.hilt", "hilt-work").versionRef("hilt")

        alias("lifecycle-viewmodel").to("androidx.lifecycle", "lifecycle-viewmodel-ktx").versionRef("lifecycle")
        alias("lifecycle-livedata").to("androidx.lifecycle", "lifecycle-livedata-ktx").versionRef("lifecycle")
        alias("lifecycle-runtime").to("androidx.lifecycle", "lifecycle-runtime-ktx").versionRef("lifecycle")
        alias("lifecycle-common-java8").to("androidx.lifecycle", "lifecycle-common-java8").versionRef("lifecycle")
        alias("lifecycle-process").to("androidx.lifecycle", "lifecycle-process").versionRef("lifecycle")
        alias("lifecycle-service").to("androidx.lifecycle", "lifecycle-service").versionRef("lifecycle")
        alias("lifecycle-viewmodelSavedState").to("androidx.lifecycle", "lifecycle-viewmodel-savedstate").versionRef("lifecycle")

        alias("navigation-common").to("androidx.navigation", "navigation-common").versionRef("navigation")
        alias("navigation-fragment").to("androidx.navigation", "navigation-fragment-ktx").versionRef("navigation")
        alias("navigation-ui").to("androidx.navigation", "navigation-ui-ktx").versionRef("navigation")

        alias("paging-runtime").to("androidx.paging", "paging-runtime-ktx").versionRef("paging")

        alias("preference").to("androidx.preference", "preference-ktx").versionRef("preference")
        alias("recyclerview").to("androidx.recyclerview", "recyclerview").versionRef("recycler")

        alias("roomRuntime").to("androidx.room", "room-runtime").versionRef("room")
        alias("roomCompiler").to("androidx.room", "room-compiler").versionRef("room")
        alias("room").to("androidx.room", "room-ktx").versionRef("room")

        alias("swiperefreshlayout").to("androidx.swiperefreshlayout", "swiperefreshlayout").versionRef("swiperefresh")

        alias("work-runtime").to("androidx.work", "work-runtime-ktx").versionRef("work")

        bundle(
            "base",
            listOf(
                "activity",
                "appcompat",
                "constraintlayout",
                "core",
                "fragment",
                "recyclerview",
                "swiperefreshlayout"
            )
        )

        bundle(
            "lifecycle",
            listOf(
                "lifecycle-viewmodel",
                "lifecycle-livedata",
                "lifecycle-runtime",
                "lifecycle-common-java8",
                "lifecycle-process",
                "lifecycle-viewmodelSavedState"
            )
        )
        bundle(
            "navigation",
            listOf(
                "navigation-fragment",
                "navigation-ui"
            )
        )
    }
}
