package OrientacaoObjetos

interface Machine {
    // Não posso atribuir valores
    // var peso: Float? = null
    fun On()
    fun Off() {
        println("Off...")
    }
}

class Computer : Machine {
    override fun On() {
        println("Ligando...")
    }
}

interface Interface1 {
    fun ola() {
        println("Interface 1")
    }
}

interface Interface2 {
    fun ola() {
        println("Interface 2")
    }
}

class implementsInterfaces : Interface1, Interface2, Machine {
    override fun ola() {
        super<Interface2>.ola()
    }

    override fun On() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

fun main() {

}