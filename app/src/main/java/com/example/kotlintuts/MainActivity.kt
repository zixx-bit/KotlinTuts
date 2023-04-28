package com.example.kotlintuts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
fun main(){
    var ageGrup: Int = 5
    println(ageGrup)
    val x = 5;
    val y=10;
    val result= x+ y;
    val name = "edward michira"
    val age = 27

        println( name.reversed()   + age);
}