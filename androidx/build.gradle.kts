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

        library("activity", "androidx.activity", "activity-ktx").versionRef("activity")

        library("appcompat", "androidx.appcompat", "appcompat").versionRef("appcompat")
        library("autofill", "androidx.autofill", "autofill").versionRef("autofill")
        library("biometric", "androidx.biometric", "biometric").versionRef("biometric")
        library("browser", "androidx.browser", "browser").versionRef("browser")
        library("constraintlayout", "androidx.constraintlayout", "constraintlayout").versionRef("constraintlayout")

        library("core", "androidx.core", "core-ktx").versionRef("core")

        library("datastore", "androidx.datastore", "datastore").versionRef("datastore")
        library("datastorePreferences", "androidx.datastore", "datastore-preferences").versionRef("datastore")

        library("exifinterface", "androidx.exifinterface", "exifinterface").versionRef("exif")

        library("fragment", "androidx.fragment", "fragment-ktx").versionRef("fragment")

        library("hilt-common", "androidx.hilt", "hilt-common").versionRef("hilt")
        library("hilt-compiler", "androidx.hilt", "hilt-compiler").versionRef("hilt")
        library("hilt-navigation", "androidx.hilt", "hilt-navigation").versionRef("hilt")
        library("hilt-navigationFragment", "androidx.hilt", "hilt-navigation-fragment").versionRef("hilt")
        library("hilt-work", "androidx.hilt", "hilt-work").versionRef("hilt")

        library("lifecycle-viewmodel", "androidx.lifecycle", "lifecycle-viewmodel-ktx").versionRef("lifecycle")
        library("lifecycle-livedata", "androidx.lifecycle", "lifecycle-livedata-ktx").versionRef("lifecycle")
        library("lifecycle-runtime", "androidx.lifecycle", "lifecycle-runtime-ktx").versionRef("lifecycle")
        library("lifecycle-common-java8", "androidx.lifecycle", "lifecycle-common-java8").versionRef("lifecycle")
        library("lifecycle-process", "androidx.lifecycle", "lifecycle-process").versionRef("lifecycle")
        library("lifecycle-service", "androidx.lifecycle", "lifecycle-service").versionRef("lifecycle")
        library("lifecycle-viewmodelSavedState", "androidx.lifecycle", "lifecycle-viewmodel-savedstate").versionRef("lifecycle")

        library("navigation-common", "androidx.navigation", "navigation-common").versionRef("navigation")
        library("navigation-fragment", "androidx.navigation", "navigation-fragment-ktx").versionRef("navigation")
        library("navigation-ui", "androidx.navigation", "navigation-ui-ktx").versionRef("navigation")

        library("paging-runtime", "androidx.paging", "paging-runtime-ktx").versionRef("paging")

        library("preference", "androidx.preference", "preference-ktx").versionRef("preference")
        library("recyclerview", "androidx.recyclerview", "recyclerview").versionRef("recycler")

        library("roomRuntime", "androidx.room", "room-runtime").versionRef("room")
        library("roomCompiler", "androidx.room", "room-compiler").versionRef("room")
        library("roomPaging", "androidx.room", "room-paging").versionRef("room")
        library("room", "androidx.room", "room-ktx").versionRef("room")

        library("swiperefreshlayout", "androidx.swiperefreshlayout", "swiperefreshlayout").versionRef("swiperefresh")

        library("work-runtime", "androidx.work", "work-runtime-ktx").versionRef("work")

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
                "navigation-ui",
            )
        )
    }
}
