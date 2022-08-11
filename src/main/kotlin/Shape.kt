
abstract class Shape(
    var name: String,
) {
    init {
        println("I am the superclass")
    }

    abstract fun area(): Double

    abstract fun perimeter(): Double

    fun changeName(newName: String) {
        name = newName
    }

}