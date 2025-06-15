package June_13

fun main() {
    val employees = mapOf("Asish" to "HR", "Sana" to "IT", "Nirjhar" to "Finance")
    for ((name, dept) in employees) {
        println("$name -> $dept")
    }
}