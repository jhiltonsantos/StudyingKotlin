package functionII

// O infix só é permitido com um unico parametro
infix fun Int.isHalfOf (value: Int) = value / 2 == this

fun main() {
    val num = 10
    num.isHalfOf(20)
    num isHalfOf 30 // Uso do Infix
}