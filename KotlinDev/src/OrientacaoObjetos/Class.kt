package OrientacaoObjetos

class Maquina(var marca: String) {
    // Getter e Setter é criado automaticamento no Kotlin:
    // getName e setName já esta criado
    var nucleos: Int = 0
        get() { // field serve para um get/set customizado
            println("Get foi chamado")
            return field
        }
        set(value) {
            println("Set foi chamado")
            field = value
        }

    fun ligar() {}

    fun desligar() {}

    fun processar() {}
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

    var m: Maquina = Maquina("xpto")
    m.nucleos = 2

    // WITH permite chamar varios metodos de uma classe
    with(m) {
        ligar()
        processar()
        desligar()
    }
    // O With acima tem a mesma execução que isso:
    //m.ligar()
    //m.processar()
    //m.desligar()



}

