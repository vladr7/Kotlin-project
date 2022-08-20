class RoundTower(
    residents: Int,
    showels: Int,
    floors: Int
) : RoundHut(residents, showels) {

    override val capacity = 4 * floors

}