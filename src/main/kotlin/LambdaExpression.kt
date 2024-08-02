/**
 * Kelas ini menunjukkan penggunaan variabel lambda expression di Kotlin.
 */
class LambdaExpression {

    /**
     * Lambda expression untuk menambahkan dua angka.
     *
     * @return Hasil penambahan dari dua angka.
     */
    val add: (Int, Int) -> Int = { a, b ->
        a + b
    }

    /**
     * Lambda expression untuk mengulangi sebuah string beberapa kali.
     *
     * @return String yang diulang beberapa kali.
     */
    val repeat: (String, Int) -> String = { str, times ->
        str.repeat(times)
    }

    /**
     * Menjalankan contoh penggunaan lambda expressions.
     */
    fun runSample() {
        // Menggunakan lambda untuk menambahkan dua angka
        val sumResult = add(5, 10)
        println("Hasil penambahan: $sumResult")

        // Menggunakan lambda untuk mengulangi sebuah string
        val repeatedString = repeat("Hello", 3)
        println("Hasil pengulangan string: $repeatedString")
    }
}

fun main() {
    val examples = LambdaExpression()
    examples.runSample()
}