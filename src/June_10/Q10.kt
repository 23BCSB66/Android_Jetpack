package June_10

fun longest(strings: List<String>): String {
    var longest = ""
    for (str in strings) {
        if (str.length > longest.length) {
            longest = str
        }
    }
    return longest
}

fun main() {
    println("Longest: ${longest(listOf("Superman", "Batman", "Spiderman"))}")
}
