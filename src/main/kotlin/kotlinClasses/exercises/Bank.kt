package kotlinClasses.exercises

class Bank(var accountNumber : Long , var isActive : Boolean , var money : Short ) {

    init {
      if (!isActive) {
          money = 0
      }
    }
    override fun toString(): String {
        return "Bank(accountNumber=$accountNumber, isActive=$isActive, money=$money)"
    }
}