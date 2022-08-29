class RoundTower(
    residents: Int,
    showels: Int,
    floors: Int
) : RoundHut(residents, showels) {

    override val capacity = 4 * floors
    override fun floorArea(): Double {
        return super.floorArea() * 5
    }


}