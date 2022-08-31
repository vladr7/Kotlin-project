fun main(args: Array<String>) {

    val user = User("John", "Doe", 50)
    val system1 = System("Blog", user)
    val system2 = system1.copy()

//    println(system1 === system2)
//    println(system1 == system2)
//
//    println(system1.user === system2.user)
//    println(system1.user == system2.user)
//

    println(system1.user.age)
    system2.user.age = 100
    println(system1.user.age)

}
