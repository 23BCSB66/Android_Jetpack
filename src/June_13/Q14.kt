package June_13

fun main() {
    val list = listOf("a", "b", "c")
    list.forEachIndexed { index, value -> println("$index: $value") }
}