package Fluxo

fun main() {

    var index = 0

    while (index <= 100) {
        println(index)
        index++

        if (index == 50) {
            break
        }

    }

    index = 0
    do {
        println("$index ")
        index ++

    } while (index < 20)

}