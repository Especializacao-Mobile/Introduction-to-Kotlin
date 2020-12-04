import classes.Car

fun main() {

    Car.showCounter()
    val fusca = Car(2000, "Fusca", "White")
    println(fusca.toString())
    Car.showCounter()
    val ferrari = Car(2000, "Fusca", "White")
    println(ferrari.toString())
    Car.showCounter()

}