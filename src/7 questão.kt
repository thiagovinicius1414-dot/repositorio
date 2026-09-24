fun main() {
    var progresso = 100

    for (progresso in 0..100 step 10) {
        if (progresso == 50) {
            println("Erro no download! Operação cancelada.")
        } else {
            println("Download em $progresso%")
        }
    }
}
