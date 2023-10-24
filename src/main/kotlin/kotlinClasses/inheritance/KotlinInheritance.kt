package kotlinClasses.inheritance

fun main() {
    val derivationClass2 = DerivationClass2(50)
    derivationClass2.printBaseClass2()
    derivationClass2.printDerivationClass()
}


open class BaseClass2(val x: Int) {
    val schoolName: String = "Cacttus Education"
    fun printBaseClass2() = println("This print is from base class 2")

    init {
        println(
            "This variable came " +
                    "from derivation class in my constructor -> X : $x"
        )
    }
}

class DerivationClass2(x: Int , val y : Int = 0) : BaseClass2(100) {
    val z : String = "test"
    fun printDerivationClass() {
        println(schoolName)
        println("This print is from derivation class 2")
    }
}