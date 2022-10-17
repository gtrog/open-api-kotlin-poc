package com.rtr.example

import com.rtr.example.api.client.apis.PetsApi

fun main() {
    val client = PetsApi("http://localhost:8080/v1")

    println("Pets before adding")
    println(client.listPets(limit = null))

    client.createPet()
    println("Pets after adding")
    println(client.listPets(limit = null))
}
