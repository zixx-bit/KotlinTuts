package com.example.kotlintuts

class Circle(val radius: Double): Shape("rose") {
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