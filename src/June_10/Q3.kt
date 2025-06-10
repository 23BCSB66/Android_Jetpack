package June_10

fun main() {
    val students = mapOf("John" to 80, "Emma" to 72, "Lucas" to 90)
    val topScorers = mutableListOf<String>()
    for ((name, marks) in students) {
        if (marks > 75) {
            topScorers.add(name)
        }
    }
    println("Top Scorers: $topScorers")
}
