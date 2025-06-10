package June_7
fun main() {
    val temperature = 100.0
    val feel = when
    {
        temperature> 80.0 -> "Too Hot"
        temperature in 60.0 ..80.0 ->"Perfect"
        else -> "Too Cold"
    }
        println(feel)
}

