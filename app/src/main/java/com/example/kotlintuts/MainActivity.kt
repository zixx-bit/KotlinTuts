//package com.example.kotlintuts
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
////
//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//    }
//}
fun main(){
  val myArray = arrayOf(4,5,6,11,3)
    var max = myArray[0]
    for (item in myArray){
        if (item > max){
            max = item
        }
    }

    println(max)
}