// ejercicio con conjuntos
// Supongamos que queremos crear un programa que pida al usuario que ingrese 
// una lista de números enteros y luego imprima los números únicos en orden ascendente. 
// Podemos hacer esto utilizando un conjunto y la función sorted().

fun main() {
    // Pedir al usuario que ingrese una lista de números enteros separados por comas
    println("Ingrese una lista de números enteros separados por comas:")
    val input = readLine()
    
    // Convertir la entrada del usuario en un conjunto de enteros
    val numbers = input?.split(",")?.map { it.toInt() }?.toSet() ?: emptySet()
    
    // Imprimir los números únicos en orden ascendente
    println("Los números únicos en orden ascendente son:")
    for (number in numbers.sorted()) {
        println(number)
    }
}