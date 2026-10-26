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
    implementation(libs.spring.boot.starter.amqp)
    implementation(libs.spring.boot.starter.security)
}

tasks.test {
    useJUnitPlatform()
}