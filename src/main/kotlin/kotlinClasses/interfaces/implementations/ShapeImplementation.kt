package kotlinClasses.interfaces.implementations

import kotlinClasses.interfaces.Shape

class Triangle : Shape {
    override var angles: Int? = 3

    override var scale: Double? = 1.0

    override fun draw(): String? {
        return println("I am drawing from a Triangle").toString()
    }
}

class Rectangle : Shape {
    override var angles: Int? = 4

    override var scale: Double? = 1.0

    override fun draw(): String? {
        return println("I am drawing from a Rectangle").toString()
    }
}

class Hexagon : Shape {
    override var angles: Int? = 6

    override var scale: Double? = 1.0

    override fun draw(): String? {
        return println("I am drawing from a Hexagon").toString()
    }
}

fun main() {
    val triangle = Triangle()
    triangle.draw()
    val rectangle = Rectangle()
    println(rectangle.angles)
    val hexagon = Hexagon()
    println(hexagon.scale)
}