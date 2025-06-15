package June_13

fun main() {
    val isPalindrome: (String) -> Boolean = { it == it.reversed() }
    println(isPalindrome("level"))
}