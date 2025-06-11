package June_10
class Person {
    var name: String
    var age: Int

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    constructor(name: String) {
        this.name = name
        this.age = 12
    }
}

fun main() {
    val p1 = Person("Hsisa")
    println("Name: " + p1.name)
    println("Age: " + p1.age)
}
