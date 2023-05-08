package com.example.kotlintuts

class Rectangle(val a: Double,val b: Double){
    init {

        println("Reactangle created with a= $a and b = $b is ")
    }

    fun area() = a * b

    fun perimeter() = 2 * a +2*b

    fun isSquare() = a==b
}