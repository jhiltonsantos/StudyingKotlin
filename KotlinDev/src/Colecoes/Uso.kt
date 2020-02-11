package Colecoes


//Data Class - Classe que só recebe dados
data class Food(val name: String, val calories: Double, val ingredients: List<Ingredients> = listOf())

data class Ingredients(val name: String, val quantity: Int)

fun hasIngredient(list: List<Ingredients>, name: String): Boolean {
    return list.filter { it.name == name }.any()
}


fun main(args: Array<String>) {

    val data = listOf(

        Food("Lasanha", 1200.0,
            listOf(
                Ingredients("Farinha", 1),
                Ingredients("Presunto", 5),
                Ingredients("Queijo", 10),
                Ingredients("Molho de Tomate", 2),
                Ingredients("Manjericao", 3)
            )
        ),
        Food("Panqueca", 500.0),
        Food("Omelete", 200.0),
        Food("Parmegiana", 700.0),
        Food("Sopa de Feijão", 300.0),
        Food(
            "Hamburger", 2000.0,
            listOf(
                Ingredients("Pão", 1),
                Ingredients("Hamburger", 3),
                Ingredients("Queijo", 1),
                Ingredients("Catupiry", 1),
                Ingredients("Bacon", 3),
                Ingredients("Alface", 1),
                Ingredients("Tomate", 1)
            )
        )
    )

    // Part I

    // Tenho Receitas na lista?
    println("1-Tenho Receitas? ${if (data.any()) "Sim" else "Não"}.")

    // Quantas Receitas tenho na Lista?
    println("\n2-Tenho ${data.count()} Receitas.")

    // Qual a Primeira e Última Receita
    println("\n3-A Primeira Receita é: ${data.first().name}.")
    println("3-A Ultima Receita é: ${data.last().name}.")

    // Qual a soma de calorias?
    println("\n4-A Soma de Calorias é: ${data.sumByDouble { it.calories }} kcal.")

    // Me de as duas primeiras receitas?
    val firtTwo = data.take(2)
    println("\n5-As Duas Primeiras Receitas: ")
    for (x in firtTwo.withIndex()) {
        println("${x.index + 1}º -> ${x.value.name}")
    }

    // Part II

    // Sei como fazer Panqueca? E Sushi?
    val knowPancake = data.filter { it.name == "Panqueca" }.any()
    println("\n6-Sei fazer Panqueca? ${if (knowPancake) "Sim" else "Não"}.")

    val knowSushi = data.filter { it.name == "Sushi" }.any()
    println("Sei fazer Sushi? ${if (knowSushi) "Sim" else "Não"}.")

    // Quais são as comidas com mais de 500 kcal?
    println("\n7-Comidas com mais de 500 calorias: ")
    val more500 = data.filter { it.calories > 500 }.forEach { print("${it.name} ") }

    // Par {chave, valor} de comidas com mais de 500 kcal {name, calories}
    println("\n\n8-Comidas com mais de 500kcal: ")
    data.filter { it.calories > 500 }
        .map { Pair(it.name, it.calories) }
        .forEach { println("${it.first} - ${it.second}kcal.") }

    // Quais das receitas possuem farinha como ingredientes?
    println("\n9-Quais Receitas possuem Farinha com Ingrediente?")
    val result = data.filter { hasIngredient(it.ingredients, "Farinha") }
        .forEach { println(it.name) }

}