fun generateAcronym(phrase: String): String{
    
    val words = phrase.replace(Regex("[^a-zA-Z0-9\\-\\s]"), "").split(Regex("[-\\s]"))
    
    return words.filter{it.isNotEmpty()}
                .map{it[0].uppercaseChar()}
                .joinToString("")
}

fun main(){
    val input = "Portable Network Graphics"
    val acronym = generateAcronym(input)
    
    println("The acronym for '$input' is: $acronym")
}