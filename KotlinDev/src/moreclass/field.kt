package moreclass

import java.lang.Exception

class Car(val model: String, val maxSpeed: Int) {

    var currentSpeed: Int = 0
        set(value) {
            if (value > maxSpeed) {
                throw Exception("Velocidade maior que o Limite")
            } else {
                field = value
            }
        }

        get() {
            return field // No get e set devo usar o field para passar o valor do atributo
        }                // evitando que caia em loop infinito do acesso
}

fun main() {

    val c1 = Car("", 220)
    c1.currentSpeed = 20
    println(c1.currentSpeed)

}