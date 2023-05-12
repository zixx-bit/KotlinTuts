package com.example.kotlintuts

import kotlin.random.Random

class Circle(val radius: Double): Shape("rose") {

    companion object{
        fun randomCircle(): Circle {
            val radius = Random.nextDouble(1.0,10.0)
            return Circle(radius)
        }

    }
    init {
        println("circle created with radius = $radius")
    }

    override fun area(): Double {
        val result = radius * radius * ImportantNumbers.PI
        return result

    }

    override fun area() = radius * radius * ImportantNumbers.PI
    override fun perimeter() = 2 * radius * ImportantNumbers.PI
}