
pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(
        RepositoriesMode.FAIL_ON_PROJECT_REPOS
    )

    repositories {
        mavenCentral()
    }
}

rootProject.name = "MRIS-Independent-PDF-Engine"

// Build Logic
includeBuild("build-logic")

// Foundation Modules
include(
    ":foundation:foundation-common",
    ":foundation:foundation-errors",
    ":foundation:foundation-collections",
    ":foundation:foundation-io",
    ":foundation:foundation-memory",
    ":foundation:foundation-concurrency",
    ":foundation:foundation-testing"
)
