
plugins {
    kotlin("jvm") version "1.3.0"
    id ("org.springframework.boot") version "2.1.1.RELEASE"
}

apply(plugin = "io.spring.dependency-management")

dependencies {
    compile(kotlin("stdlib"))
    compile("org.jetbrains.kotlin:kotlin-reflect:1.3.10")
    compile("org.springframework.boot:spring-boot-starter-data-rest")
    compile("org.springframework.boot:spring-boot-starter-data-jpa")

    runtime("com.h2database:h2:1.4.197")
}

repositories {
    jcenter()
}
