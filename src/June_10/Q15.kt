package June_10
class MathUtils {
    companion object {
        fun square(n: Double): Double {
            return n * n
        }
    }
}

fun main() {
    val result = MathUtils.square(2.4)
    println("Area: " + result)
}
