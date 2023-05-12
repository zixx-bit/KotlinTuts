package com.example.kotlintuts

class Circle(val radius: Double): Shape("rose") {
  private val pi=3.142
    init {
        println("circle created with radius = $radius")
    }

    override fun area(): Double {
        val result = radius * radius * pi
        return result

    }

    override fun area() = radius * radius * pi
    override fun perimeter() = 2 * radius * pi
}