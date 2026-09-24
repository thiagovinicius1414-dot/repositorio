fun main(){
    val tarefas = listOf("Estudar Kotlin", "Fazer exercícios", "Comprar pão", "Limpar casa")

    for ((index, tarefa) in tarefas.withIndex())
        println("Tarefa ${index + 1}: $tarefa")

}
