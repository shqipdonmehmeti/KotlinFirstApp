package kotlinClasses.inheritance

open class Dog(val name : String)

class Labrador(name : String,val color : String , val weight : Double) : Dog(name) {
    fun printInfo() = println("Name is $name, Color is $color , Weight is $weight")
}

fun main() {
    val labrador = Labrador("Bubi","Zi",15.0)
    labrador.printInfo()
}