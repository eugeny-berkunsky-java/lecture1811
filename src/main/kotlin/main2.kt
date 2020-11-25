fun main() {
    val list = (IntArray(10) {(-20..20).random()}).toList()
    println(list)
    val res = findNotNegatives(list)
    println(res)

    val res2 = list.filter { x -> x>=0 }
    println(res2)

    val evenList = list.filter { x -> x%2 == 0 }
    println(evenList)
}

fun findNotNegatives(list: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    for (x in list) {
        if (x>=0) result += x
    }
    return result
}
