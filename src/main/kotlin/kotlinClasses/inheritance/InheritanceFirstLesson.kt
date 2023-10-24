package kotlinClasses.inheritance

open class BaseClass(val x : Int) {
    val name = "Cacttus Education"
    fun printBaseClass () = println("Base Class")

}

class DerivedClass(x : Int) : BaseClass(x) {
    val name2 = ""
    fun printDerivedClass () {
        println(name)           //inherit name property
        println("Derived class")
    }
}

fun main() {
    val derivedClass = DerivedClass(20)
    derivedClass.printDerivedClass()
    derivedClass.printBaseClass()
}
