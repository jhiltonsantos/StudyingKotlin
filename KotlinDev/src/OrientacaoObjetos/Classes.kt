package OrientacaoObjetos

class Person(var name: String, var yearBorn: Int) {

}

class Person2(var name: String) { // Primeiro Construtor
    var yearBorn: Int? = null

    constructor(name: String, yearBorn: Int) : this(name) { // Segundo Construtor
        this.yearBorn = yearBorn
    }

    fun salutation() {
        println("Ola $name!!!")
    }
}


fun main() {
    val p1: Person2 = Person2("Hilton", 2000)
    val p2: Person2 = Person2("Jose")

    p1.salutation()
    p2.salutation()
}

