class Triangle(
    val a: Int,
    val b: Int,
    val c: Int
) {
    init {
        println("Triangle created with a = $a, b = $b and c = $c.")
    }

    fun perimeter(): Int {
        return a + b + c;
    }
}