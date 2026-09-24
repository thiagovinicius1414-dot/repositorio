fun main() {
    val n = 5

    for (linha in 0 until n) {
        for (coluna in 0 until n) {
            if (linha == coluna) {
                print("X ")
            } else {
                print("* ")
            }
         }
        println()
        }
    }
