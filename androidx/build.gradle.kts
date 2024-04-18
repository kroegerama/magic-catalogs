@file:Suppress("SpellCheckingInspection")

group = C.PROJECT_GROUP_ID
version = C.PROJECT_VERSION

catalog {
    versionCatalog {
        with(AndroidX) {
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
            version("recyclerview", recyclerview)
            version("recyclerview-selection", recyclerviewSelection)
            version("room", room)
            version("swiperefresh", swiperefresh)
            version("work", work)
            version("camerax", camerax)
            version("navigation", navigation)
            version("viewpager2", viewpager2)
        }

        plugin("navigation-safeArgs", "androidx.navigation.safeargs.kotlin").versionRef("navigation")

        library("activity", "androidx.activity", "activity").versionRef("activity")

        library("appcompat", "androidx.appcompat", "appcompat").versionRef("appcompat")
        library("autofill", "androidx.autofill", "autofill").versionRef("autofill")
        library("biometric", "androidx.biometric", "biometric").versionRef("biometric")
        library("browser", "androidx.browser", "browser").versionRef("browser")
        library("constraintlayout", "androidx.constraintlayout", "constraintlayout").versionRef("constraintlayout")
        library("viewpager2", "androidx.viewpager2", "viewpager2").versionRef("viewpager2")

        library("core", "androidx.core", "core-ktx").versionRef("core")

        library("datastore", "androidx.datastore", "datastore").versionRef("datastore")
        library("datastore-preferences", "androidx.datastore", "datastore-preferences").versionRef("datastore")

        library("exifinterface", "androidx.exifinterface", "exifinterface").versionRef("exif")

        library("fragment", "androidx.fragment", "fragment-ktx").versionRef("fragment")

        library("hilt-common", "androidx.hilt", "hilt-common").versionRef("hilt")
        library("hilt-compiler", "androidx.hilt", "hilt-compiler").versionRef("hilt")
        library("hilt-navigation", "androidx.hilt", "hilt-navigation").versionRef("hilt")
        library("hilt-navigation-fragment", "androidx.hilt", "hilt-navigation-fragment").versionRef("hilt")
        library("hilt-work", "androidx.hilt", "hilt-work").versionRef("hilt")
        library("hilt-navigation-compose", "androidx.hilt", "hilt-navigation-compose").versionRef("hilt")

        library("lifecycle-common-java8", "androidx.lifecycle", "lifecycle-common-java8").versionRef("lifecycle")
        library("lifecycle-viewmodel", "androidx.lifecycle", "lifecycle-viewmodel-ktx").versionRef("lifecycle")
        library("lifecycle-livedata", "androidx.lifecycle", "lifecycle-livedata-ktx").versionRef("lifecycle")
        library("lifecycle-runtime", "androidx.lifecycle", "lifecycle-runtime-ktx").versionRef("lifecycle")
        library("lifecycle-process", "androidx.lifecycle", "lifecycle-process").versionRef("lifecycle")
        library("lifecycle-service", "androidx.lifecycle", "lifecycle-service").versionRef("lifecycle")
        library("lifecycle-viewmodel-savedstate", "androidx.lifecycle", "lifecycle-viewmodel-savedstate").versionRef("lifecycle")

        library("lifecycle-viewmodel-compose", "androidx.lifecycle", "lifecycle-viewmodel-compose").versionRef("lifecycle")
        library("lifecycle-runtime-compose", "androidx.lifecycle", "lifecycle-runtime-compose").versionRef("lifecycle")

        library("navigation-common", "androidx.navigation", "navigation-common").versionRef("navigation")
        library("navigation-fragment", "androidx.navigation", "navigation-fragment-ktx").versionRef("navigation")
        library("navigation-ui", "androidx.navigation", "navigation-ui-ktx").versionRef("navigation")
        library("navigation-compose", "androidx.navigation", "navigation-compose").versionRef("navigation")

        library("paging-runtime", "androidx.paging", "paging-runtime-ktx").versionRef("paging")

        library("preference", "androidx.preference", "preference-ktx").versionRef("preference")
        library("recyclerview", "androidx.recyclerview", "recyclerview").versionRef("recyclerview")
        library("recyclerview-selection", "androidx.recyclerview", "recyclerview-selection").versionRef("recyclerview-selection")

        library("room", "androidx.room", "room-ktx").versionRef("room")
        library("room-compiler", "androidx.room", "room-compiler").versionRef("room")
        library("room-paging", "androidx.room", "room-paging").versionRef("room")
        library("room-runtime", "androidx.room", "room-runtime").versionRef("room")

        library("swiperefreshlayout", "androidx.swiperefreshlayout", "swiperefreshlayout").versionRef("swiperefresh")

        library("work-runtime", "androidx.work", "work-runtime-ktx").versionRef("work")

        library("camera-core", "androidx.camera", "camera-core").versionRef("camerax")
        library("camera-camera2", "androidx.camera", "camera-camera2").versionRef("camerax")
        library("camera-extensions", "androidx.camera", "camera-extensions").versionRef("camerax")
        library("camera-lifecycle", "androidx.camera", "camera-lifecycle").versionRef("camerax")
        library("camera-view", "androidx.camera", "camera-view").versionRef("camerax")
        library("camera-video", "androidx.camera", "camera-video").versionRef("camerax")

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
                "lifecycle-viewmodel-savedstate"
            )
        )
        bundle(
            "navigation",
            listOf(
                "navigation-fragment",
                "navigation-ui",
            )
        )
        bundle(
            "camerax",
            listOf(
                "camera-core",
                "camera-camera2",
                "camera-extensions",
                "camera-lifecycle",
            )
        )
    }
}
