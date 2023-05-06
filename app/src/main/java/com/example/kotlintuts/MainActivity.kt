

fun main(){
    println("which country are you from")
    val country = readln()

    when(country){
        "India" -> println("Namastte")
        "Russia" -> println("Privet")
        "Usa" -> println("Hello")
        else -> println("I dont know that")
    }
}