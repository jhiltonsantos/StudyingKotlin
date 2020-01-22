package Fluxo

fun maiorDeIdade(idade: Int): Boolean = idade >= 18

fun calculaBonus(cargo: String, salario: Float): Float {
    val bonus: Float

    if (cargo == "Coordenador") {
        bonus = salario * 0.2f
    } else if (cargo == "Gerente Senior") {
        bonus = salario * 2
    } else {
        bonus = salario * 0.5f
    }

    return bonus
}

fun calculaBonus2(cargo: String, salario: Float): Float {
    return if (cargo == "Coordenador") {
            salario * 0.2f
        } else if (cargo == "Gerente Senior") {
            salario * 2
        } else {
            salario * 0.5f
        }
}

fun main() {

    println(maiorDeIdade(18))
    println(maiorDeIdade(14))
    println(maiorDeIdade(10))

    println(calculaBonus2("Gerente Junior", 900.0f))
    println(calculaBonus2("Gerente Senior", 3000.0f))
    println(calculaBonus2("Coordenador", 4500.0f))

    // Operador Ternario em Kotlin

    val valor = 10
    val str = "Valor igual a 10"
    println(str)

    // JAVA: String str = valor == 10 ? "Sim" : "Não";

}