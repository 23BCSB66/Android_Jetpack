package Day_4

fun main() {
    val n = (1..10).toList()
    val even = mutableListOf<Int>()
    for (num in n) {
        if (num % 2 == 0) {
            even.add(num)
        }
    }
    println("Even Numbers: $even")
}
