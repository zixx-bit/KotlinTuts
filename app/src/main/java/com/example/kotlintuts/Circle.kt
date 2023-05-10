package com.example.kotlintuts

class Circle(val radius: Double): Shape("rose") {
   val pi=3.142
    init {
        println("circle created with radius = $radius")
    }

    fun area() = radius * radius * pi
    fun perimeter() = 2 * radius * pi
}