fun main() {
    val numero = 29
    var EhPrimo = true

    for (i in 2 until numero) {
        if (numero % i == 0) {
            EhPrimo = false
        }
    }
    if (EhPrimo && numero > 1) {
        println("O número $numero é primo.")
    } else {
        println("O número $numero não é primo.")
    }
}
