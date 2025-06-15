package June_13

fun main() {
    val numbers = (1..5).toList()
    val factorial = numbers.reduce { acc, i -> acc * i }
    println(factorial)
}