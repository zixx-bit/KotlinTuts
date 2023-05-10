package com.example.kotlintuts

open class Shape(var name: String) {
    init {
        println("I am a super class")
    }
    fun changeName(newName: String){
        name = newName
    }
}