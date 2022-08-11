
class Triangle(
    val a: Int,
    val b: Int,
    val c: Int
) : Shape("Triangle") {

    companion object {
        fun randomTriangle(): Triangle {
            return Triangle(1,2,3)
        }
    }

    init {
        println("$a $b $c")
    }

    override fun area(): Double {
        TODO("Not yet implemented")
    }

    override fun perimeter(): Double {
        TODO("Not yet implemented")
    }
}