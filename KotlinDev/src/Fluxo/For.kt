package Fluxo

// FOR


fun main() {

    val nome = "Hilton Santos"

    for (c in nome) {
        print(c)
    }

    println()
    for (i in 0..100 step 5)
        if (i != 80)
            print("$i ")

    println()
    for (j in 100 downTo 0 step 4)
        print("$j ")


}