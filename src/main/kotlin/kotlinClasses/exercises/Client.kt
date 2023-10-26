package kotlinClasses.exercises

class Client {
    var name : String = "Unknown"
    var age : Int = 18
        set(value) {
            field = if (value < 18) 18
             else value

        }
    //    var info : String = "$name + $age"
    var info : String = ""
        get() = "$name + $age"
}