package OrientacaoObjetos


class Square(val area: Float) {
    override fun toString(): String {
        return "Square(area=$area)"
    }
}

// data class já vem com os metodos padroes já ativos: toString, equals e HashCode
data class Triangle(val area: Float) {

}

// Data Class: Uma classe que transita dados
data class Parameters(var b1: Boolean, var str: String, var index: Int)

fun Test(p: Parameters) {}


fun main() {
    val q1: Square = Square(10f)
    val q2: Square = Square(10f)

    val t1: Triangle = Triangle(10f)
    val t2: Triangle = Triangle(10f)

    println(q1)
    println(t1)

    println(q1.hashCode())
    println(q2.hashCode())
    println(t1.hashCode())
    println(t2.hashCode())

    // Copy - Realiza a copia de um objeto instanciado de um Data Class
    val t3 = t2.copy()
    println(t3)
}
