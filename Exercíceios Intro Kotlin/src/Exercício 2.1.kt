/*
 * Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres (idades diferentes entre si).
 * Calcule e escreva:
 *
 * A soma das idades do homem mais velho com a mulher mais nova.
 * O produto das idades do homem mais novo com a mulher mais velha.
*/

val arrayAges = arrayListOf<Int>()

fun main() {
    val manOlder = getIntValue("Digite a idade do homem mais velho: ", "Idade Inválida.")
    val manYounger = getIntValue("Digite a idade do homem mais novo: ", "Idade Inválida.")
    val womenOlder = getIntValue("Digite a idade da mulher mais velha: ", "Idade Inválida.")
    val womenYounger = getIntValue("Digite a idade da mulher mais nova: ", "Idade Inválida.")

    println("A soma das idades do homem mais velho com a mulher mais nova é: ${manOlder + womenYounger}.")
    println("O produto das idades do homem mais novo com a mulher mais velha é: ${manYounger * womenOlder}.")
}

fun getIntValue(message: String, errorMessage: String): Int{
    var value = message.read().toIntOrNull() ?: 0
    while (value <= 0 || value in arrayAges) {
        println(errorMessage)
        value = message.read().toIntOrNull() ?: 0
    }
    arrayAges.add(value)
    return value
}