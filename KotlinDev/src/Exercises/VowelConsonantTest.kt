package Exercises

import org.junit.Assert
import org.junit.Test

class
VowelConsonantTest {

    @Test
    fun countVowels() {
        Assert.assertEquals(11, countVowels("Quantas vogais tem essa frase"))
    }

    @Test
    fun countConsonants() {
        Assert.assertEquals(22, countConsonants("Geralmente uma frase possui mais consoantes!"))
    }

    @Test
    fun countVowelsAndConsonants() {
        val phrase = "Estou gostando muito de aprender kotlin"
        Assert.assertEquals(15, countVowels(phrase))
        Assert.assertEquals(19, countConsonants(phrase))
    }

    @Test
    fun countVowelsFilter() {
        Assert.assertEquals(8, countVowelsFilter("Minha frase com vogais!"))
    }
}