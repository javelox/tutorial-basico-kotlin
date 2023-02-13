fun main() {
    println("Ingrese el valor de la compra:")
    var valorCompra = readLine()!!.toDouble()//pedimos el valor de la compra
    println("Valor Compra: $valorCompra")
    var descuento:Double? // usamos ? para que la variable no reciba valores nulos
    if (valorCompra >= 100000) {
    descuento = valorCompra * 0.5 // realizamos la operacion para sacar el descento 
    valorCompra -= descuento // aplicamos le descuento a el valor de la compra
    println("Se aplicó un descuento del 50% equivalente a: $descuento")
    }
    println("Valor Final: $valorCompra")
    }