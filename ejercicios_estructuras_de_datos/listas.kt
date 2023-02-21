// ejercicio con listas

// Supongamos que queremos crear un programa que pida al usuario que ingrese 
// una lista de nombres y luego imprima los nombres en orden inverso. Podemos 
// hacer esto utilizando una lista y la función reversed()

fun main() {
    // Pedir al usuario que ingrese una lista de nombres separados por comas
    println("Ingrese una lista de nombres separados por comas:")
    val input = readLine()
    
    // Convertir la entrada del usuario en una lista de cadenas
    val names = input?.split(",") ?: emptyList()
    
    // Imprimir los nombres en orden inverso
    println("Los nombres en orden inverso son:")
    for (name in names.reversed()) {
        println(name)
    }
}