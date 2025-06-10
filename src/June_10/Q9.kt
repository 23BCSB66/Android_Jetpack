package June_10
fun factorial(n: Int): Int {
    return if (n <= 1) 1 else n * factorial(n - 1)
}

fun main() {
    println("Factorial of 5: ${factorial(5)}")
}
