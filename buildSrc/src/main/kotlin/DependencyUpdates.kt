val nonStableQualifiers = listOf("alpha", "beta", "rc")
const val dependencyCheckConfiguration = "depCheck"

fun isNonStable(version: String): Boolean = nonStableQualifiers.any { qualifier ->
    qualifier in version.lowercase()
}
