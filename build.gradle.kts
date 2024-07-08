// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    id("androidx.navigation.safeargs.kotlin") version "2.6.0" apply false

}

buildscript {
    repositories {
        google()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:7.0.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.31")
        val nav_version = "2.7.7"
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version")

    }

    extra["lifecycle_version"] = "2.3.1"
    extra["room_version"] = "2.3.0"

}

task<Delete>("clean") {
    delete(rootProject.buildDir)
}