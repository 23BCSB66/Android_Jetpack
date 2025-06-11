package June_10
data class User(val name: String, val email: String)

fun main()
{
    val u1 = User("Ash", "ash@gmail.com.com")
    val u2 = User("Rai", "rai@gmail.com.com")
    if (u1 == u2)
    {
        println("Users are equal")
    }
    else
    {
        println("Users are not equal")
    }
}
