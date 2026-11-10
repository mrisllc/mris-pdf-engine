
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.plugins.JavaLibraryPlugin
import org.gradle.api.tasks.testing.Test
import org.gradle.jvm.toolchain.JavaLanguageVersion
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension
import org.jlleitschuh.gradle.ktlint.KtlintExtension

class MrisKotlinLibraryPlugin : Plugin<Project> {

    override fun apply(target: Project) = with(target) {

        // 1. Apply Kotlin JVM first.
        pluginManager.apply("org.jetbrains.kotlin.jvm")

        // 2. Apply Java Library.
        pluginManager.apply(JavaLibraryPlugin::class.java)

        // 3. Configure Kotlin JVM.
        extensions.configure(
            KotlinJvmProjectExtension::class.java
        ) {
            jvmToolchain(21)

            compilerOptions {
                jvmTarget.set(JvmTarget.JVM_21)
            }
        }

        // 4. Apply Ktlint after Kotlin JVM.
        pluginManager.apply(
            "org.jlleitschuh.gradle.ktlint"
        )

        // 5. Configure Ktlint.
        extensions.configure(
            KtlintExtension::class.java
        ) {
            version.set("1.8.0")
            outputToConsole.set(true)
            ignoreFailures.set(false)
        }

        // 6. Configure JUnit Platform.
        tasks.withType(Test::class.java).configureEach {
            useJUnitPlatform()
        }
    }
}
