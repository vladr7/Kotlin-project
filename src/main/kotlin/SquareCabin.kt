
class SquareCabin(residents: Int) : Dwelling(residents) {

    override val buildingMaterial = "Wood"

    override val capacity = 6
    override fun floorArea(): Double {
        return 10.0
    }


}