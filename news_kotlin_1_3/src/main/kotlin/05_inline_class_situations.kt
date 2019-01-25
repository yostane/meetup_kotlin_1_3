
interface IPrintType { fun printType() }

// les inline class sont final et n'héritent que des interfaces
inline class GilBag(val coins: Int) : IPrintType {
    override fun printType() {
        println(this.javaClass.name)
    }
    fun canBuyPotion() = coins <= 100
}

// Kotlin n'inline pas la propriété quand elle passée en argument dans ces cas (on dit aussi boxing)
// mais il est inliné quand on appelle ses fonctions
fun asInline(gilBag: GilBag) { gilBag.printType() }
fun <T> asGeneric(x: T) {
    if(x is Int){
        println("generic Int")
    }else if(x is GilBag){
        print("generic Hours - ")
        x.printType()
    }else if(x is IPrintType){
        println("generic IPrintType")
    }
}
fun asInterface(i: IPrintType) { i.printType() }
fun asNullable(i: GilBag?) {
    i?.printType()
}

fun main() {
    val gilBag = GilBag(42)
    val iPrintTypeHours: IPrintType = gilBag
    println("javaClass from interface: ${iPrintTypeHours.javaClass.name}")
    print("Call method of inline class from interface: ")
    iPrintTypeHours.printType()

    print("asInline: ")
    asInline(gilBag)
    print("asGeneric: ")
    asGeneric(gilBag)
    print("asInterface: ")
    asInterface(gilBag)
    print("asNullable: ")
    asNullable(gilBag)
}