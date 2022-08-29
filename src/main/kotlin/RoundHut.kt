
open class RoundHut(residents: Int, showels: Int) : Dwelling(residents) {

    override val buildingMaterial = "Straw"
    override val capacity = 4
    override fun floorArea(): Double {
        return 25.0
    }

}