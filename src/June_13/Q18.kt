package June_13

fun main() {
    val numbers = listOf(1, 2, 3, 6, 4, 5)
    println("takeWhile < 5: ${numbers.takeWhile { it < 5 }}")
    println("dropWhile < 5: ${numbers.dropWhile { it < 5 }}")
}