/*
Crie uma lista de pessoas (nome e idade);
Imprima a lista de pessoas ordenada por idade;
Imprima a pessoa mais velha da lista;
Imprima as pessoas agrupadas por idade;
*
* */

data class Person(val nome: String, val idade: Int)

fun main() {
    val listOfPersons = arrayListOf(
        Person("Daivid", 20),
        Person("João", 34),
        Person("Pedro", 40),
        Person("Judas", 40),
        Person("José", 20),
        Person("Marcos", 19)
    )

    val sortedList = printSortedList(listOfPersons)
    println("A idade do mais velho da lista é: ${sortedList.last().idade}")
    println("")
    printGroupedByAge(listOfPersons)

}

fun printSortedList(arrayList: ArrayList<Person>): List<Person>{
    val sortedList = arrayList.sortedBy { it.idade }
    println("A lista ordenada é: ")
    sortedList.forEach {
        println(it)
    }
    println("")
    return sortedList
}

fun printGroupedByAge(arrayList: ArrayList<Person>){
    val groupedByAge = arrayList.groupBy { it.idade }
    println(groupedByAge)
    println("A lista agrupada por idade é: ")
    groupedByAge.forEach {
        println(it)
    }
    println("")
}