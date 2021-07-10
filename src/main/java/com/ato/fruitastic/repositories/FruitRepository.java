package com.ato.fruitastic.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

import com.ato.fruitastic.entities.Fruit;

@RepositoryRestResource(collectionResourceRel = "fruits", path = "fruits")
public interface FruitRepository extends PagingAndSortingRepository<Fruit, Long> {
  List<Fruit> findByName(@Param("name") String name);
}
