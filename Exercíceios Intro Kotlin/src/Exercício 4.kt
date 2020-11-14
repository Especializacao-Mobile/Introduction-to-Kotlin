/*
* Um restaurante faz uma promoção semanal de descontos para clientes de acordo com as iniciais do nome da pessoa.
* Criar um algoritmo que leia o primeiro nome do cliente e o valor de sua conta.
* O nome iniciar com A, D, M ou S = 30% de desconto.
* Caso contrário: “Que pena! Nesta semana o desconto não é para o seu nome.”
* */

fun main() {
    val clientName = getText("Digite seu Nome: ", "Nome inválido.", 3)
    val clientBill = getDoubleValue("Digite o valor da conta: ", "Valor Inválido!")
    if (listOf("A", "D", "M", "S").contains(clientName[0].toString())){
        print("O valor da sua conta é: ${clientBill * 0.7}")
    } else {
        println("Que pena! Nesta semana o desconto não é para o seu nome.")
        print("O valor da sua conta é: $clientBill")
    }
}

fun getText(message: String, errorMessage: String, minLength: Int = 0): String{
    var value = message.read()
    while (value.length <= minLength) {
        println(errorMessage)
        value = message.read()
    }
    return value
}