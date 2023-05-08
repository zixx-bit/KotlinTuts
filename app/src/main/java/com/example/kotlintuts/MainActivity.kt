import com.example.kotlintuts.Rectangle

fun main(){
    val myRect = Rectangle(10.0, 20.0 )
    println("area is ${myRect.area()}")
    println("perimeter is ${myRect.perimeter()}")
    println("is square? is ${myRect.isSquare()}")

}
