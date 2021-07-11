package com.ato.fruitastic.entities

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.util.*
import javax.persistence.*
import javax.validation.constraints.NotEmpty

@Entity
@EntityListeners(value = [FruitDateListener::class])
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

class FruitDateListener {
    @PrePersist
    fun setCreatedAt(fruit: Fruit) {
        fruit.createdAt = Date()
        fruit.updatedAt = Date()
    }

    @PreUpdate
    fun setUpdatedAt(fruit: Fruit) {
        fruit.updatedAt = Date()
    }
}