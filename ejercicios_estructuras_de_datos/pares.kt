// ejercicio con pares
// Supongamos que queremos crear un programa que permita al usuario ingresar dos números 
// y luego imprima el par de números ordenados de menor a mayor. Podemos utilizar pares 
// para representar los números y la función sorted()

fun main() {
    // Pedir al usuario que ingrese dos números separados por comas
    println("Ingrese dos números separados por comas:")
    val input = readLine()
    
    // Convertir la entrada del usuario en un par de números
    val pair = input?.split(",")?.map { it.trim().toInt() }?.let {
        if (it.size == 2) it[0] to it[1]
        else null
    }
    
    // Imprimir el par de números ordenados de menor a mayor
    if (pair != null) {
        val (a, b) = pair.sorted()
        println("Los números ordenados son: $a, $b")
    } else {
        println("Debe ingresar dos números separados por comas")
    }
}