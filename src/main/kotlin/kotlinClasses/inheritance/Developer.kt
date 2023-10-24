package kotlinClasses.inheritance

fun main() {
    val backendDeveloper = BackendDeveloper2("Filan","Javascript,Php,Mysql",400.0)
    val frontendDeveloper = FrontendDeveloper2("Fisteku","Java,Kotlin,Mssql",450.0,true)
}

open class Developer2(val name: String?, val skills: String?, val salary: Double) {
    init {
        println("I am super/parent class!")
        println("Variables are -> name : $name, skills : $skills , salary : $salary")
    }
}

class BackendDeveloper2
    (
    name: String?,
    skills: String?,
    salary: Double
) : Developer2(name, skills, salary) {
    init {
        println("I am sub/child class")
    }
}

class FrontendDeveloper2(
    name: String?,
    skills: String?,
    salary: Double,
    val isFullStack: Boolean
) : Developer2(name, skills, salary) {
    init {
        println("I am sub/child class and i have extra value isFullstack : $isFullStack")
    }
}