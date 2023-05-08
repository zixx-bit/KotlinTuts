import com.example.kotlintuts.Circle
import com.example.kotlintuts.Rectangle

fun main(){
    val myRect = Rectangle(10.0, 20.0 )
    println("area is ${myRect.area()}")
    println("perimeter is ${myRect.perimeter()}")
    println("is square? is ${myRect.isSquare()}")

    val myCircle= Circle(7.0)
    println("area of circle is ${myCircle.area()}")
    println("perimeter of circle is ${myCircle.perimeter()}")

}
