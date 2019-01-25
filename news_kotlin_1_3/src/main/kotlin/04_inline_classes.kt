// DataMail est un wrapper. Il encapsule un type existant pour ajouter du comportement et un niveau d'abstraction supplémentaire

data class Mail(val mail:String) {
    fun isValid() = mail.contains("@")
    fun dns() = if(isValid()) mail.substringAfter("@") else ""
}

inline class InlineMail(val mail:String) {
    fun isValid() = mail.contains("@")
    fun dns() = if(isValid()) mail.substringAfter("@") else ""
}


fun main() {
    val mail = Mail("ilove@apple.com")
    println("type: ${mail.javaClass.name} ${mail.mail}, valid ${mail.isValid()}, dns ${mail.dns()}")

    val inlineMail = InlineMail("i_prefer@android.com")
    println("type: ${inlineMail.javaClass.name} ${inlineMail.mail}, valid ${inlineMail.isValid()}, dns ${inlineMail.dns()}")
}
