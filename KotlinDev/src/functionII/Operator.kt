package functionII

data class Fraction(val numerator: Int, val denominator: Int) {
    operator fun plus(add: Fraction): Fraction {
        if (denominator == add.denominator) {
            return Fraction(numerator + add.numerator, denominator)
        } else {
            val comum = denominator * add.denominator
            return Fraction(((comum / denominator) * numerator) +
                    ((comum / add.denominator) * add.numerator), comum)
        }
    }

    operator fun inc() : Fraction {
        return this
    }
}

fun main(args: Array<String>) {

    var n1: Int = 10
    n1.plus(10)

    var f1: Fraction = Fraction(3, 2)
    var f2: Fraction = Fraction(5, 3)

    println(f1 + f2) // Operator Plus

    println(f1++) //Operator Inc



}