package Day_4

fun main() {
    val names = mutableListOf("Asish", "Baba", "Anna", "Watata", "Amla")
    names.removeAll { it.startsWith(prefix = "A") }
    println("Filtered Names: $names")
}
