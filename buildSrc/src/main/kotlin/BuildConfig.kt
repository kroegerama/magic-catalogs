import org.gradle.api.Action
import org.gradle.api.publish.maven.MavenPom

object BuildConfig {

    val pomAction = Action<MavenPom> {
        with(C) {
            name.set(PROJECT_NAME)
            description.set(PROJECT_DESCRIPTION)
            url.set(PROJECT_URL)

            licenses {
                license {
                    name.set("The Apache License, Version 2.0")
                    url.set("https://www.apache.org/licenses/LICENSE-2.0.txt")
                }
            }
            developers {
                developer {
                    id.set(USER_ID)
                    name.set(USER_NAME)
                    email.set(USER_MAIL)
                }
            }
            scm {
                url.set(PROJECT_URL)
                connection.set("scm:git:$PROJECT_URL")
                developerConnection.set("scm:git:https://www.github.com/kroegerama")
            }
        }
    }
}