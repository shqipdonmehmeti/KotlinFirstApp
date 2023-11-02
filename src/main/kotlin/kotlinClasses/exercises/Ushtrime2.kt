package kotlinClasses.exercises


fun main() {
//    detyra1()
//    detyra2()
//    val weight = readln().toDouble()
//    val height = readln().toDouble()
//    println(detyra3(weight,height))
//    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 20, 0, 12, 13)
//    detyra4(list)
//val studenti1 = Student("Dea", 19, 10.0)
//
//    println("Studenti me emrin ${studenti1.name} eshte eligible:  ${studenti1.isEligibleForPromotion()}")
//    detyra5(5)

}

fun detyra1() {
    println("Shkruaj numrin e pare")
    val number = readln().toInt()
    println("Shkruaj numrin e edyte")
    val secondNumber = readln().toInt()

    var sum = 0
    for (i in number..secondNumber) {
        sum += i
    }

    println(sum)
}


fun detyra2() {
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)
    var countEven = 0
    var countOdd = 0
    for (elem in numbers) {
        if (elem % 2 == 0) countEven++
        else countOdd++
    }
    println("even number: $countEven ")
    println("odd number: $countOdd ")
}


fun detyra3(weight: Double, height: Double) = weight / (height * height)

fun detyra4(listOfNumbers: List<Int>) {
    for (element in listOfNumbers) {
        if (element % 2 == 0) print("$element, ")
    }


}

class Student(val name: String, val age: Int, val grade: Double) {

    fun isEligibleForPromotion() = grade >= 9.0 && age >= 18

}


fun detyra5(size: Int) {
//    for (elem in 1..size) {
//        for (j in 1..size) {
//            print("* ")
//        }
//        println()
//    }

    repeat(size) {
        print("* ".repeat(size))
        println()
    }

}


class BankAccount(accountNumber: Int, var balance: Double, holderName: String) {

    fun withDraw(amount: Double) {
        if (balance < amount) {
            println("You don't have enough money for this trasaction")
        } else {
            balance -= amount
            println("Balance after withdraw  $balance")

        }
    }

    fun deposit(amount: Int) {
        if (amount > 0) {
            balance += amount
            println("Balance after deposit $balance")
        } else {
            println("Invalid amount ")
        }
    }
}








