package June_10
fun mul(numberStr: String?)
{
    if (numberStr != null)
    {
        val number = numberStr.toIntOrNull()
        if (number != null)
        {
            val result = number * 2
            println("Multiplied: $result")
        }
        else
        {
            println("Multiplied: Invalid number")
        }
    }
}

fun main() {
    mul("123")
}
