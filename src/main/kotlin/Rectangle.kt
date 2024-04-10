class Rectangle(
    val height: Double,
    val width: Double
) {
    init {
        println("The rectange is of height $height and width $width")
    }

    fun area() = height * width

    fun parameter() = 2 * (height + width)

}