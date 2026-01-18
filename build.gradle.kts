plugins {
    id("java")
    id("net.wiredtomato.hygradle") version "0.2.2"
}

group = "net.wiredtomato"
version = "1.0.0"

val pluginGroup: String by properties
val pluginId: String by properties
val pluginDescription: String by properties
val author: String by properties
val email: String by properties
val authorWebsite: String by properties
val pluginWebsite: String by properties

hytale {
    stripHytaleJar = true
    serverArgs.addAll("--bind", "127.0.0.1:7878")
}

repositories {
    mavenCentral()
}

dependencies {

}

var props = mapOf(
    "version" to project.version,
    "pluginId" to pluginId,
    "pluginGroup" to pluginGroup,
    "pluginDescription" to pluginDescription,
    "author" to author,
    "email" to email,
    "authorWebsite" to authorWebsite,
    "pluginWebsite" to pluginWebsite
)

tasks.getByName<ProcessResources>("processResources") {
    inputs.properties(props)
    inputs.files(file("src/main/resources/manifest.json"))

    filesMatching("manifest.json") {
        expand(props)
    }
}
