class Circle(
    val radius: Double
) : Shape("Circle") {

    private val pi = 3.141592

    init {
        println("Circle created with radius $radius")
        println("The area of the circle is ${area()}")
    }

    override fun area() = radius * radius * pi;

    override fun perimeter() = (2 * radius) * pi;
}