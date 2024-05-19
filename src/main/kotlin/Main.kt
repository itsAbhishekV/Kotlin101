fun main() {
    val myTriangle = Triangle(3.0, 3.0, 3.0)
    println(myTriangle.area());
}

//open class Animal(val name: String) {
//    open fun makeSound() {
//        println("Generic animal sound")
//    }
//}
//
//class Dog(name: String) : Animal(name) {
//    override fun makeSound() {
//        println("Woof!")
//    }
//}
//
//fun main() {
//    val dog = Dog("Buddy")
//    dog.makeSound() // Output: Woof!
//}


//fun main() {
//    val circle = Circle(10.0)
//    circle.changeName("AbhishekCircle")
//
//}

//fun main() {
//    val myRect = Rectangle(4.0, 9.0)
//    val area = myRect.area()
//    val parameter = myRect.parameter()
//    println("The area of rectangle with ${myRect.height} height and ${myRect.width} width is $area")
//    println("The parameter of rectangle with ${myRect.height} height and ${myRect.width} width is $parameter")
//
//    val myCircle = Circle(10.0)
//    val myCircle2 = Circle(20.0)
//
//    val myTriangle = Triangle(10, 20, 30)
//    println("The perimeter of the Triangle is ${myTriangle.perimeter()}")
//
//}

//fun main() {
//    val list = listOf(1, 2, 3, 4, 5, 6)
//    println("The product of $list is ${list.product()}")
//}

//fun main() {
//    val alternatingSum = alternatingSum(3, 4, 5, 2, 1, 2, 3)
//    println("The alternating sum is $alternatingSum");
//}

fun alternatingSum(vararg numbers: Int): Int { //varArgs
    var sum: Int = 0;
    var toggle = true

    for (i in numbers) {
        if (toggle) {
            sum += i
        } else {
            sum -= i
        }
        toggle = !toggle
    }
    return sum
}

fun List<Int>.product(): Int {  // Extension Function
    var result: Int = 1
    for (i in this) {
        result *= i;
    }
    return result
}

