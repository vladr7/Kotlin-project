
abstract class Dwelling(private var residents: Int) {

    abstract val buildingMaterial: String
    abstract val capacity: Int
    abstract fun floorArea(): Double
    fun hasRoom(): Boolean {
        return residents < capacity
    }
}