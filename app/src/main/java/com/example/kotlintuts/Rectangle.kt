package com.example.kotlintuts

class Rectangle(val a: Double,val b: Double){
    init {
        var result = a*b
        println("Reactangle created with a= $a and b = $b is $result")
    }
}