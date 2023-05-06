

fun main(){

   val pow = printPow(3,5)
    println("3 to the power of 5 is $pow")


}

fun printPow(base: Int, exponent: Int): Int{
    var result = 1
    for (i in 1..exponent){
        result = result * base
    }
//    println("$base to power $exponent is $result")
    return result

}
