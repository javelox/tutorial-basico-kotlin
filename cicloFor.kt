fun main() {
    print("Ingrese la cantidad de números a procesar: ")
    val cantidad = readLine()!!.toInt()
    for (i in 1..cantidad) {
    print("Ingrese un número: ")
    val numero = readLine()!!.toInt()
    if (numero % 11 == 0) {
    println("El número $numero es divisible entre 11")
    } else {
    println("El número $numero no es divisible entre 11")
    }
    }
    }