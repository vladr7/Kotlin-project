
open class Shape(
    var name: String,
) {
    init {
        println("I am the superclass")
    }

    fun changeName(newName: String) {
        name = newName
    }

}