plugins {
    id("java")
    id("io.qameta.allure") version "2.11.2"
}

group = "io.rest-assured"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // JUnit
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    testImplementation("org.junit.jupiter:junit-jupiter:5.12.2")
    testImplementation("org.junit.platform:junit-platform-suite:1.12.2")

    // Cucumber
    testImplementation("io.cucumber:cucumber-java:7.18.1")
    testImplementation("io.cucumber:cucumber-junit-platform-engine:7.18.1")
    testImplementation("io.cucumber:cucumber-picocontainer:7.18.1")

    // RestAssured
    testImplementation("io.rest-assured:rest-assured:5.5.1")

    // Selenide + WebDriverManager
    testImplementation("com.codeborne:selenide:7.7.2")
    testImplementation("io.github.bonigarcia:webdrivermanager:6.1.0")

    // Jackson
    implementation("com.fasterxml.jackson.core:jackson-databind:2.19.0")

    // Lombok
    compileOnly("org.projectlombok:lombok:1.18.38")
    annotationProcessor("org.projectlombok:lombok:1.18.38")

    // Allure
    testImplementation(platform("io.qameta.allure:allure-bom:2.29.1"))
    testImplementation("io.qameta.allure:allure-junit5")
    testImplementation("io.qameta.allure:allure-cucumber7-jvm")

    // Testcontainers + MySQL
    testImplementation("org.testcontainers:testcontainers:1.20.6")
    testImplementation("org.testcontainers:mysql:1.20.6")

    // Flyway
    implementation("org.flywaydb:flyway-core:11.8.2")

    // Logging
    testImplementation("org.slf4j:slf4j-simple:2.0.17")

    // MySQL driver
    implementation("com.mysql:mysql-connector-j:9.3.0")
}

allure {
    version = "2.29.1"   // matches your BOM
    autoconfigure = true
    aspectjweaver = true
}

tasks.test {
    useJUnitPlatform()
    systemProperty("cucumber.plugin",
        "pretty," +
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm")
    systemProperty("allure.results.directory", "$buildDir/allure-results")
}
