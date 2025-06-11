package June_10

fun main() {
    val name: String? = "Asish"
    if (name != null) {
        val upper = name.uppercase()
        println(upper)
    } else {
        println("Name is null")
    }
}
