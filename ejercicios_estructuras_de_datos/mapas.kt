// ejercicio con mapas
// Supongamos que queremos crear un programa que pida al usuario que ingrese una 
// lista de nombres y edades y luego imprima los nombres y edades en orden alfabético. 
// Podemos hacer esto utilizando un mapa y la función toSortedMap().

fun main() {
    // Pedir al usuario que ingrese una lista de nombres y edades separados por comas
    println("Ingrese una lista de nombres y edades separados por comas:")
    val input = readLine()
    
    // Convertir la entrada del usuario en un mapa de nombres y edades
    val nameToAge = input?.split(",")?.map {
        val parts = it.trim().split(" ")
        parts[0] to parts[1].toInt()
    }?.toMap() ?: emptyMap()
    
    // Imprimir los nombres y edades en orden alfabético
    println("Los nombres y edades en orden alfabético son:")
    for ((name, age) in nameToAge.toSortedMap()) {
        println("$name: $age años")
    }
}