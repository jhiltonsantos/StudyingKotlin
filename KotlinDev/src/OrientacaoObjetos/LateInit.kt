package OrientacaoObjetos

class Person {
    // Inicializar Depois o Atributo
    lateinit var nome: String

    fun geradorNome() {
        nome = ""
    }
}

fun main() {
    val p: Person = Person()
    p.geradorNome()

}