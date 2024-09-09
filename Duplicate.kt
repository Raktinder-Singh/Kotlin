fun main() {
   val array = arrayOf(1, 2, 3, 4)
   val duplicates = findDuplicates(array)
   
   if(duplicates.isNotEmpty()){
       println("Duplicate elements: ${duplicates.joinToString(", ")}")
   }else{
       println("No duplicate elements found.")
   }
}

fun findDuplicates(arr: Array<Int>): Set<Int>{
    val seen = mutableSetOf<Int>()
    val duplicates = mutableSetOf<Int>()
    
    for(element in arr){
        if(!seen.add(element)){
            duplicates.add(element)
        }
    }
    
    return duplicates
}