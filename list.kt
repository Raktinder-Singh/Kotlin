fun main(){
    //Mutable list and its basic functions
    val solarSystem = mutableListOf<String>("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Satrun", "Uranas", "Mars")
    println(solarSystem.size)
    println(solarSystem[2])
    println(solarSystem.get(3))
    println(solarSystem.indexOf("Earth"))
    println(solarSystem.indexOf("Pluto"))
    
    println()
    //for loop to iterate over a list
     for(planet in solarSystem){
        println(planet)
    }
    
    println()
    //adding an element to the list
    solarSystem.add("Pluto")
    solarSystem.add(3, "Theia")
    
    println()
    //updating the existing element
    solarSystem[3] = "Future Moon"
    
    println()
    println(solarSystem[3])
    println(solarSystem[9])
    
    println()
    //removing the element
    solarSystem.removeAt(9)
    solarSystem.remove("Future Moon")
    
    println()
    //checking whether the element is present in the list
    println(solarSystem.contains("Pluto"))
    println("Future Moon" in solarSystem)
}
