package June_13

fun main() {
    val sentence = "Kotlin is a statically typed language"
    val vowels = sentence.lowercase().filter { it in "aeiou" }.toSet()
    println(vowels)
}