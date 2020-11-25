import kotlin.math.abs
import kotlin.math.sin

fun main() {
    val (s,t) = readLine()!!.split(" ").map(String::toDouble)
    val result = f(t, -2*s, 1.17) + f(2.2, t, s-t)
    println("result = $result")
}

fun f(a:Double, b:Double, c:Double) = (2*a-b-sin(c))/(5+abs(c))