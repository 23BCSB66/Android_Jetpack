package June_7
fun main() {
    val original = 15.0
    for (discount in 10..50 step 10) {
        val discounted = original  * (1 - discount / 100.0)
        println("$discount% off: $$discounted ")
    }
}

