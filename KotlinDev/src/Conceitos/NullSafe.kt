package Conceitos

//NullSafe

fun main() {

    val str: String? = null // Variavel Nula

    // VALIDAÇÕES IGUAIS
    println(str?.length) // Com Elvis

    if (str != null)
        println(str.length)
    //

    // FORÇAR (!!)
    println(str!!.length)
}