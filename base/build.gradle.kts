@file:Suppress("SpellCheckingInspection")

group = C.PROJECT_GROUP_ID
version = C.PROJECT_VERSION

catalog {
    versionCatalog {
        with(V.Base) {
            library("kotlin", "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlin")

            library("coroutines-core", "org.jetbrains.kotlinx:kotlinx-coroutines-core:$kotlinxCoroutines")
            library("coroutines-android", "org.jetbrains.kotlinx:kotlinx-coroutines-android:$kotlinxCoroutines")
            library("coroutines-play-services", "org.jetbrains.kotlinx:kotlinx-coroutines-play-services:$kotlinxCoroutines")
            library("coroutines-guava", "org.jetbrains.kotlinx:kotlinx-coroutines-guava:$kotlinxCoroutines")

            library("kotlinx-serialization-json", "org.jetbrains.kotlinx:kotlinx-serialization-json:$kotlinxSerialization")
            library("kotlinx-serialization-protobuf", "org.jetbrains.kotlinx:kotlinx-serialization-protobuf:$kotlinxSerialization")
            library("kotlinx-dateTime", "org.jetbrains.kotlinx:kotlinx-datetime:$kotlinxDateTime")

            library("desugar", "com.android.tools:desugar_jdk_libs:$desugar")

            library("hilt-android", "com.google.dagger:hilt-android:$hilt")
            library("hilt-work", "com.google.dagger:hilt-work:$hilt")
            library("hilt-compiler", "com.google.dagger:hilt-compiler:$hilt")

            library("moshi-base", "com.squareup.moshi:moshi:$moshi")
            library("moshi-adapters", "com.squareup.moshi:moshi-adapters:$moshi")
            library("moshi-codegen", "com.squareup.moshi:moshi-kotlin-codegen:$moshi")

            library("okhttp-base", "com.squareup.okhttp3:okhttp:$okhttp")
            library("okhttp-logging", "com.squareup.okhttp3:logging-interceptor:$okhttp")

            library("retrofit", "com.squareup.retrofit2:retrofit:$retrofit")

            library("material", "com.google.android.material:material:$material")

            library("timber", "com.jakewharton.timber:timber:$timber")
            library("logcat", "com.squareup.logcat:logcat:$logcat")

            library("coil", "io.coil-kt:coil:$coil")
            library("coilGif", "io.coil-kt:coil-gif:$coil")
            library("coilSvg", "io.coil-kt:coil-svg:$coil")
            library("coilVideo", "io.coil-kt:coil-video:$coil")

            library("chucker", "com.github.chuckerteam.chucker:library:$chucker")
            library("chuckerNoop", "com.github.chuckerteam.chucker:library-no-op:$chucker")
        }

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
