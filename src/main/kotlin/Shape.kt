abstract class Shape( //open so that other classes can inherit from it
    var name: String
) {

    init {
        println("The super class")
    }

    abstract fun area(): Double

    abstract fun perimeter(): Double

    fun changeName(newName: String) {
        name = newName
        println("The new name for this shape is $name")
    }

}