

fun main(){
    printPow(2,2)
    printPow(100,4)


}

fun printPow(base: Int, exponent: Int){
    var result = 1
    for (i in 1..exponent){
        result = result * base
    }
    println("$base to power $exponent is $result")

}
