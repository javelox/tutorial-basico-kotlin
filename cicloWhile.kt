fun main() {
    var resp = "si"
    var cont = 0
    while (resp == "si") {
    print("\nIngrese su nombre: ")
    val nombre = readLine()!!
    println("Hola $nombre bienvenido a la clase!\n")
    cont++
    print("Ingrese si, si hay más personas: ")
    resp = readLine()!!
    }
    println("Llegaron $cont Personas!")
    println("Fin del Ciclo!")
    }