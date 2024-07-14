/**
 * Class yang menunjukkan penggunaan break dan continue dalam loop di Kotlin.
 */
class LatihanDuaPuluhTujuh {

    /**
     * Metode ini menunjukkan bagaimana menggunakan break dalam loop.
     */
    fun demonstrateBreak() {
        println("Demonstrasi penggunaan break:")
        for (i in 1..10) {
            if (i == 5) {
                println("Break pada i = $i")
                break // Menghentikan loop ketika i sama dengan 5
            }
            println("i = $i")
        }
    }

    /**
     * Metode ini menunjukkan bagaimana menggunakan continue dalam loop.
     */
    fun demonstrateContinue() {
        println("Demonstrasi penggunaan continue:")
        for (i in 1..10) {
            if (i == 5) {
                println("Continue pada i = $i")
                continue // Melewati iterasi saat i sama dengan 5
            }
            println("i = $i")
        }
    }
}

fun main() {
    val loopExample = LatihanDuaPuluhTujuh()

    // Demonstrasi penggunaan break
    loopExample.demonstrateBreak()

    // Demonstrasi penggunaan continue
    loopExample.demonstrateContinue()
}