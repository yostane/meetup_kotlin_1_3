
// copy d'un array (signé ou non vers) un autre array de même type
// array.copyInto(targetArray, targetOffset, startIndex, endIndex) -> targetArray

val sourceArr = arrayOf("la", "si", "ré", "sol", "fa", "si")

val targetArr = sourceArr.copyInto(arrayOfNulls<String>(6), startIndex = 3, endIndex = 6)
println(targetArr.contentToString())

sourceArr.copyInto(targetArr, 3, 0, 3)
println("Les musiciens aiments les maisons avec un: ")
println(targetArr.contentToString())



