package June_13

fun main() {
    val list = listOf(1, 2, 3)
    try {
        println(list[5])
    } catch (e: Exception) {
        println("Error: ${e.message}")
    } finally {
        println("End of operation")
    }
}