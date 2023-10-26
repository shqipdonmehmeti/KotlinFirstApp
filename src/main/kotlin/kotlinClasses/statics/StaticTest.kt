package kotlinClasses.statics

class StaticTest {
    fun notStaticMethod() {
        println("I am not a static method!")
    }

    companion object {
        fun staticMethod() {
            println("I am a static method!")
        }
    }
}

fun main() {
    // this is for nonstatic
    val staticTest = StaticTest()
    staticTest.notStaticMethod()

    // this is for static
    StaticTest.staticMethod()
}