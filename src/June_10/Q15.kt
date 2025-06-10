package June_10
fun main() {
    val nullableStr: String? = "Batman"

    println(nullableStr!!.length)

    println(nullableStr?.length)

    println(nullableStr ?: "Default")
}
