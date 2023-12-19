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

rootProject.name = "HelloWorld"
include(":app")
include(":mod6intentexplicite")
include(":mod6intentimplicite")
include(":mod6permission")
include(":mod7cycledevie")
include(":mod8viewmodel")
include(":mod8tpdice")
