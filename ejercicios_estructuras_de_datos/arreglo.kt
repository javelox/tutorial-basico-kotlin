// ejercicio con arreglos 
// Supongamos que queremos crear un programa que pida al usuario que ingrese una lista de números enteros y luego calcule la suma y el promedio de esos números. Podemos hacer esto utilizando un arreglo y un ciclo for

fun main() {
    // Pedir al usuario que ingrese una lista de números enteros separados por comas
    println("Ingrese una lista de números enteros separados por comas:")
    val input = readLine()
    
    // Convertir la entrada del usuario en un arreglo de enteros
    val numbers = input?.split(",")?.map { it.toInt() }?.toIntArray() ?: intArrayOf()
    
    // Calcular la suma y el promedio de los números
    var sum = 0
    for (number in numbers) {
        sum += number
    }
    val average = sum.toDouble() / numbers.size
    
    // Imprimir los resultados
    println("La suma de los números es: $sum")
    println("El promedio de los números es: $average")
}