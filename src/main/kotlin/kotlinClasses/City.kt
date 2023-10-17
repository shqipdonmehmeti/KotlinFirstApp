package kotlinClasses

class City(val name : String) {
    var population : Int = 0
        set(value) {
            field = if (value > 50_000_000) 50_000_000
            else if (value < 0) 0
            else value
        }

    override fun toString(): String {
        return "City(name='$name', population=$population)"
    }


}