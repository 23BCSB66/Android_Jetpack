package June_13

fun operateOnNumbers(a: Int, b: Int, op: (Int, Int) -> Int): Int = op(a, b)

fun main() {
    println(operateOnNumbers(4, 2) { x, y -> x + y })
    println(operateOnNumbers(4, 2) { x, y -> x * y })
    println(operateOnNumbers(4, 2) { x, y -> x - y })
}