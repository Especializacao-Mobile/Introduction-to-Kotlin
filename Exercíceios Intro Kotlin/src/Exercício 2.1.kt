/*
 * Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres (idades diferentes entre si).
 * Calcule e escreva:
 *
 * A soma das idades do homem mais velho com a mulher mais nova.
 * O produto das idades do homem mais novo com a mulher mais velha.
*/

val arrayAges = arrayListOf<Int>()

fun main() {
    val manOlder = getNonRepeatedValue("Digite a idade do homem mais velho: ", "Idade Inválida.")
    val manYounger = getNonRepeatedValue("Digite a idade do homem mais novo: ", "Idade Inválida.")
    val womenOlder = getNonRepeatedValue("Digite a idade da mulher mais velha: ", "Idade Inválida.")
    val womenYounger = getNonRepeatedValue("Digite a idade da mulher mais nova: ", "Idade Inválida.")

    println("A soma das idades do homem mais velho com a mulher mais nova é: ${manOlder + womenYounger}.")
    println("O produto das idades do homem mais novo com a mulher mais velha é: ${manYounger * womenOlder}.")
}

fun getNonRepeatedValue(message: String, errorMessage: String): Int{
    var value = getIntValue(message, errorMessage)
    while (value in arrayAges){
        value = getIntValue(message, errorMessage)
    }
    arrayAges.add(value)
    return value
}

fun getIntValue(message: String, errorMessage: String): Int{
    var value = message.read().toIntOrNull() ?: 0
    while (value <= 0) {
        println(errorMessage)
        value = message.read().toIntOrNull() ?: 0
    }
    return value
}