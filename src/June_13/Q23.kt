package June_13

fun validate(value: Int) {
    if (value < 0) throw Exception("Value must be non-negative")
}

fun main() {
    validate(-1)
}