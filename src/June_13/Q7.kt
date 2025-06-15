package June_13

fun main() {
    val items = mapOf("Laptop" to 800, "Mouse" to 300, "Monitor" to 1200)
    println(items.filter { it.value > 500 })
}