

fun main(){
    println("Please enter a number")
    val input = readLine()?.toInt()

    if (input != null){
        if (input.isPrime()){

        }
        println("$input")

    }
}

fun Int.isPrime(): Boolean{
    for (i in 2 until this-1){
        if (this % 1 == 0){
            return false
        }
    }
    return true
}
