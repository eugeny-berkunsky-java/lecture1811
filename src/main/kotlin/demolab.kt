import kotlin.math.acos
import kotlin.math.hypot

fun main() {
    // A B C
    val xa  = readLine()!!.toDouble()
    val ya  = readLine()!!.toDouble()
    val xb  = readLine()!!.toDouble()
    val yb  = readLine()!!.toDouble()
    val xc  = readLine()!!.toDouble()
    val yc  = readLine()!!.toDouble()

    val ab = hypot(xa-xb, ya-yb)
    val ac = hypot(xa-xc, ya-yc)
    val bc = hypot(xb-xc, yb-yc)

    // bc*bc = ac*ac + ab*ab - 2*ab*ac*cosa
    val cosa = -(bc*bc - ac*ac - ab*ab) / (2*ab*ac)
    println(acos(cosa))
}
