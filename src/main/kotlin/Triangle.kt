import kotlin.math.sqrt

class Triangle(
    val a: Double,
    val b: Double,
    val c: Double
) : Shape("Triangle") {
    init {
        println("Triangle created with a = $a, b = $b and c = $c.")
    }

    private val s: Double = (a + b + c) / 2

    override fun perimeter(): Double {
        return a + b + c;
    }

    override fun area(): Double = sqrt(s * (s - a) * (s - b) * (s - c))
}