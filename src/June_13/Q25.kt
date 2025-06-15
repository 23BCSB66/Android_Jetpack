package June_13

fun main() {
    val list: List<String>? = null
    try {
        println(list!!.get(2))
    } catch (e: NullPointerException) {
        println("NullPointerException caught")
    } catch (e: IndexOutOfBoundsException) {
        println("IndexOutOfBoundsException caught")
    }
}