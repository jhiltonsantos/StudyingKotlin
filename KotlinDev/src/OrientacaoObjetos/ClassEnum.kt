package OrientacaoObjetos

enum class Prioridade {
    BAIXA, MEDIA, ALTA
}

// Override
enum class Prioridade2(val id: Int) {
    BAIXA(1) {
        override fun toString(): String {
            return "Super Baixa"
        }
    },
    MEDIA(5), ALTA(10)
}

class Alarm(var desc: String, var p: Prioridade2) {

}


fun main() {
    println(Prioridade2.BAIXA.id)

    for (p in Prioridade2.values()) {
        if (p.toString() == "MEDIA") {
            println("Esse é verdade!")
        }
        println("$p - ${p.id} - ${p.ordinal}")
    }

    Alarm("Aviso", Prioridade2.ALTA)
}