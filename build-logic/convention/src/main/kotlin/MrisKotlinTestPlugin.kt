import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class MrisKotlinTestPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply("org.jetbrains.kotlin.jvm")
            dependencies {
                add("testImplementation", "org.junit.jupiter:junit-jupiter:5.10.2")
                add("testImplementation", "io.kotest:kotest-runner-junit5:5.8.0")
                add("testImplementation", "io.kotest:kotest-assertions-core:5.8.0")
            }
            tasks.withType<Test>().configureEach {
                useJUnitPlatform()
            }
        }
    }
}
