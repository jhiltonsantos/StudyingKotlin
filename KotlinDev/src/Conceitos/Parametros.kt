package Conceitos

// Parametros Default
fun endereco(
    rua: String = "", cidade: String = "", estado: String = "",
    cep: String = "", numero: String = ""
) {
    println("Rua: $rua")
    println("Cidade: $cidade, $estado - $cep")
}

// Parametros Flexiveis
fun media(vararg notas: Float) {
    var soma: Float = 0f
    if (notas.isNotEmpty()) {
        for (nota in notas) {
            soma += nota
        }
        println("Media eh: ${soma/notas.size}")
    }
}

// Parametros com Tipo Indefinido <t>
fun <Type> imprimirValores(vararg valores: Type) {
    for (valor in valores) {
        println("$valor")
    }
}

fun main() {
    endereco(cidade = "Teresina", estado = "Piaui", cep = "64029-330")
    media(10f, 9.5f, 5f, 4f)
    imprimirValores("Hilton", 19, 20.5f, true, 'C')

    var str = "HiltonSantos"
    str.capitalize() // Deixa a Primeira Maiuscula
    str.decapitalize() // Deixa a Primeira Letra Minuscula
    str.contains("San") // Verifica se possui o valor na String
    str.startsWith("h", false)
    str.startsWith("h", true)

    arrayOf(1,5,23,4)

}
