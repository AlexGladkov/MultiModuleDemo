plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "tech.mobiledeveloper.feature_a.api"

    defaultConfig {
        compileSdk = 34
    }
}

dependencies {
    implementation(project(":core:navigation"))
}