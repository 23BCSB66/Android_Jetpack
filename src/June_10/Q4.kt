package June_10

fun main() {
    val words = listOf("apple", "pineapple", "je m'appelle", "ple", "le")
    val count = words.count { it.length > 4 }
    println("Words with mre than 4 characters: $count")
}

