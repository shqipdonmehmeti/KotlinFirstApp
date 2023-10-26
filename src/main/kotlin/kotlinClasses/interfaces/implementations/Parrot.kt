package kotlinClasses.interfaces.implementations

import kotlinClasses.interfaces.Animal

class Parrot : Animal {
    override var numberOfLimbs: Int = 2

    override fun move() {
        fly()
    }

    override fun communicate(): String? {
        return repeatVoice()
    }

    private fun fly() {
        println("I am a parrot and I am flying!")
    }

    private fun repeatVoice() : String? {
        return println("I am repeating your voice!").toString()
    }
}