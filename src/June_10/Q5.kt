package June_10
fun main() {
    val input: Any = 21
    val age: Int? = if (input is Int) input else null
    if (age != null) {
        println("Age: " + age)
    } else {
        println("Not an Int")
    }
}
