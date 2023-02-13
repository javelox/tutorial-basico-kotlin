fun main() {
    println("Ingrese su nombre:")
    val nombre = readLine().toString()
    println("Ingrese su materia:")
    val materia = readLine().toString()
    println("Ingrese la nota1:")
    val nota1 = readLine()!!.toFloat()
    println("Ingrese la nota2:")
    val nota2 = readLine()!!.toFloat()
    println("Ingrese la nota3:")
    val nota3 = readLine()!!.toFloat()
    val prom = (nota1 + nota2 + nota3) / 3
    println("El promedio de notas es: $prom")
    if (prom >= 3.5) {
    println("El estudiante $nombre GANÓ la materia $materia")
    } else {
    println("El estudiante $nombre PERDIÓ la materia $materia")
    }
    }