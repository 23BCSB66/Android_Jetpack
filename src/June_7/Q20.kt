package June_7
fun main() {
    for (i in 1..10) {
        if (i == 8) {
            println("Skipping decaf order $i")
            continue
        }
        println("Processing coffee order $i")
    }
}


