import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.testing.Test

class MrisKotlinTestPlugin : Plugin<Project> {

    override fun apply(target: Project) = with(target) {

        pluginManager.apply("org.jetbrains.kotlin.jvm")

        tasks.withType(Test::class.java).configureEach {
            useJUnitPlatform()
            failOnNoDiscoveredTests = false
        }
    }
}
