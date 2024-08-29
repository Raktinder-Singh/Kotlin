import kotlin.math.pow

fun amstrongCheck(input: Int): Boolean{
    val digits = input.toString().map{it.toString().toInt()}
    
    val digitSize = digits.size
    
    val sum = digits.sumOf{digit -> digit.toDouble().pow(digitSize)}
    
    return sum.toInt() == input
}

fun main() {
    val number = 154
    if(amstrongCheck(number)){
        println("$number is an armstrong number")
    }else{
        println("$number is not an armstrong number")
    }
}