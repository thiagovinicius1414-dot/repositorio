fun main() {
    val nomes = listOf("Ana", "Bruno", "Carlos", "Diana")
    val idades = listOf(17, 21, 15, 30)

    for (i in nomes.indices){
        val nome = nomes[i]
        val idade = idades[i]

        val classificacao = when {
            idade < 18 -> "Acesso Negado (Menor de idade)"
            idade in 18..25 -> "Acesso Permitido (Perfil Jovem)"
            else -> "Acesso Permitido (Perfil Sênior)"
        }
        println("$nome: $classificacao")
    }
}
