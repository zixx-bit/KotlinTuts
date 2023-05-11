package com.example.kotlintuts
 abstract class Shape(var name: String) {
    init {
        println("I am a super class")
    }
    fun changeName(newName : String ){
        name = newName
    }

     abstract fun area()

     abstract fun perimeter()
}