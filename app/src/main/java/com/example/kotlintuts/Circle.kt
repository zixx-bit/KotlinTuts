package com.example.kotlintuts

import kotlin.random.Random

class Circle(val radius: Double): Shape("rose") {
    fun randomCircle(): Circle {
        val radius = Random.nextDouble(1.0,10.0)
        return Circle(radius)
    }

    companion object{
        fun randomCircle(): Circle {
            val radius = Random.nextDouble(1.0,10.0)
            return Circle(radius)
        }

    }
    init {
        println("circle created with radius = $radius")
    }



    override fun area(): Double = radius * radius * ImportantNumbers.PI
    override fun perimeter(): Double = 2 * radius * ImportantNumbers.PI
}