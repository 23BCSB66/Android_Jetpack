package June_13

fun applyFunc(x: Int, func: (Int) -> Int): Int = func(x)

fun main() {
    println(applyFunc(5) { it * it })
}