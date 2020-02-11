package functionII

import java.text.SimpleDateFormat
import java.util.*

fun log(string: String) {
    println()
}

fun top() {
    fun log(str: String) {
        val calendar = Calendar.getInstance()
        val formatted = SimpleDateFormat("HH:mm:ss")
        println("$str - ${formatted.format(calendar.time)}")
    }

    log("Inicio")
    functionII.log("Test")

    val interval = 1..1000000000
    var sum: Double = 0.0
    for (i in interval) {
        sum += i * 2
    }

    log("Fim")
}

fun main() {
    top()
    log("")
}