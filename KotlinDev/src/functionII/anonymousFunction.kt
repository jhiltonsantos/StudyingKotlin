package functionII

fun operator_A(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    val ret = op(x, y)
    return ret
}

fun main(args: Array<String>) {
    // FUNÇÃO ANONIMA - PARA VARIAS INSTRUÇÕES
    operator_A(1, 2, fun (n1: Int, n2: Int): Int {
        return n1 + n2
    })

}