package OrientacaoObjetos

class Constants private constructor() {
    // Pode ou não ter um nome
    companion object {
        val TABLE = "Pessoa"

        fun test() {
            println("Metodo Estatico")
        }
    }

    object VENDAS {
        val TABLE_NAME = "Vendas"

        object COLUNAS {
            val ID = "Id"
            val TOTAL = "Total"
        }
    }
}

fun main() {
    println(Constants.TABLE)
    Constants.test()

    println(Constants.VENDAS.TABLE_NAME)
    println(Constants.VENDAS.COLUNAS.ID)

}