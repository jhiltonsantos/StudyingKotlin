package OrientacaoObjetos

// Classe Abstrata
abstract class Mamifero(var nome: String) {
    var peso: Float? = null

    abstract fun talk()

    open fun sleep() {
        println("Estou dormindo...")
    }
}

class Cachorro(nome: String, meuPeso: Float) : Mamifero(nome) {
    init {
        this.peso = meuPeso
    }

    override fun talk() {
        println("Au au")
    }
}

class Gato(nome: String) : Mamifero(nome) {
    override fun talk() {
        println("Miau miau")
    }
}

fun main() {
    val g1: Gato = Gato("Leon")

    g1.talk()
    g1.sleep()

}
