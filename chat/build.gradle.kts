plugins {
    id("java-library")
    id("chirp.spring-boot-service")
    kotlin("plugin.jpa")
}

group = "com.prekogdevs"
version = "unspecified"

repositories {
    mavenCentral()
}

dependencies {
    implementation(projects.common)
    implementation(libs.spring.boot.starter.amqp)
    implementation(libs.spring.boot.starter.websocket)
    implementation(libs.spring.boot.starter.data.jpa)
    runtimeOnly(libs.postgresql)
    implementation(libs.spring.boot.starter.validation)
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}