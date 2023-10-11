import java.lang.Exception
import java.util.Scanner

fun main(args: Array<String>) {
//    printoTeDhenat("Shqipdon","Mehmeti","01.01.01")
//    println(sumThreeNumbers(1,2,3))
//    println(nameOrSurname(true))
//    readAndWriteData()
//    printData()
//    createScanner()
//    val scanner = Scanner(System.`in`)
//    println("Write word : ")
//    val word = scanner.nextLine()
//    println("Write repeat times : ")
//    val numberOfRepeat = scanner.nextInt()
//    printAndRepeat(word,numberOfRepeat)
//    print(convertData(100))
//    println("Shkruaj numrin : ")
//    print(isOdd(readln().toInt()))

//    println(concatTwoString("Hello","World")) // default argument
//    println(concatTwoString(a = "Hello", b = "World")) // named arguments in order
//    println(concatTwoString(b = "Hello", a = "World")) // named arguments unordered
//    stringToNumber()
//    identifyTraits()
//    printOddOrEven(false)
//    println(subTwoNumbers(10,5))

//    sumThreeNumbersShortWay(1,2,3) // default arguments
//    sumThreeNumbersShortWay(a = 3,c = 5 , b = 4) // named arguments
//    stringToNumber2()

}

fun printoTeDhenat(emri : String, mbiemri : String , dataELindjes : String) {
    println("Emri : $emri")
    println("Mbiemri : $mbiemri")
    println("Data e lindjes : $dataELindjes")
}

fun sumThreeNumbers(a : Int , b : Int , c : Int) : Int {
//    var sum = a + b + c
//    return sum
    return a + b + c
}

fun sumThreeNumbersShortWay(a : Int , b : Int , c : Int) = a + b + c

fun subTwoNumbers2(a : Int , b : Int) = a - b


fun nameOrSurname(isName : Boolean) : String {
    if (isName) return "Emri"
    else return "Mbiemri"
}

fun readAndWriteData() {
    println("Please write your first name : ")
    val firstName = readLine()
    println("Please write your last name: ")
    val lastName = readLine()
    println("Name : $firstName , Surname : $lastName")
}

fun printData() {
    println("Please write your birthdate : ")
    val birthDate : String = readln()
    println("Please write your age : ")
    val age : Int = readln().toInt()
    println("Please write your height : ")
    val height : Float = readln().toFloat()
    println("Birthdate : $birthDate , age : $age , height : $height")
}

fun createScanner() {
    val scanner = Scanner(System.`in`)
    println("Write today date : ")
    val todayDate = scanner.nextLine()
    println("Write tomorrow date : ")
    val tomorrowDate = scanner.nextLine()
//    println("Today date : " + todayDate + ", " + " Tomorrow date : " + tomorrowDate )
    println("Today date : $todayDate , Tomorrow date : $tomorrowDate")
}

fun printAndRepeat(word : String , numberOfRepeat : Int) {
    println(word.plus("\n").repeat(numberOfRepeat))
}


fun convertData(firstType : Byte) : String {
    val secondType : Short = firstType.toShort()
    val thirdType : Int = secondType.toInt()
    val fourthType : Long = thirdType.toLong()
    return fourthType.toString()
}



fun calculator(operator : String , a : Int , b : Int) : Int {
    if (operator == "+" || operator == "plus") return a + b
    else if (operator == "-" || operator == "minus") return a - b
    else if (operator == "*" || operator == "times") return a * b
    else if (operator == "/" || operator == "divide") return a / b
    else return 0
}

fun calculatorWithWhenExpression(operator : String , a : Int , b : Int) : Int {
    return when (operator) {
        "+", "plus" -> a + b
        "-", "minus" -> a - b
        "*", "times" -> a * b
        "/", "divide" -> a / b
        else -> 0
    }
}

fun isOdd(number : Int) : Boolean {
//    if (number % 2 == 0) return true
//    else return false
    return number % 2 != 0
}


//fun sumTwoNumbers(a : Int , b : Int) : Int {
//    return a + b
//}

fun sumTwoNumbers(a : Int , b : Int) = a + b

fun subTwoNumbers(a : Int , b : Int) = a - b

fun concatTwoString(a : String , b : String) = a.plus(b)

//fun isVowel(character : Char) : Boolean {
//    if (character == 'a' || character == 'e' || character == 'i'
//        || character == 'o' || character == 'u' || character == 'y') return true
//    else return false
//}

fun isVowel(character : Char) =
    (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' || character == 'y')


fun stringToNumber() {
    println("Shkruani numrin prej 1 deri ne 5 si string : ")
    val word = readLine()?.lowercase()
    val result = when(word) {
        "one" -> 1
        "two" -> 2
        "three" -> 3
        "four" -> 4
        "five" -> 5
        else -> 0
    }
    println(result)
}

fun identifyTraits() {
    println("Write house characteristics : ")
    val line = readln()
    val result = when(line) {
        "gryffindor" -> "bravery"
        "hufflepuff" -> "loyality"
        else -> "Not a valid house"
    }
    println(result)
}

fun printFrom25to50() {
    for (i in 25 until 50) {
        println(i)
    }
}

fun printOddOrEven(isOdd : Boolean) {
    if (isOdd) {
        for (i in 1..100 step 2) println(i)
    } else {
        for (i in 0..100 step 2) println(i)
    }
}







