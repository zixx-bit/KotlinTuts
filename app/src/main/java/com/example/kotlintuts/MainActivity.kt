

fun main(){
    val Max = getMax(1,2,37,45)
    println("the max number is $Max")

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