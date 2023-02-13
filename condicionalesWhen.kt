fun main(){
    var menu="""
        MENU DE OPCIONES
        1. Saludar
        2. Pedir Nombre de una Persona
        3. Sumar 2 Números
        Ingrese una opción :"""
        print(menu)
        var opcion=readLine()?.toInt()
        when (opcion) {
        1 -> println("Hola!")
        2 -> {
        print("Ingresa el nombre de una persona: ")
        val name = readLine()
        println("Hola, $name")
        }
        3 -> {
        print("Ingresa el primer número: ")
        val num1 = readLine()!!.toInt()
        print("Ingresa el segundo número: ")
        val num2 = readLine()!!.toInt()
        var resultado = num1 + num2
        println("La suma de $num1 y $num2 es $resultado ")
        }
        else -> println("Opción inválida")
        }
    }