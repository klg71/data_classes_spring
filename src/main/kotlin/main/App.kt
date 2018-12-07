package main

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication


@SpringBootApplication
open class App

fun main(args: Array<String>) {
    SpringApplication(App::class.java).run(*args)
}