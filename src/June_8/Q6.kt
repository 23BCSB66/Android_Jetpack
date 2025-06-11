package June_8
fun sumOfOdd(numbers: List<Int>): Int {
    var sum = 0
    for (num in numbers) {
        if (num % 2 != 0) {
            sum += num
        }
    }
    return sum
}

fun main() {
    println("Sum of Odd: ${sumOfOdd(listOf(1, 2, 3, 4, 5))}")
}
