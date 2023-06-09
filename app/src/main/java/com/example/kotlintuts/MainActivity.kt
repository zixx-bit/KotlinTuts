import com.example.kotlintuts.Circle
import com.example.kotlintuts.Rectangle
import com.example.kotlintuts.Triangle
import com.example.kotlintuts.customTriple

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
//    val division = try {
//        divide(5.0,0.0)
//    } catch (e: DivisionByZeroException){
//        0
//    }
//    println("the result of the division  $division")

    var list: List<Int> = (1..20).toList()
    println(list)
    //lambda function list
    list = list.filter { it>8 }
    println(list)

    val circle = Circle(2.0)
    val circle2 = Circle(5.0)
    val triangle = Triangle(4.2,5.1,6.2)
    val triangle2 = Triangle(1.2,4.5,7.2)
    val rectangle = Rectangle(6.2)
    val rectangle2 = Rectangle(4,4)

    var intergers = (1..10).toList().customFilter { it > 5 }

//    classes with generic type parameters
    val Triple = Triple<Int, String, Boolean>(3, "hello", true) //this is the same as
     val Triple1 = Triple(3,"hello", true)

    var shapes = listOf(circle, circle2, triangle, triangle2, rectangle, rectangle2)
//    lambda function( a function that takes another function as a parameter)
    shapes = shapes.customFilter { it.area() < 20 }.sortedBy { it.area() }

    for (shape in shapes){
        println("${shape.name}: area = ${shape.area()}")
    }
//    classes with generic type parameters
    var customTriple = customTriple<Int, String, Boolean>(3,"hello", true)
    customTriple.printTypes()


}

    class DivisionByZeroException: Exception("You cannot divide by zero. Please choose a different number")
    fun divide(a:Double, b:Double): Double{
        if (b==0.0){
            throw DivisionByZeroException()
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

fun <T> List<T>.customFilter(filterFunction: (T) -> (Boolean)): List<T>{
    val resultList = mutableListOf<T>()
    for (item in this){
        if (filterFunction(item)){
        resultList.add(item)
        }
    }
    return resultList
}


