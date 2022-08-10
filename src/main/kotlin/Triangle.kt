
class Triangle(
    val a: Int,
    val b: Int,
    val c: Int
) : Shape("Triangle") {

    init {
        println(name)
    }
}