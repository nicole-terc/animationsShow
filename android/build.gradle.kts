plugins {
    id("org.jetbrains.compose")
    id("com.android.application")
    kotlin("android")
}

group "nstv.animationshow"
version "1.1"

repositories {
    jcenter()
}

dependencies {
    implementation(project(":common"))
    implementation("androidx.activity:activity-compose:1.5.0")
}

android {
    compileSdkVersion(33)
    defaultConfig {
        applicationId = "nstv.animationshow.android"
        minSdk = 24
        targetSdk = 33
        versionCode = 2
        versionName = "1.1"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}
