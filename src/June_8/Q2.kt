package June_8

fun main() {
    val names = mutableListOf("Asish", "Baba", "Anna", "Watata", "Amla")
    val result = mutableListOf<String>()
    for (name in names) {
        if (name.length > 0 && name[0] != 'A') {
            result.add(name)
        }
    }
    println(result)
}
