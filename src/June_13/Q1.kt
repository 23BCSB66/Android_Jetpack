package June_13

fun main() {
    val numbers = (1..20).toList()
    println(numbers.filter { it % 2 == 0 })
}