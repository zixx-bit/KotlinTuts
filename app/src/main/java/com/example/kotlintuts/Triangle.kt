package com.example.kotlintuts

import kotlin.math.sqrt

class Triangle(val a:Double, val b:Double, val c:Double) : Shape( "Edd"){
    init {
        println("The area of triangle is ${area()} with " + changeName("Rose"))
        println("The perimeter of triangle is ${perimeter()}")
    }


    fun area()= 0.5 * a * b *c


    fun perimeter() = 0.5 * 2.0*a+2.0*b
}