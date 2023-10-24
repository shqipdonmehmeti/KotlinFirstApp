package kotlinClasses.inheritance

open class Developer
    (
    val name: String = "Cacttus Developer",
    val age: Int = 18,
    val salary: Int? = 550
) {
    init {
        println("Hello I am parent class Developer")
        println("Variables are -> name : $name , age : $age , salary : $salary")
    }
}

class MobileDeveloper
    (name: String, age: Int, salary: Int?) : Developer() {
    init {
        println("Hey I am Mobile Developer!")
    }
}


class BackEndDeveloper(
    name: String, age: Int, salary: Int?, val isFullstack: Boolean
) : Developer(name, age, salary) {
    init {
        println("Hey I am backend developer and also maybe fullstack : $isFullstack")
    }
}

fun main() {
    val mobileDeveloper = MobileDeveloper("Filan",99,800)
    val backendDeveloper = BackEndDeveloper("Test",55,750,true)
}








