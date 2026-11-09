import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.plugins.JavaLibraryPlugin
import org.gradle.api.tasks.testing.Test
import org.gradle.jvm.toolchain.JavaLanguageVersion
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension

class MrisKotlinLibraryPlugin : Plugin<Project> {

    override fun apply(target: Project) = with(target) {

        pluginManager.apply("org.jetbrains.kotlin.jvm")
        pluginManager.apply(JavaLibraryPlugin::class.java)

        extensions.configure(
            KotlinJvmProjectExtension::class.java
        ) {
            jvmToolchain(21)

            compilerOptions {
                jvmTarget.set(JvmTarget.JVM_21)
            }
        }

        tasks.withType(Test::class.java).configureEach {
            useJUnitPlatform()
        }
    }
}
