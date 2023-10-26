package kotlinClasses.exercises

import kotlin.math.sqrt

fun main() {
//    fizzBuzzGame()
//    findMaxNumber()
//    callTicketPrice()
//    calculateArea()
    repeatSelf()
}

fun fizzBuzzGame() {
    println("Please write first number : ")
    val firstNumber = readln().toInt()
    println("Please write second number : ")
    val secondNumber = readln().toInt()

    for (i in firstNumber..secondNumber) {
        if (i % 15 == 0) println("Fizzbuzz")
        else if (i % 5 == 0) println("Buzz")
        else if (i % 3 == 0) println("Fizz")
        else println(i)
    }
}

fun findMaxNumber() {
    println("Please write first number : ")
    val firstNumber = readln().toInt()
    println("Please write second number : ")
    val secondNumber = readln().toInt()

//    if (firstNumber > secondNumber) println(firstNumber) else println(secondNumber)

    println(firstNumber.coerceAtLeast(secondNumber))
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    return when (age) {
        in 0..12 -> 15
        in 13..60 -> if (isMonday) 25 else 30
        in 61..100 -> 20
        else -> -1
    }
}

fun callTicketPrice() {
    val child = 5
    val adult = 28
    val senior = 87
    val isMonday = false

    println("The Movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}")
    println("The Movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}")
    println("The Movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}")
}


fun calculateArea() {
    println("Please write geometric shape : ")
    val shape = readln().lowercase()
    when (shape) {
        "triangle" -> {
            println("Please write first value ")
            val a = readln().toDouble()
            println("Please write second value ")
            val b = readln().toDouble()
            println("Please write third value ")
            val c = readln().toDouble()
            val perimeter = a + b + c
            val result = sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c))
            println(result)
        }

        "rectangle" -> {
            println("Please write first value ")
            val a = readln().toDouble()
            println("Please write second value ")
            val b = readln().toDouble()
            val result = a * b
            println(result)
        }

        "circle" -> {
            println("Please write first value ")
            val a = readln().toDouble()
            val result = 3.14 * a * a
            println(result)
        }

        else -> println("Invalid shape")
    }
}


fun repeatSelf() {
    val number = readln().toInt()
    repeat(number) {
        println(number)
    }
//    for (i in 1..number) println(number)
}