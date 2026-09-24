fun main() {
    val numero = 6
    var resultado = 1

    if (numero == 0 || numero == 1) {
        resultado = 1
    } else {
        for (i in numero downTo 1) {
            resultado *= i
        }
    }

    println("O fatorial de $numero é $resultado")
}
