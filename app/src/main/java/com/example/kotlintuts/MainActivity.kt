import com.example.kotlintuts.Circle
import com.example.kotlintuts.Rectangle
import com.example.kotlintuts.Triangle

fun main(){
    val myRect = Rectangle(10.0, 20.0 )
    println("area is ${myRect.area()}")
    println("perimeter is ${myRect.perimeter()}")
    println("is square? is ${myRect.isSquare()}")

    val myCircle= Circle(7.0)
    val myCircle2= Circle(5.0)


    println("area of circle is ${myCircle.area()}")
    println("perimeter of circle is ${myCircle.perimeter()}")

    val myTriangle = Triangle(2.0,4.0,6.0)

}
