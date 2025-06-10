package June_10

fun formatName(first: String = "", last: String = ""): String {
    return "$first $last".trim()
}

fun main() {
    println("Full Name: ${formatName("Bruce", "Wayne")}")
}