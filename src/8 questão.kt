fun main() {
    val pratos = listOf("Hamburguer", "Pizza", "Sushi", "Lasanha")
    val itemEsgotado = "Pizza"

    for (item in pratos) {
        if (item == itemEsgotado) {
            continue
        } else {
            println("Item disponível: $item")

        }
    }
}
