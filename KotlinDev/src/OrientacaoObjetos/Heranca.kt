package OrientacaoObjetos

// Classe Herança
open class Maquina2(var marca: String) {
    open fun minhaMarca() {
        println("Minha marca eh: $marca")
    }
}

class Computador(marca: String, var nucleos: Int) : Maquina2(marca) {

    // Sobrescrita de Valores
    override fun minhaMarca() {
        val id = 10
        super.minhaMarca()
    }

    fun On() {}

    fun Process() {}

    // Sobrecarga
    fun overload(i: Int) = println("Overload 1")
    fun overload(i: String) = println("Overload 2")
    
}

fun main() {
    val c: Computador = Computador("xpto", 2)
    with(c) {
        On()
        Process()
        minhaMarca()
    }
}