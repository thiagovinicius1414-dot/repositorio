fun main(){
    val meta = 500.0
    val depositos = listOf(100.0, 150.0, 200.0, 100.0, 50.0)
    var saldoAtual = 1.0

    for (deposito in depositos) {
        saldoAtual += deposito
        if (saldoAtual >= meta) {
            println("Meta atingida! Saldo atual: R$ $saldoAtual")
        }

    }

}
