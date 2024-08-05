/**
 * Contoh penggunaan anonymous functions di Kotlin.
 */
class AnonymousFunction {

    /**
     * Fungsi anonim untuk menambahkan dua angka.
     * Fungsi ini tidak memiliki nama dan langsung didefinisikan saat dideklarasikan.
     */

    val add: (Int, Int) -> Int = fun(a: Int, b: Int): Int {
        return a + b
    }

    /**
     * Fungsi anonim untuk mengalikan dua angka.
     * Fungsi ini tidak memiliki nama dan langsung didefinisikan saat dideklarasikan.
     */

    val multiply: (Int, Int) -> Int = fun(a: Int, b: Int): Int {
        return a * b
    }

    /**
     * Fungsi anonim untuk mengulangi sebuah string sebanyak 'times' kali.
     * Fungsi ini tidak memiliki nama dan langsung didefinisikan saat dideklarasikan.
     */

    val repeatString: (String, Int) -> String = fun(str: String, times: Int): String {
        return str.repeat(times)
    }

    /**
     * Contoh menjalankan fungsi-fungsi anonim yang telah didefinisikan.
     */
    fun runExamples() {
        // Menggunakan fungsi anonim untuk menambahkan dua angka
        val sumResult = add(5, 6)
        println("Hasil penambahan: $sumResult") // Output: Hasil penambahan: 11

        // Menggunakan fungsi anonim untuk mengalikan dua angka
        val multiplyResult = multiply(5, 6)
        println("Hasil perkalian: $multiplyResult") // Output: Hasil perkalian: 30

        // Menggunakan fungsi anonim untuk mengulangi sebuah string
        val repeatedString = repeatString("Kotlin", 3)
        println("Hasil pengulangan string: $repeatedString") // Output: Hasil pengulangan string: KotlinKotlinKotlin
    }
}

/**
 * Fungsi utama untuk menjalankan contoh penggunaan anonymous functions.
 */
fun main() {
    val example = AnonymousFunction()
    example.runExamples()
}