package Colecoes



fun main(args: Array<String>) {
    // List -> Array, Set, Hashmap
    val list1 = listOf<String>("Teresina", "Fortaleza") // Imutavel
    val list2 = mutableListOf("Teresina", "Fortaleza") // Mutavel

    val array1 = arrayListOf("Teresina", "Fortaleza")

    val set1 = setOf("Teresina", "Fortaleza", "Fortaleza")
    //println(set1.size)
    val set2 = mutableSetOf("Teresina", "Fortaleza")

    val hash1 = hashMapOf<String, String>(Pair("Key", "value"),
        Pair("Brasil", "Brasilia")) // Mutavel
    //println(hash1["Brasil"])

    val map1 = mapOf(Pair("Key", "Value"), Pair("Brasil", "Brasilia"))
    val map2 = mutableMapOf(Pair("Key", "Value"), Pair("Brasil", "Brasilia"))


}