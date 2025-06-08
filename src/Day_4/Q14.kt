package Day_4
 fun maxOrMinusOne(list: List<Int>?): Int {
    return list?.maxOrNull() ?: -1
}

fun main() {
    println("Max: ${maxOrMinusOne(listOf(1, 2, 3))}")
    println("Max: ${maxOrMinusOne(null)}")
}
