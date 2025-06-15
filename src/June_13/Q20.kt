package June_13

fun checkInput(input: String) {
    if (input.isBlank()) throw IllegalArgumentException("Input cannot be blank")
}

fun main() {
    checkInput("")
}