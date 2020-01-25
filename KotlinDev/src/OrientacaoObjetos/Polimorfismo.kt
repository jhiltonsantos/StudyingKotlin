package OrientacaoObjetos

interface Funcionario {
    fun calculaBonus()
}

class Gerente() : Funcionario {
    override fun calculaBonus() {
        println("Bonus eh igual a R$500")
    }
}

class Tecnico() : Funcionario {
    override fun calculaBonus() {
        println("Bonus eh igual a R$200")
    }
}

class Analista() : Funcionario {
    override fun calculaBonus() {
        println("Bonus eh igual a R$300")
    }
}

// Polimorfismo
fun calculo(F: Funcionario) {
    F.calculaBonus()
}

fun main() {

    // Chamada de Polimorfimo
    val f1: Funcionario = Gerente()
    val f2: Funcionario = Tecnico()
    val f3: Funcionario = Analista()

    calculo(f1)
    calculo(f2)
    calculo(f3)
}