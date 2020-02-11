package moreclass

// Acesso de Class dentro de outra Classe - inner class

class Computer(val processorModel: String) {

    inner class Memory(val level: Int) {
        fun getMemoryLevel() : Int {
            println("$processorModel, $level")
            return 70
        }
    }
}

fun main() {
    val m1: Computer.Memory = Computer("Ryzen").Memory(2)
    m1.getMemoryLevel()


}