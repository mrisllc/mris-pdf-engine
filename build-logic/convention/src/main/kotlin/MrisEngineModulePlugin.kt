import org.gradle.api.Plugin
import org.gradle.api.Project

class MrisEngineModulePlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply("mris.kotlin.library")
            pluginManager.apply("mris.kotlin.test")
            dependencies.add("implementation", "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
            dependencies.add("implementation", "org.jetbrains.kotlinx:kotlinx-serialization-json:1.7.1")
        }
    }
}
