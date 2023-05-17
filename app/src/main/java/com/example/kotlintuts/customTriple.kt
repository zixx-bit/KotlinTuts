package com.example.kotlintuts

class customTriple<A:Any, B:Any, C:Any>( var first:A, var second:B, var third: C) {
    fun printTypes(){
        println("the type of first is ${first::class}")
        println("the type of second is ${second::class}")
        println("the type of third is ${third::class}")
    }
}