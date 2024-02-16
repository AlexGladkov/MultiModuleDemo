pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "MultiModuleDemo"
include(":app")
include(":feed")
include(":featureA:api")
include(":featureA:data")
include(":featureA:domain")
include(":featureA:presentation")
include(":featureB")
include(":utils")
include(":core:network")
include(":core:parser")
include(":core:database")
include(":core:navigation")
