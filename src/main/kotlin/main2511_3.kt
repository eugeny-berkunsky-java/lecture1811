import kotlin.math.max

fun main() {
    val (a,b,c) = readLine()!!.split(" ").map(String::toDouble)
    val result = (max(a,a+b) + max(a, b+c)) / (1 + max(a+b*c, 1.0, 15.0))
    println("result = $result")
}

fun max(x: Double, y:Double, z:Double) = if (x>y && x>z) x else if (y>z) y else z