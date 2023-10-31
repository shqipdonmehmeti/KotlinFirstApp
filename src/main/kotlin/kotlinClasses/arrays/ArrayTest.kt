package kotlinClasses.arrays

fun main() {
//    val integerArray = intArrayOf(5,10,15,20)
//    println(integerArray.joinToString())
//    integerArray[0] = 8
////    integerArray.set(0,8)
//    println(integerArray.joinToString())
//
//    val mixArray = arrayOf(1,"Test",true)
//    println(mixArray.joinToString())
//
//    val doubleArray = DoubleArray(20)
//    println(doubleArray.joinToString())
//
//    createNumbersArray()
//    val testArray = IntArray(50) {
//        it
//    }
//    println(testArray.joinToString())
//    createNumbersArrayTo100()
    testArrays()

}

fun createNumbersArray() {
    val numbers = intArrayOf(12,17,8,101,33)
    println(numbers.joinToString())
}

fun createNumbersArrayTo100() {
    val numbers = IntArray(101)
    numbers[1] = 1
    numbers[10] = 10
    numbers[100] = 100
    println(numbers.joinToString())
}







fun testArrays() {
    val doubleArray = DoubleArray(10)
    println(doubleArray.joinToString())

    val mixArray = arrayOf(1,"Test",true)
    println(mixArray.joinToString())

    val numbers = intArrayOf(12,17,8,101,33)
    println(numbers.joinToString())

    val numbers2 = IntArray(100)
    numbers2[0] = 1
//    numbers2[1] = 1

    numbers2[9] = 10
//    numbers2[10] = 10

    numbers2[99] = 100
//    numbers2[100] = 100 // error
    println(numbers2.joinToString())

}


















