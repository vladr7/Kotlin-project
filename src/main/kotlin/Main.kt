fun main(args: Array<String>) {

    val a = 3.0
    val b = 4.0
    val height = 2.0
    val parallelogram = object : Shape("Parallelogram", a, b, height) {

        init {
            println("Paralul $a $b $height")
        }

        override fun area(): Double {
            return a * b * height
        }

        override fun perimeter(): Double {
            return a * b
        }

        fun isRectangle(): Boolean = height == b
    }
}

