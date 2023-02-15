fun main(args: Array<String>) {

    foo { it ->
        if(it) {
           println(it)
        }
    }

}

fun foo(
    bar: (Boolean) -> Unit
) {
    bar(true)
}
