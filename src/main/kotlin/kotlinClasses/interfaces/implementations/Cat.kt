package kotlinClasses.interfaces.implementations

import kotlinClasses.interfaces.Animal

class Cat : Animal {
    override var numberOfLimbs: Int = 4

    override fun move() {
        run()
    }

    override fun communicate(): String? {
        return sayMeow()
    }

    private fun run() {
        println("I am a cat and i am running!")
    }

    private fun sayMeow() : String? {
//        return null
        return println("I am a cat and i am saying meow!").toString()
    }

}