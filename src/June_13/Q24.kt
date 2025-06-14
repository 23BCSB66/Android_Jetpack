package June_13

class InvalidAgeException(message: String): Exception(message)

fun checkAge(age: Int) {
    if (age < 18) throw InvalidAgeException("Age must be at least 18")
}

fun main() {
    checkAge(16)
}