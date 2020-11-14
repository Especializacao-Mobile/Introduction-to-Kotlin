/*
*
* Criar um algoritmo que, dado um número de conta corrente com 3 dígitos, retorne o seu dígito verificador,
* o qual é calculado assim: Exemplo: Número da conta: 235
* Somar o número da conta com o seu inverso: 235 + 532 = 767
* Multiplicar cada dígito pela sua ordem posicional e soma estes resultados:
  7	  6	  7
 X1	 X2	 X3
 7  +  12 + 21 = 40
* O último dígito desse resultado é o dígito verificador (40 -> 0)
*
* Este exercício foi feito em sala de aula.
* */

fun Int.reverse() = this.toString().reversed().toInt()
fun Int.sumReverse() = this + this.reverse()
fun Int.multiplyByIndex() = this.toString().mapIndexed { i, c -> (i+1)*c.toString().toInt() }
fun Int.getLastDigit() = this.toString().last()

fun main() {
    readLine()?.let { number ->
        try {
            val digitResult = number.toInt().sumReverse().multiplyByIndex().sum().getLastDigit()
            print("O dígito da conta é: $digitResult")
        } catch (e: Exception) {
            println("Insira um valor válido!")
        }
    } ?: run {
        println("Insira um valor válido!")
    }
}