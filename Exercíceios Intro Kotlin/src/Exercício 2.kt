/*
*
* Este exercício foi feito em sala de aula.
*
* */

fun main() {
    val salarioBruto = getDoubleValue(
        "Digite o valor do seu salário: ",
        "Valor do salário bruto é inválido!")
    val valorDaParcela = getDoubleValue(
        "Digite o valor da parcela: ",
        "Valor da parcela é inválida!")

    if (salarioBruto * 0.3 >= valorDaParcela) {
        print("Emprétimo Aprovado!")
    } else {
        print("O empréstimo não pode ser concedido.")
    }
}

fun getDoubleValue(message: String, errorMessage: String): Double{
    var value = message.read().toDoubleOrNull() ?: 0.0
    while (value <= 0) {
        println(errorMessage)
        value = message.read().toDoubleOrNull() ?: 0.0
    }
    return value
}

fun String.read(): String {
    print(this)
    val value = readLine() ?: ""
    return value
}