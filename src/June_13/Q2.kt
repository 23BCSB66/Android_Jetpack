package June_13

fun main() {
    val fruits = mutableListOf("Mango", "Apple", "Melon", "Banana")
    fruits.removeAll { it.startsWith("M") }
    println(fruits)
}