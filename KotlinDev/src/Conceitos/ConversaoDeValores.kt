package Conceitos

import java.lang.NumberFormatException

fun main() {

    val n1: Double = Double.MAX_VALUE
    val b1: Byte = 100

    println(b1.toShort())
    println(b1.toLong())
    println(b1.toFloat())
    println(b1.toDouble())

    println("19".toDouble())

    // Exceções
    try {
        println("dff".toInt())
    } catch (e: NumberFormatException) {
        println("Não é um número!!!")
    } catch (e: Exception) {
        println("Algo de errado ocorreu!!!")
    } finally {
        println("Entrou")
    }


}