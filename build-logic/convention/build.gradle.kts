plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

dependencies {
    implementation(
        "org.jetbrains.kotlin:kotlin-gradle-plugin:2.4.21"
    )
}

gradlePlugin {
    plugins {
        register("mrisKotlinLibrary") {
            id = "com.mris.kotlin-library"
            implementationClass =
                "MrisKotlinLibraryPlugin"
        }

        register("mrisKotlinTest") {
            id = "com.mris.kotlin-test"
            implementationClass =
                "MrisKotlinTestPlugin"
        }

        register("mrisEngineModule") {
            id = "com.mris.engine-module"
            implementationClass =
                "MrisEngineModulePlugin"
        }

        register("mrisPublishing") {
            id = "com.mris.publishing"
            implementationClass =
                "MrisPublishingPlugin"
        }
    }
}
