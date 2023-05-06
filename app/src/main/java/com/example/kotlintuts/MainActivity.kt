

fun main(){
    println("which country are you from")
    val Country = readln()

    when(Country){
        "India" -> println("Namastte")
        "Russia" -> println("Privet")
        "Usa" -> println("Hello")
        else -> println("I dont know that")
    }
}