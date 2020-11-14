/*
Imagine que você quer comprar um segundo cartão SIM de uma operadora diferente.
A decisão de qual é a melhor opção de operadora deve ser baseada no histórico de chamadas.

Exemplo do histório:
0151932323579 CelularRealizada
04854545521009Fixo   Recebida

O número do telefone é composto por:
0 (1 dígito), codígo da operadora (2 dígitos), código de área (2 dígitos) e número (8 ou 9 dígitos).
A melhor opção é a operadora que você usou mais vezes nas chamadas realizadas para telefones celulares.
* */

enum class CallType {
    MADE,
    INCOMING
}
data class Number(val digit: Int, val operator: Int, val areaCode: Int, val number: Int)
data class Call(val number: Number, val type: CallType)

fun main() {

    val listOfCalls = arrayListOf(
        Call(Number(0, 15, 19, 32323579), CallType.MADE),
        Call(Number(0, 16, 19, 32323578), CallType.MADE),
        Call(Number(0, 16, 19, 32323577), CallType.INCOMING),
        Call(Number(0, 16, 19, 32323576), CallType.MADE),
        Call(Number(0, 16, 19, 32323575), CallType.INCOMING),
        Call(Number(0, 15, 19, 32323574), CallType.MADE),
        Call(Number(0, 16, 19, 32323573), CallType.MADE),
        Call(Number(0, 16, 19, 32323572), CallType.MADE),
        Call(Number(0, 16, 19, 32323571), CallType.MADE)
    )

    val onlyMadeCalls = listOfCalls.filter { it.type == CallType.MADE}
    val groupedByOperator = onlyMadeCalls.groupBy { it.number.operator }
    var bestOption = -1
    var lastOption = -1
    groupedByOperator.forEach {
        if (it.value.size > lastOption){
            lastOption = it.value.size
            bestOption = it.value[0].number.operator
        }
    }
    println("The best option for you to call is through operator: $bestOption")


}