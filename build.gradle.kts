plugins {
    id("java")
    id("maven-publish")
}

group = "org.example"
version = "1.1.2"

repositories {
    mavenCentral()
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
        }
    }
    repositories {
        maven {
            url = uri("$buildDir/repo")
        }
    }
}

dependencies {
    implementation("org.springframework.boot:spring-boot-autoconfigure:3.4.0")
    implementation("org.springframework.boot:spring-boot-starter-web:3.4.0")
}
