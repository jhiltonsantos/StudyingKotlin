package Conceitos

fun meuNome(nome: String) {
    println("Ola $nome!!!")
}

fun meuNomeIdade(nome: String, idade: Int) {
    println("Ola $nome. Tenho $idade anos!")
}

fun letraIndice(nome: String, indice: Int): Char {
    return nome[indice]
}

fun main() {
    val nome = "hilton"
    // val (variavel imutavel) seria o final em JAVA
    var sobrenome: String? = null
    if (nome == "hilton")
        sobrenome = "santos"
    println("\n$nome \n$sobrenome")


    meuNome("Hilton")
    meuNomeIdade("Hilton", 19)
    println(letraIndice("Hilton", 5))

    val str = "www"

}