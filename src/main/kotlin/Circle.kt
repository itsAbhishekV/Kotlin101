class Circle(
    val radius: Double
) {
    val pi = 3.141592

    init {
        println("Circle created with radius $radius")
        println("The area of the circle is ${area()}")
    }

    fun area() = radius * radius * pi;
}