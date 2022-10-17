package com.rtr.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PetStoreApplication

fun main(args: Array<String>) {
    runApplication<PetStoreApplication>(*args)
}
