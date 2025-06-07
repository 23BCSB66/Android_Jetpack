package Day_3

import kotlin.random.Random

fun main() {
    val tipNumber = Random.nextInt(1, 4)
    val tip = when (tipNumber) {
        1 -> "Always Tip."
        2 -> "Don't forget to Tip"
        3 -> "Please Tip"
        4 -> "Did you Tip though?"
        else -> "Enjoy every sip!"
    }
    println("Coffee tip: $tip")
}
