package June_7
fun main() {
    val day = 8
    val recommendation = when(day) {
        1 -> "Mocha!"
        2 -> "Cappuccino!"
        3 -> "Latte!"
        4 -> "Espresso!"
        5 -> "Frappuccino!"
        6 -> "Cold Coffee!"
        7 -> "Black Coffee!"
        else -> "Have Tea instead"
    }
    println(recommendation)
}
