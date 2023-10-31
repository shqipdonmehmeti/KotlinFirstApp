package kotlinClasses.extensionFun

fun main() {
    val cacttusName = "Cacttus"
    val number = 104

//    println(repeatWordTwice(cacttusName))
    println(cacttusName.repeatWordTwice())
    println(number.lastDigit2())
    println("Cacttus".checkContainsC())
}

//fun repeatWordTwice(word : String) = word + word

fun String.repeatWordTwice() = this + this

fun Int.lastDigit2() : Int {
    return this % 10
}

fun String.checkContainsC() = this.lowercase().contains('c')

