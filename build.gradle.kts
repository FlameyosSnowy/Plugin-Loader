
plugins {
    id("java")
    id("com.github.johnrengelman.shadow") version("7.1.0")
}

group = "io.github.cobeine"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/papermc")
    maven("https://repo.papermc.io/repository/maven-public/")
    maven("https://oss.sonatype.org/content/repositories/snapshots")
}

dependencies {
    compileOnly("org.projectlombok:lombok:1.18.26")
    compileOnly("com.velocitypowered:velocity-api:3.3.0-SNAPSHOT")
    compileOnly ("net.md-5:bungeecord-api:1.19-R0.1-SNAPSHOT")
    compileOnly("io.papermc.paper:paper-api:1.19.4-R0.1-SNAPSHOT")

    annotationProcessor("com.velocitypowered:velocity-api:3.3.0-SNAPSHOT")
    annotationProcessor("org.projectlombok:lombok:1.18.26")



}

tasks.shadowJar {
    archiveClassifier.set("")
    archiveFileName.set("PluginLoader-${project.version}.jar")
    exclude("org/checkerframework/")
    exclude("META-INF/**")

}
apply(plugin = "java")
apply(plugin = "com.github.johnrengelman.shadow")

