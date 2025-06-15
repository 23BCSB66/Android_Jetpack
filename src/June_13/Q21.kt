package June_13

fun main() {
    val str = "abc"
    try {
        val num = str.toInt()
        println(num)
    } catch (e: NumberFormatException) {
        println("Invalid number format")
    }
}