package kotlinClasses

class Client2 {
    var name : String = "Unknown"
    var age : Int = 18
        set(value) {
            field = if (value < 18) 18
             else value

        }
    val info : String
        get() = "name : $name , age : $age"
}