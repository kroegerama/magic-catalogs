@file:Suppress("SpellCheckingInspection")

group = C.PROJECT_GROUP_ID
version = C.PROJECT_VERSION

catalog {
    versionCatalog {
        with(V.Base) {
            version("kotlin", kotlin)
            version("kotlinxCoroutines", kotlinxCoroutines)
            version("kotlinxSerialization", kotlinxSerialization)
            version("kotlinxDateTime", kotlinxDateTime)

            version("desugar", desugar)

            version("hilt", hilt)

            version("moshi", moshi)
            version("okhttp", okhttp)
            version("retrofit", retrofit)

            version("material", material)

            version("timber", timber)
            version("logcat", logcat)

            version("coil", coil)
            version("chucker", chucker)
        }

        alias("kotlin").to("org.jetbrains.kotlin", "kotlin-stdlib-jdk8").versionRef("kotlin")

        alias("coroutines-core").to("org.jetbrains.kotlinx", "kotlinx-coroutines-core").versionRef("kotlinxCoroutines")
        alias("coroutines-android").to("org.jetbrains.kotlinx", "kotlinx-coroutines-android").versionRef("kotlinxCoroutines")
        alias("coroutines-play-services").to("org.jetbrains.kotlinx", "kotlinx-coroutines-play-services").versionRef("kotlinxCoroutines")

        alias("kotlinx-serialization-json").to("org.jetbrains.kotlinx", "kotlinx-serialization-json").versionRef("kotlinxSerialization")
        alias("kotlinx-serialization-protobuf").to("org.jetbrains.kotlinx", "kotlinx-serialization-protobuf").versionRef("kotlinxSerialization")
        alias("kotlinx-dateTime").to("org.jetbrains.kotlinx", "kotlinx-datetime").versionRef("kotlinxDateTime")

        alias("desugar").to("com.android.tools", "desugar_jdk_libs").versionRef("desugar")

        alias("hilt-android").to("com.google.dagger", "hilt-android").versionRef("hilt")
        alias("hilt-compiler").to("com.google.dagger", "hilt-compiler").versionRef("hilt")

        alias("moshi-base").to("com.squareup.moshi", "moshi").versionRef("moshi")
        alias("moshi-adapters").to("com.squareup.moshi", "moshi-adapters").versionRef("moshi")
        alias("moshi-codegen").to("com.squareup.moshi", "moshi-kotlin-codegen").versionRef("moshi")

        alias("okhttp-base").to("com.squareup.okhttp3", "okhttp").versionRef("okhttp")
        alias("okhttp-logging").to("com.squareup.okhttp3", "logging-interceptor").versionRef("okhttp")

        alias("retrofit").to("com.squareup.retrofit2", "retrofit").versionRef("retrofit")

        alias("material").to("com.google.android.material", "material").versionRef("material")

        alias("timber").to("com.jakewharton.timber", "timber").versionRef("timber")
        alias("logcat").to("com.squareup.logcat", "logcat").versionRef("logcat")

        alias("coil").to("io.coil-kt", "coil").versionRef("coil")
        alias("coilGif").to("io.coil-kt", "coil-gif").versionRef("coil")
        alias("coilSvg").to("io.coil-kt", "coil-svg").versionRef("coil")

        alias("chucker").to("com.github.chuckerteam.chucker", "library").versionRef("chucker")
        alias("chuckerNoop").to("com.github.chuckerteam.chucker", "library-no-op").versionRef("chucker")

        bundle(
            "moshi",
            listOf(
                "moshi-base",
                "moshi-adapters"
            )
        )
        bundle(
            "okhttp",
            listOf(
                "okhttp-base",
                "okhttp-logging"
            )
        )
    }
}
