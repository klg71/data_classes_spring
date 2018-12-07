package main

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.web.bind.annotation.RequestParam

@RepositoryRestResource(path = "person")
interface PersonRepository : JpaRepository<Person, Long> {
    fun findByNameContaining(@RequestParam("name") name: String): List<Person>
}