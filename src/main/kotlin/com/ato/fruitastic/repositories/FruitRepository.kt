package com.ato.fruitastic.repositories

import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.data.repository.PagingAndSortingRepository
import com.ato.fruitastic.entities.Fruit
import org.springframework.data.repository.query.Param

@RepositoryRestResource(collectionResourceRel = "fruits", path = "fruits")
interface FruitRepository : PagingAndSortingRepository<Fruit?, Long?> {
    fun findByName(@Param("name") name: String?): List<Fruit?>?
}