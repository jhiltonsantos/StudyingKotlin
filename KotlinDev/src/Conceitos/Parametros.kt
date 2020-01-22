package Conceitos

fun endereco(rua: String = "", cidade: String = "", estado: String = "",
             cep: String = "", numero: String = "") {
    println("Rua: $rua")
    println("Cidade: $cidade, $estado - $cep")
}

fun main() {
    endereco(cidade = "Teresina", estado = "Piaui", cep = "64029-330")
}

