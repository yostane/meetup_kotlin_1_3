import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract

@UseExperimental(ExperimentalContracts::class)
fun testNonNull(s: String?):Boolean{

    contract {
        // booleanExpression can accept only a subset of boolean expressions (see doc)
        returns(true) implies (s != null)
    }

    return s != null
}

@UseExperimental(ExperimentalContracts::class)
fun myRequire(condition: Boolean) {
    contract {
        returns() implies condition
    }

    if(condition == false) throw IllegalArgumentException()
}

fun main(){
    var s: String?
    s = readLine()
    if(s == "windows phone") s = null

    // Compiler automatically casts 's' to 'String'
    if (s != null)  print(s.length)

    if(testNonNull(s)){
        print(s.length)
    }

    myRequire(s is String)

}



