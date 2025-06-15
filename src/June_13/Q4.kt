package June_13

fun main() {
    val names = listOf("Asish", "Ronaldo", "Messi", "Kaka")
    println(names.count { it.length > 5 })
}