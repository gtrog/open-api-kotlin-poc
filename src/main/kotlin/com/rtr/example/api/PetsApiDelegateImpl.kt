package com.rtr.example.api

import com.rtr.example.model.Pet
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class PetsApiDelegateImpl : PetsApiDelegate {
    var petId = 0L
    val pets = mutableMapOf<Long, Pet>()

    override fun createPet(): ResponseEntity<Unit> {
        val newId = petId++

        pets[newId] = Pet(
            newId,
            "Pet #${newId}",
            null
        )

        return ResponseEntity.ok().build()
    }

    override fun listPets(limit: Int?): ResponseEntity<List<Pet>> {
        return ResponseEntity.ok(pets.values.toList())
    }

    override fun showPetById(petId: Long): ResponseEntity<Pet> {
        val pet = pets[petId] ?: return ResponseEntity.notFound().build()
        return ResponseEntity.ok(pet)
    }
}
