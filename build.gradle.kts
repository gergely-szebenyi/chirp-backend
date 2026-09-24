plugins {
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.kotlin.spring) apply false
    alias(libs.plugins.spring.boot) apply false
    alias(libs.plugins.spring.dependency.management) apply false
    alias(libs.plugins.kotlin.jpa) apply false
}

group = "com.prekogdevs"
version = "0.0.1-SNAPSHOT"

// submodules in the project (user, app etc.)
subprojects {
    group = rootProject.group
    version = rootProject.version
}