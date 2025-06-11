package June_10

open class Animal {
    open fun makeSound() {
        println("Barks")
    }
}

class Dog : Animal() {
    override fun makeSound() {
        println("Woof")
    }
}

fun main() {
    val dog = Dog()
    dog.makeSound()
}
