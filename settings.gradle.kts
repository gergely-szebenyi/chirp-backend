plugins {
	id("org.gradle.toolchains.foojay-resolver-convention") version "0.9.0"
}
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
rootProject.name = "Chirp"
includeBuild("build-logic")
include("app")
include("user")
include("chat")
include("notification")
include("common")