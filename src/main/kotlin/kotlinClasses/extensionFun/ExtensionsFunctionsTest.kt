package kotlinClasses.extensionFun

fun main() {
//    println(repeatString("Cacttus"))
//    val cacttus = "Cacttus"
//    println(cacttus.repeatString())
    val number = 55
    println(getLastDigit(number))
    println(number.lastDigit())
    println(number.nextValuePlusParameter(45))
}

//fun repeatString(word : String) : String {
//    return word + word
//}

//fun String.repeatString() : String {
//    return this + this
//}

fun String.repeatString() = this + this


fun getLastDigit(number : Int) = number % 10

fun Int.lastDigit() = this % 10

fun Int.nextValuePlusParameter(value : Int) = this + value + 1





