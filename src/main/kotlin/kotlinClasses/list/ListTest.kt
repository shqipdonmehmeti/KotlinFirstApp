package kotlinClasses.list

fun main() {
    createLists()
}

fun createLists() {
    val list = listOf("Cacttus","Education")
    for (elem in list) {
        println(elem)
    }

    val mutableList = mutableListOf(50,100,150,200)
    mutableList.add(250)
    println(mutableList)

    val set = setOf(1,2,3)
    val mutableSet = mutableSetOf(1,2,3,4,5)

    val map = mapOf(Pair(1,2))
    val mutableMap = mutableMapOf(Pair(3,4))
}