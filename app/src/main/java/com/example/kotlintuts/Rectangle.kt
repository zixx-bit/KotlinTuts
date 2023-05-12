package com.example.kotlintuts

class Rectangle(val a: Double,val b: Double): Shape("Rectangle"){
    constructor(a: Double):this(a, a)

    constructor(a:Int, b:Int): this(a.toDouble(), b.toDouble())
    init {
        println("$name created with a= $a and b = $b is ")
    }

    override fun area(): Double = a * b

    override fun perimeter(): Double = 2 * a +2*b

    fun isSquare() = a==b
}