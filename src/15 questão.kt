fun main() {
    val lotes = listOf(
        listOf(100.0, 50.0, 200.0),
        listOf(80.0, -20.0, 150.0),
        listOf(30.0, 40.0)
    )
    loopLotes@ for ((indexLote, lote) in lotes.withIndex()) {
        println("Processando Lote ${indexLote + 1}...")

        for (transacao in lote) {
            if (transacao < 0.0) {
                println("Transação inválida encontrada (R$ $transacao). Interrompendo todo o processamento!")
            }
            println("-> Transação de R$ $transacao processada com sucesso.")
        }
    }
}
