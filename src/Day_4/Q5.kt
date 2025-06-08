package Day_4

fun main() {
    val list = listOf(23, 12, 45, 11, 98)
    val sq = mutableListOf<Int>()
    for (num in list) {
        sq.add(num * num)
    }
    println("Squared Numbers: $sq")
}

