data class HighScore(val name: String, val score: Int)

val highScores = listOf(
    HighScore("Joker", 300),
    HighScore("Thanos", 1_000_000_000),
    HighScore("captain Barbell", 1_000),
    HighScore("Wonder Woman", 500_000),
    HighScore("Android Pie", 20_000)
)

fun main(){

    val result = highScores.asSequence().
            filter { it.score > 10_000 }
            .sortedBy { it.name }
            .take(3)
            .mapIndexed { i, item -> "$i - ${item.name} a ${item.score} points" }
            .joinToString("\n")

    println(result)

}
