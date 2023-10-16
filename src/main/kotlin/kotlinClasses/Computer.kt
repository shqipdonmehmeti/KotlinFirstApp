package kotlinClasses

class Computer {
    var screen : String = ""
        get() = field // screen si backing field
        set(value) {
            field = value
        }

    var ram : String = ""
        get() = field
        set(value) {
            field = value
        }

    val storage : String = ""
        get() = field

}