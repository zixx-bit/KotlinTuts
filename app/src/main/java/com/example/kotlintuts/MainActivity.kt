import com.example.kotlintuts.Circle
import com.example.kotlintuts.Rectangle
import com.example.kotlintuts.Triangle

fun main(){
//    val myRect = Rectangle(10.0, 20.0 )
//    println("area is ${myRect.area()}")
//    println("perimeter is ${myRect.perimeter()}")
//    println("is square? is ${myRect.isSquare()}")
//
//    val myCircle = Circle(7.0)
//    myCircle.changeName("pter")
//    println("area of circle is ${myCircle.area()} and ${myCircle.name}")
//    println("perimeter of circle is ${myCircle.perimeter()}")
//
//    val myTriangle = Triangle(2.0,4.0,6.0)
//    val myc = Circle
//    val c = myc.randomCircle()
//
//    val list = listOf(1,2,3,4,5)
//    val array = arrayOf(1,2,3,4,5)
//
//    println("List: $list")
//    printAlternately(array)

//    println("Please enter a number")
//    val input = try {
//        readln()?.toInt()
//
//    }catch (e: NumberFormatException){
//        0
//    }finally {
//        println("this is the final block")
//    }
//    println("You entered : $input")
//
    val division = try {
        divide(5.0,6.0)
    } catch (e: DivisionByZero){

    }
}

    class DivisionByZero: Exception("You cannot divide by zero. Please choose a different number")
    fun divide(a:Double, b:Double): Double{
        if (b==0.0){
            throw DivisionByZero()
        }
        return a/b
    }

    fun printAlternately(list: List<Int>){
        var i = 0
        var j = list.size-1
        var toggle = true

        while (i <= j) {
            if (toggle){
                println(list[i])
                i++
            } else{
                println(list[j])
                i--
            }
            toggle = !toggle
        }
    }

    fun printAlternately(array: Array<Int>){
        var i = 0
        var j = array.size-1
        var toggle = true

        while (i <= j) {
            if (toggle){
                println(array[i])
                i++
            } else{
                println(array[j])
                i--
            }
            toggle = !toggle
        }
    }


