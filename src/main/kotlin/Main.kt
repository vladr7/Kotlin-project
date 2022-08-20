fun main(args: Array<String>) {

    val squareCabin = SquareCabin(10)
    with(squareCabin) {
        println("===")
        println("Squarecabin")
        println(this.buildingMaterial)
        println(this.capacity)
        println(this.hasRoom())
    }

    val roundHut = RoundHut(3, 20)
    with(roundHut) {
        println("===")
        println("RoundHut")
        println(this.buildingMaterial)
        println(this.capacity)
        println(this.hasRoom())
    }

    val roundTower = RoundTower(9, 9, 9)
    with(roundTower) {
        println("===")
        println("RoundTower")
        println(this.buildingMaterial)
        println(this.capacity)
        println(this.hasRoom())
    }
}
