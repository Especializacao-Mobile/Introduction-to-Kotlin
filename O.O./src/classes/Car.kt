package classes

/**
 * All attributes year, model and color can only be accessed from methods that show they
 * for outside this class.
 */
class Car(
    private val year: Int,
    private val model: String,
    private var color: String
){

    init {
        counter += 1
    }

    companion object {
        //This is an static attribute, and can be accessed from the method bellow,
        // also has the same value for all the objects created;
        private var counter: Int = 0

        // This method can be called directly from the Class constructor;
        // This is called a class Method;
        fun showCounter(){
            println("There are $counter objects created;")
        }
    }

    override fun toString(): String {
        return "Car: Year: $year, Model: $model, Color: $color."
    }

    // The methods bellow can only be accessed if an object is created, because they are object methods;
    fun turnOn(){
        print("Car has turned on!")
    }
    fun speedUp(){
        print("Car speeding up!")
    }
    fun speedDown(){
        print("Car speeding down!")
    }

}