
// isNullOrEmpty/orEmpty extensions on collections, maps, and arrays of objects

val collection: MutableCollection<Int>? = null
println(collection.isNullOrEmpty())

// returns empty list if null
println(collection.orEmpty())