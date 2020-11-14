/*
 * Criar um algoritmo que imprima a metade de uma pirâmide usando números. Exemplo:
    * 1
    * 1 2
    * 1 2 3
    * 1 2 3 4
    * 1 2 3 4 5
* */

fun main() {
    val finalNumber = getIntValue(
        "Digite o número final da pirâmide: ",
        "Número inválido!")

    for (number in 1 .. finalNumber){
        for (numberInLine in 1 .. number){
            print("$numberInLine ")
        }
        println("")
    }
}