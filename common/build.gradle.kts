plugins {
    id("java-library")
    id("chirp.spring-boot-service")
}

group = "com.prekogdevs"
version = "unspecified"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    api(libs.kotlin.reflect)
    api(libs.jackson.module.kotlin)
}

tasks.test {
    useJUnitPlatform()
}