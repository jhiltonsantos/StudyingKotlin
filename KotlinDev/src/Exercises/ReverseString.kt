package Exercises

fun reverseUsingSB(str: String) : String {
    return str.reversed()
}

fun reverseUsingLoop(str: String) : String {
    var index = 0
    var reverse = ""
    while (index < str.length) {
        reverse += str[(str.length-1) - index]
        index ++
    }
    return reverse
}

fun main() {
    println(reverseUsingLoop("Hilton"))
}

