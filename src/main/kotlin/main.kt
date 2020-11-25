import java.math.BigInteger
import kotlin.math.max
// k! * n!
fun main() {
//    val k = readLine()!!.toInt()
//    println("$k! = ${factorial(k)}")
////    factorial(7)
    val a = IntArray(11) { (1..100).random() }
    printArray(a)
    reverseArray(a)
    printArray(a)
}

fun reverseArray(array: IntArray) {
    for (i in 0 until array.size/2) {
        val t = array[i]
        array[i] = array[array.size-1-i]
        array[array.size-1-i] = t
    }
}

fun printArray(array: IntArray) {
    for (x in array) print("$x ")
    println()
}

fun factorial(n: Int) : BigInteger {
    var result = BigInteger.ONE
    for (i in 1..n) {
        result *= i.toBigInteger()
    }
    return  result
}
