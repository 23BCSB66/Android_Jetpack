package June_10
fun getLength(input: String?): Int
{
    if (input != null) {
        return input.length
    }
    return 0
}

fun main() {
    val str: String? = "Hello"
    println("Length of string: " + getLength(str))
}

