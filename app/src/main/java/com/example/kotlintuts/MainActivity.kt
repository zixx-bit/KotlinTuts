

fun main(){
    var numbers = readLine()?.toInt()
   var result = getMax()
    println(result)
  searchFor("how to become a good progmmer")
    searchFor("how to become a good programmer", "bing")

}
fun searchFor(search: String, searchEngine: String = "Google"){
    println("seraching for '$search' on $searchEngine")
}
fun getMax(vararg numbers: Int): Int{
    var max = numbers[0]
    for (i in numbers){
        if (i > max){
            max = i
        }
    }
    return max
}