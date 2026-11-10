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

includeBuild("build-logic")
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

includeBuild("build-logic")

// Foundation modules
include(
    ":foundation:foundation-common",
    ":foundation:foundation-errors",
    ":foundation:foundation-collections",
    ":foundation:foundation-io",
    ":foundation:foundation-memory",
    ":foundation:foundation-concurrency",
    ":foundation:foundation-testing"
)
