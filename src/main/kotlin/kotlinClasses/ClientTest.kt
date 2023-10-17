package kotlinClasses

fun main() {
    val client = Client()
    println(client.info)
    client.name = "Filan"
    client.age = 99
    println(client.info)

    val city = City("Prishtine")
    city.population = -99
    println(city)
}