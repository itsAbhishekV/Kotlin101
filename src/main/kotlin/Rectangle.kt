class Rectangle(
    val height: Double,
    val width: Double
) : Shape("Rectangle") {
    init {
        println("The rectange is of height $height and width $width")
    }

    override fun area() = height * width

    override fun perimeter() = 2 * (height + width)

}