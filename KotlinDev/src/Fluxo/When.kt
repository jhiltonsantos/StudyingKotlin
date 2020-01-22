package Fluxo

fun operacao(numero1: Int, numero2: Int, operador: String): Int {
    when {
        numero1 > 0 && numero2 > 0 ->
            println("Variaveis maiores que 0")
        numero1 < 0 && numero2 > 0 ->
            println("Primeira variavel menor que 0 e Segunda variavel maior que 0")
        numero1 > 0 && numero2 < 0 ->
            println("Primeira variavel maior que 0 e Segunda variavel menor que 0")
        numero1 < 0 && numero2 < 0 ->
            println("Variaveis menores que 0")
        numero1 == 0 && numero2 == 0 ->
            println("Variaveis iguais a 0")
    }

    return when (operador) {
        "Soma" -> numero1 + numero2
        "Subtracao" -> numero1 - numero2
        else -> {
            println("Operacao Incorreta!!!")
            return 0
        }
    }


}

fun main() {

    println(operacao(10, 20, "Soma"))
    println(operacao(40, 20, "Subtracao"))
}

