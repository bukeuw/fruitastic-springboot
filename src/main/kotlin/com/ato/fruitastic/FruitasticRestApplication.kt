package com.ato.fruitastic

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FruitasticRestApplication

fun main(args: Array<String>) {
	runApplication<FruitasticRestApplication>(*args)
}
