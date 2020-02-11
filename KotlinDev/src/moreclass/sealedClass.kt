package moreclass

// Classes Seladas - Classe Privada dentro de um arquivo
// Enum

sealed class Result {
    class Sucess(val message: String) : Result()
    class Error(val message: String, val errorCode: Int): Result()
}

class Repo {
    fun execute() : Result {
        return Result.Sucess("Deu certo")
        return Result.Error("Deu certo", 404)
    }
}
fun main() {
    val r1 = Repo()
    val result = r1.execute()

    when(result) {
        is Result.Sucess -> {
            println("Deu Certo")
        }
        is Result.Error -> {
            println("Deu Erro")
        }
    }
}