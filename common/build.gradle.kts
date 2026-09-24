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
}

tasks.test {
    useJUnitPlatform()
}