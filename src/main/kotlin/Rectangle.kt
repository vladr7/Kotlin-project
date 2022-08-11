import kotlin.math.PI
import kotlin.random.Random

class Rectangle(
    val a: Double,
    val b: Double
) : Shape("Rectangle"){

    companion object {
        fun randomRectangle(): Rectangle {
            val a = Random.nextDouble()
            val b = Random.nextDouble(3.0, 5.0)
            return Rectangle(a, b)
        }
    }

    constructor(a: Double) : this(a, a)

    constructor(a: Int, b: Int) : this(a.toDouble(), b.toDouble())

    constructor(a: Int) : this(a.toDouble(), a.toDouble())

    init {
        println("$a - $b")
    }

    override fun area(): Double {
        return a * b * PI
    }

    override fun perimeter(): Double {
        TODO("Not yet implemented")
    }
}