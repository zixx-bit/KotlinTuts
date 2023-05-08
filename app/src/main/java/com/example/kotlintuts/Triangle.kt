package com.example.kotlintuts

class Triangle(val a:Double, val b:Double, val c:Double) {
    init {
        println("The area of triangle is ${area()}")
        println("The perimeter of triangle is ${perimeter()}")
    }


    fun area()= 0.5 * a * b *c


    fun perimeter() = 0.5 * 2.0*a+2.0*b
}