package June_13

fun main() {
    val set = setOf(1, 2, 3, 4)
    val element = 3
    println(if (element in set) "Exists" else "Does not exist")
}