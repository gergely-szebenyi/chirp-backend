plugins {
	id("org.gradle.toolchains.foojay-resolver-convention") version "0.9.0"
}

rootProject.name = "Chirp"

include("app")
include("user")
include("chat")
include("notification")
include("common")