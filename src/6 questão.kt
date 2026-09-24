fun main() {
    var acumuladora = 0

    for (numero in 2..50 step 2) {
        acumuladora += numero
    }

    println(acumuladora)
}
