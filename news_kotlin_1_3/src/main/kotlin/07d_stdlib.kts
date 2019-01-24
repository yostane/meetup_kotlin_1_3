//associateWith crée un dictionnaire à partir d'une liste plus succintement que la méthode associate

// exemple code César avec délage 3
// encodage a -> d, b -> e
// décodage d -> a, e -> b

val alphabet = 'a'..'z'
fun decryptCesar(c: Char, shift: Int = 3): Char {
    val decoded = c - shift
    return if(decoded >= 'a') decoded else decoded + ('z' - 'a' + 1)
}

// Avec associate
val associateMap = alphabet.associate { it to decryptCesar(it) }
println(associateMap.toString())