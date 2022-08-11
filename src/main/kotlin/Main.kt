fun main(args: Array<String>) {

    star { sun() }
}

fun sun(): Boolean{
    println("executed")
    return true
}

fun star(function: () -> (Boolean)) {
    println(function())
}