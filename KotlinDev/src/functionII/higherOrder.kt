package functionII

// Declaração de Função Dentro do Parametro
fun operator(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    val ret = op(x, y)
    return ret
}

fun sum(x: Int, y: Int) = x + y

fun mult(x: Int, y: Int) = x * y

fun <T> Iterable<T>.paraCada(op: (T) -> Unit) { // Unit -> somente executa a função
    for (i in this) op(i)
}

fun main(args: Array<String>) {

    val list = listOf(1, 2, 3)
    list.forEach(::println)
    list.paraCada(::println)

    println("Soma: ${operator(1, 2, ::sum)}") // Sintaxe para Passar uma Função como Parametro
    println("Multiplicacao: ${operator(2, 2, ::mult)}") // Sintaxe para Passar uma Função como Parametro


    // LAMBDA
    operator(10, 20, { a, b -> a + b })
    operator(10, 20, { a, b -> a + b })

    val opLamb1 = { a: Int, b: Int -> a + b }
    operator(2, 3, opLamb1)

    val opLamb2: (Int, Int) -> Int = { a, b -> a * b }
    operator(5, 15, opLamb2)

}