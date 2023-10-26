package kotlinClasses.singletons

object SingletonObject {
    fun getSingleInstanceOfSomething() : String? {
        return println("Hey I am a function inside an object(singleton)").toString()
    }
    fun testSingletonObject() : String {
        return "I am being called from an object(singleton)"
    }
    const val PI : Double = 3.14
}

fun main() {
    println(SingletonObject.testSingletonObject())
}