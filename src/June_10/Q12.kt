package June_10
fun say(num: Int?) {
    if (num != null) {
        println("The value is $num")
    } else {
        println("Value is missing")
    }
}

fun main() {
    say(10)
    say(null)
}
