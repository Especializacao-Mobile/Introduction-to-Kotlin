/*
Dado um array de caracteres, escreva um método para substituir todas as ocorrências do caractere 'a' por "&32".
Você pode assumir que o array possui espaço suficientes no final para armazenar os caracteres adicionais e
que você recebe o comprimento "verdadeiro" do array.

val arr = arrayOf(
       'G', 'e', 'o', 'v', 'a', 'n', 'a',
       ' ', ' ', ' ', ' ')

Entrada:	Geovana, 7
Saída: Geov&32n&32
* */

fun main() {
    val name = getText("Digite o nome no qual quer subistitui a letra a: ", "Nome inválido!")
    val tamanho = getIntValue("Digite o tamanho \"verdadeiro\" do array!", "Tamanho inválido!")
    name.forEach {
        if(it.toLowerCase() == 'a'){
            print("&32")
        }else{
            print(it)
        }}
}