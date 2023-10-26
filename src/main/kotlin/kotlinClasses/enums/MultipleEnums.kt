package kotlinClasses.enums

enum class Rainbow {
    RED,
    BLUE,
    YELLOW,
    GREEN,
    INDIGO,
    VIOLET
}

enum class Seasons {
    SPRING,
    SUMMER,
    AUTUMN,
    WINTER
}

enum class WeekDays(val id : Int) {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7)
}

enum class DayOfWeeks {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

enum class Gender(val id : Int) {
    FEMALE(1),
    MALE(2),
    OTHER(99)
}

fun main() {
    // printing name of monday
    val monday = WeekDays.MONDAY.name
    println(monday)

    // printing id of monday
    val mondayId = WeekDays.MONDAY.id
    println(mondayId)

    // printing ordinal(position starting from 0)
    val mondayOrdinal = WeekDays.MONDAY.ordinal
    println(mondayOrdinal)

    // printing values
    for (elem in WeekDays.values()) {
        println(elem)
    }

    // printing valueof
    val a = WeekDays.valueOf("MONDAY")
    println(a)

    val female = Gender.FEMALE.name
    println(female)

    val femaleId = Gender.FEMALE.id
    println(femaleId)

    val femaleOrdinal = Gender.FEMALE.ordinal
    println(femaleOrdinal)

    for (elem in Gender.values()) {
        println(elem)
    }

    val femaleValueOf = Gender.valueOf("FEMALE")
}