

fun main(args: Array<String>) {
    printoTeDhenat("Shqipdon","Mehmeti","01.01.01")
    println(sumThreeNumbers(1,2,3))
    println(nameOrSurname(true))
    readAndWriteData()
    printData()
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








