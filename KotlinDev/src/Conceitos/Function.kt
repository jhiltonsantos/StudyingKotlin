package Conceitos

fun calculaBonus(a: Int, b: Int, c: Int) {
    println("Valor: ${sum(a, b) * c}")
}

fun hello(nome: String) : String {
    return "Ola $nome!!!"
}

// function one line
fun hello2(nome: String) : String = "Ola $nome"

fun sum(x: Int, y: Int) : Int = x + y

fun main() {

    val valor1 = 5
    val valor2 = 6
    val valor3 = 3

    calculaBonus(valor1, valor2, valor3)

    println(hello("Jose"))
    println(hello2("Hilton"))
}


