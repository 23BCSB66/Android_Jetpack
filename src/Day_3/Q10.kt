package Day_3

fun main() {
    val caffeineLevel = 64
    val strength = when (caffeineLevel) {
        in 0..33 -> "Mild"
        in 34..66 -> "Medium"
        in 67..100 -> "Strong"
        else -> "Unknown strength"
    }
    println("Coffee strength: $strength")
}
