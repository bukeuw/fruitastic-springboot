package com.ato.fruitastic.entities

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.util.*
import javax.persistence.*
import javax.validation.constraints.NotEmpty

@Entity
class Fruit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0
    var name: @NotEmpty String? = null

    @CreatedDate
    var createdAt: Date? = null

    @LastModifiedDate
    var updatedAt: Date? = null
}