plugins {
    base
    alias(libs.plugins.ktlint) apply false
}

allprojects {
    group = "com.mris.pdf"
    version = "0.1.0-SNAPSHOT"
}

subprojects {
    apply(plugin = "org.jlleitschuh.gradle.ktlint")

    extensions.configure<
        org.jlleitschuh.gradle.ktlint.KtlintExtension
    > {
        version.set("1.8.0")
        outputToConsole.set(true)
        ignoreFailures.set(false)
    }
}
