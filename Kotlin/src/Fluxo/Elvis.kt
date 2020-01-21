package Fluxo

fun main() {

    // Operador Elvis (?:)

    //val valor : Int = null (False)
    val valor : Int? = null

    val op = valor ?: 100
    println(op)



}