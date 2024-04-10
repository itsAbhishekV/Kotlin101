open class Shape( //open so that other classes can inherit from it
    var name: String
) {

    init {
        println("The super class")
    }

    fun changeName(newName: String) {
        name = newName
        println("The new name for this shape is $name")
    }

}