import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

@UseExperimental(ExperimentalContracts::class)
fun executeOnce(functionToRun: () -> Unit) {
    contract {
        callsInPlace(functionToRun, InvocationKind.EXACTLY_ONCE)
    }
    functionToRun()
}

fun startGame(): Int {
   val lives: Int
   executeOnce {
       lives = 5
   }
   return lives
}

fun main() {
   val lives = startGame()
    println("Thou have $lives 💖")
}