fun main() {
    println("Ingrese su nombre ")
    val nombre = readLine()!!
    println("Ingrese la Materia ")
    val materia = readLine()!!
    println("Ingrese la primera nota")
    val nota1 = readLine()!!.toFloat()
    println("Ingrese la segunda nota")
    val nota2 = readLine()!!.toFloat()
    println("Ingrese la tercera nota")
    val nota3 = readLine()!!.toFloat()
    val prom = (nota1 + nota2 + nota3) / 3
    println("El promedio de notas es: $prom")
    if (prom >= 3.5) {
    println("El estudiante $nombre GANÓ la materia $materia")
    } else {
    println("El estudiante $nombre PERDIÓ la materia $materia")
    if (prom >= 2.5) {
    println("$nombre Puede recuperar")
    }
    }
    }