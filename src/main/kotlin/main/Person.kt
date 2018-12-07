package main

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.validation.constraints.NotEmpty

@Entity
data class Person(@Id @GeneratedValue var id: Long? = null,
                  @NotEmpty var name: String = "")
