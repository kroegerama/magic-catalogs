@file:Suppress("SpellCheckingInspection")

group = C.PROJECT_GROUP_ID
version = C.PROJECT_VERSION

catalog {
    versionCatalog {
        with(Magic) {
            version("androidGradle", androidGradle)
            version("kotlin", kotlin)
            version("kotlinKsp", kotlinKsp)
            version("kotlinxDateTime", kotlinxDateTime)
            version("kotlinxCoroutines", kotlinxCoroutines)
            version("kotlinxSerialization", kotlinxSerialization)
            version("moshi", moshi)
            version("okhttp", okhttp)
            version("retrofit", retrofit)
            version("dagger", dagger)
            version("material", material)
            version("coil", coil)
            version("coil3", coil3)
            version("desugar", desugar)
            version("chucker", chucker)
            version("timber", timber)
            version("logcat", logcat)
            version("arrow", arrow)
            version("zxing", zxing)
            version("spotless", spotless)
            version("grgit", grgit)
        }

        plugin("kotlin-jvm", "org.jetbrains.kotlin.jvm").versionRef("kotlin")
        plugin("kotlin-android", "org.jetbrains.kotlin.android").versionRef("kotlin")
        plugin("kotlin-kapt", "org.jetbrains.kotlin.kapt").versionRef("kotlin")
        plugin("kotlin-parcelize", "org.jetbrains.kotlin.plugin.parcelize").versionRef("kotlin")
        plugin("kotlin-serialization", "org.jetbrains.kotlin.plugin.serialization").versionRef("kotlin")
        plugin("kotlin-multiplatform", "org.jetbrains.kotlin.multiplatform").versionRef("kotlin")
        plugin("kotlin-compose", "org.jetbrains.kotlin.plugin.compose").versionRef("kotlin")

        plugin("ksp", "com.google.devtools.ksp").versionRef("kotlinKsp")

        plugin("android-application", "com.android.application").versionRef("androidGradle")
        plugin("android-library", "com.android.library").versionRef("androidGradle")

        plugin("hilt-android", "com.google.dagger.hilt.android").versionRef("dagger")

        plugin("grgit", "org.ajoberstar.grgit").versionRef("grgit")
        plugin("spotless", "com.diffplug.spotless").versionRef("spotless")

        library("kotlin-stdlib-jdk8", "org.jetbrains.kotlin", "kotlin-stdlib-jdk8").versionRef("kotlin")

        library("kotlinx-dateTime", "org.jetbrains.kotlinx", "kotlinx-datetime").versionRef("kotlinxDateTime")

        library("kotlinx-coroutines-core", "org.jetbrains.kotlinx", "kotlinx-coroutines-core").versionRef("kotlinxCoroutines")
        library("kotlinx-coroutines-android", "org.jetbrains.kotlinx", "kotlinx-coroutines-android").versionRef("kotlinxCoroutines")
        library("kotlinx-coroutines-jdk8", "org.jetbrains.kotlinx", "kotlinx-coroutines-jdk8").versionRef("kotlinxCoroutines")
        library("kotlinx-coroutines-jdk9", "org.jetbrains.kotlinx", "kotlinx-coroutines-jdk9").versionRef("kotlinxCoroutines")
        library("kotlinx-coroutines-guava", "org.jetbrains.kotlinx", "kotlinx-coroutines-guava").versionRef("kotlinxCoroutines")
        library("kotlinx-coroutines-playServices", "org.jetbrains.kotlinx", "kotlinx-coroutines-play-services").versionRef("kotlinxCoroutines")

        library("kotlinx-serialization-core", "org.jetbrains.kotlinx", "kotlinx-serialization-core").versionRef("kotlinxSerialization")
        library("kotlinx-serialization-json", "org.jetbrains.kotlinx", "kotlinx-serialization-json").versionRef("kotlinxSerialization")
        library("kotlinx-serialization-protobuf", "org.jetbrains.kotlinx", "kotlinx-serialization-protobuf").versionRef("kotlinxSerialization")

        library("moshi", "com.squareup.moshi", "moshi").versionRef("moshi")
        library("moshi-adapters", "com.squareup.moshi", "moshi-adapters").versionRef("moshi")
        library("moshi-kotlin", "com.squareup.moshi", "moshi-kotlin").versionRef("moshi")
        library("moshi-kotlin-codegen", "com.squareup.moshi", "moshi-kotlin-codegen").versionRef("moshi")

        library("okhttp", "com.squareup.okhttp3", "okhttp").versionRef("okhttp")
        library("okhttp-loggingInterceptor", "com.squareup.okhttp3", "logging-interceptor").versionRef("okhttp")
        library("okhttp-sse", "com.squareup.okhttp3", "okhttp-sse").versionRef("okhttp")
        library("okhttp-tls", "com.squareup.okhttp3", "okhttp-tls").versionRef("okhttp")

        library("retrofit", "com.squareup.retrofit2", "retrofit").versionRef("retrofit")
        library("retrofit-converter-moshi", "com.squareup.retrofit2", "converter-moshi").versionRef("retrofit")

        library("hilt-android", "com.google.dagger", "hilt-android").versionRef("dagger")
        library("hilt-compiler", "com.google.dagger", "hilt-compiler").versionRef("dagger")
        library("hilt-work", "com.google.dagger", "hilt-work").versionRef("dagger")

        library("material", "com.google.android.material", "material").versionRef("material")

        library("coil", "io.coil-kt", "coil").versionRef("coil")
        library("coil-gif", "io.coil-kt", "coil-gif").versionRef("coil")
        library("coil-svg", "io.coil-kt", "coil-svg").versionRef("coil")
        library("coil-video", "io.coil-kt", "coil-video").versionRef("coil")
        library("coil-compose", "io.coil-kt", "coil-compose").versionRef("coil")

        library("coil3-bom", "io.coil-kt.coil3", "coil").versionRef("coil3")

        library("desugar", "com.android.tools", "desugar_jdk_libs").versionRef("desugar")

        library("chucker", "com.github.chuckerteam.chucker", "library").versionRef("chucker")
        library("chucker-noop", "com.github.chuckerteam.chucker", "library-no-op").versionRef("chucker")

        library("timber", "com.jakewharton.timber", "timber").versionRef("timber")
        library("logcat", "com.squareup.logcat", "logcat").versionRef("logcat")

        library("arrow-core", "io.arrow-kt", "arrow-core").versionRef("arrow")
        library("arrow-fx-coroutines", "io.arrow-kt", "arrow-fx-coroutines").versionRef("arrow")

        library("zxing", "com.google.zxing", "core").versionRef("zxing")

        bundle(
            "moshi",
            listOf(
                "moshi",
                "moshi-adapters"
            )
        )
        bundle(
            "okhttp",
            listOf(
                "okhttp",
                "okhttp-loggingInterceptor"
            )
        )
        bundle(
            "arrow",
            listOf(
                "arrow-core",
                "arrow-fx-coroutines"
            )
        )
    }
}
