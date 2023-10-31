package kotlinClasses.collections

fun main() {
//    createCollections()
//    swapNumbers()
    reverseList()
}

fun createCollections() {
    val list = listOf(1,2,3)
    println(list)

    val mutableList = mutableListOf("Cacttus","Education")
    println(mutableList)
    mutableList.add("School")
    println(mutableList)
    println(mutableList.first())
    println(mutableList.last())
    mutableList.add(0,"First")
    println(mutableList)
}

fun swapNumbers() {
    val numbers = mutableListOf(1,2,3,4,5)
    val firstNumber = numbers.first()
    val lastNumber = numbers.last()
    val lastIndex = numbers.lastIndex
    numbers[0] = lastNumber
    numbers[lastIndex] = firstNumber
    println(numbers)

}

fun reverseList() {
//    val numbers = mutableListOf(1,2,3,4,5)
//    numbers.reverse()
//    println(numbers)

    val immutableList = listOf(3,4,5)
    val immutableList2 = immutableList.reversed()
    println(immutableList2)
}