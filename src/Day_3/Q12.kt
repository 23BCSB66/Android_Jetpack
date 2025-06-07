package Day_3

fun main() {
    val price = 17.0
    val message = when {
        price < 5 -> "Fair Price"
        price in 5.0..10.0 -> "Why so costly?!"
        else -> "Rich People stuff"
    }
    println(message)
}
