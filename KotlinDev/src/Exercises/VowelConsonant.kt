package Exercises

import java.lang.StringBuilder


/* CORREÇÃO DO CURSO
fun countVowels(phrase: String) : Int {
    val VOWEL = "aeiou"
    var totalVowel = 0

    for (letter in phrase) {
        if (letter in VOWEL) {
            totalVowel ++
        }
    }
    return totalVowel
}

fun countConsonants(phrase: String) : Int {
    val CONSONANTS = "bcdfghjklmnpqrstvwxyz"
    var totalConsonants = 0

    for (letter in phrase) {
        if (letter in CONSONANTS) {
            totalConsonants++
        }
    }
    return totalConsonants
}
*/

fun isVowel(letter: Char): Boolean {
    val vowel = "aeiou"
    for (v in vowel) {
        if (letter == v) {
            return true
        }
    }
    return false
}

fun countVowels(phrase: String): Int {
    val phrase = phrase.replace(" ", "").toLowerCase()
    var count = 0
    for (letter in phrase) {
        if (isVowel(letter)) {
            count++
        }
    }
    return count
}

fun countConsonants(phrase: String): Int {
    val phrase = phrase.replace(" ", "").toLowerCase()
    var count = 0
    for (letter in phrase) {
        if (!isVowel(letter)) {
            count++
        }
    }
    return count
}

fun main() {
    val nome = "Hilton Jose"
    println("Nome: $nome")
    println("Quantidade de Vogais: ${countVowels(nome)}")
    println("Quantidade de Consoantes: ${countConsonants(nome)}")
}