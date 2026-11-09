import org.gradle.api.Plugin
import org.gradle.api.Project

class MrisEngineModulePlugin : Plugin<Project> {

    override fun apply(target: Project) = with(target) {

        pluginManager.apply("com.mris.kotlin-library")

        group = "com.mris.pdf.engine"
    }
}
