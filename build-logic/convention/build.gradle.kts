plugins {
    `kotlin-dsl`
}

group = "com.mris.pdf.buildlogic"

dependencies {
    implementation("com.android.application:com.android.application.gradle.plugin:8.5.2")
    implementation("com.android.library:com.android.library.gradle.plugin:8.5.2")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.24")
}

gradlePlugin {
    plugins {
        register("mrisKotlinLibrary") {
            id = "mris.kotlin.library"
            implementationClass = "MrisKotlinLibraryPlugin"
        }
        register("mrisKotlinTest") {
            id = "mris.kotlin.test"
            implementationClass = "MrisKotlinTestPlugin"
        }
        register("mrisEngineModule") {
            id = "mris.engine.module"
            implementationClass = "MrisEngineModulePlugin"
        }
        register("mrisPublishing") {
            id = "mris.publishing"
            implementationClass = "MrisPublishingPlugin"
        }
    }
}
