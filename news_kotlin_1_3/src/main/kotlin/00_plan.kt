fun main() {
    println("Soirée Kotlin avec LAUG \uD83D\uDE0D (22/10/2019)")
    println("Big up aux Sponsors:  \uD83D\uDC4F Worldline et Efficom Lille  \uD83D\uDC4F")
    println("Nouveautés de Kotlin 1.3")
    val steps = listOf(
        "Programme: \uD83D\uDCDD", "Contracts",
        "Inline classes", "Script et scrach",
        "Nouveautés Stdlib",
        "Nouveautés diverses",
        "Serialization",
        "Nouvelles annotations @JVM",
        "Unsigned int",
        "Stabilisation des coroutines"
    )
    print(steps.joinToString("\n ✅ "))
}