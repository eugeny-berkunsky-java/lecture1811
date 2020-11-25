fun main() {
    val y = readLine()!!.toDouble()
    val result = (1.7*t(0.25) + 2*t(1+y))/(6-t(y*y-1))
    println("result = $result")
}

fun t(x:Double) : Double {
    return chisl(x) / znam(x)
}

fun znam(x: Double): Double {
    var a = 1.0
    var b = 1
    var sum = a/b
    for (k in 1..10) {
        a *= x * x
        b *= (2 * k) * (2 * k - 1)
        sum += a/b
    }
    return sum
}

// k = 0 -> a0 = x^0 = 1
// k = 1 -> a1 = x^2 = a0 * x^2
// k = 2 -> a2 = x^4 = a1 * x^2

// k = 0 -> b0 = 0! = 1
// k = 1 -> b1 = 2! = 0! * 1 * 2    b1 = b0 * (k*2-1)*(k*2)
// k = 2 -> b2 = 4! = 2! * 3 * 4    b2 = b1 * (k*2-1)*(k*2)
// k = 3 -> b3 = 6! = 4! * 5 * 6    b3 = b2 * (k*2-1)*(k*2)

fun chisl(x: Double): Double {
    var a = x
    var b = 1
    var sum = a/b
    for (k in 1..10) {
        a *= x * x
        b *= (2 * k) * (2 * k + 1)
        sum += a/b
    }
    return sum
}
// k = 0 -> a0 = x^1 = x
// k = 1 -> a1 = x^3 = a0 * x^2
// k = 2 -> a2 = x^5 = a1 * x^2

// k = 0 -> b0 = 1! = 1
// k = 1 -> b1 = 3! = 1 * 2 * 3 = 1! * 2 * 3 = b0 * 2 * 3   b1 = b0 * (2*k)*(2*k+1)
// k = 2 -> b2 = 5! = b1 * 4 * 5                            b2 = b1 * (2*k)*(2*k+1)
// k = 3 -> b3 = 7! = b2 * 6 * 7                            b3 = b2 * (2*k)*(2*k+1)