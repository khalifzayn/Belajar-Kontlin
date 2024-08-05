/**
 * Kelas ini menunjukkan penggunaan lambda expression reference di Kotlin.
 */
class LambdaExpressionReference {

    /**
     * Lambda expression untuk menambahkan dua angka.
     *
     * @return Hasil penambahan dari dua angka.
     */
    val add: (Int, Int) -> Int = ::adding

    /**
     * Fungsi yang menambahkan dua angka.
     *
     * @param a Angka pertama.
     * @param b Angka kedua.
     * @return Hasil penambahan dari dua angka.
     */
    private fun adding(a: Int, b: Int): Int {
        return a + b
    }


    /**
     * Lambda expression untuk mengulangi sebuah string beberapa kali.
     *
     * @return String yang diulang beberapa kali.
     */

    val sub: (Int, Int) -> Int = ::sub

    private fun sub(a: Int, b: Int): Int {
        return a - b
    }


    val repeat: (String, Int) -> String = ::repeats


    /**
     * Fungsi yang mengulangi sebuah string beberapa kali.
     *
     * @param str String yang akan diulang.
     * @param times Jumlah pengulangan.
     * @return String yang diulang beberapa kali.
     */
    private fun repeats(str: String, times: Int): String {
        return str.repeat(times)
    }

    /**
     * Menjalankan contoh penggunaan lambda expressions.
     */
    fun runExamples() {
        // Contoh penggunaan lambda untuk menambahkan dua angka
        val sumResult = add(5, 6)
        println("Hasil penambahan: $sumResult")

        // Contoh Penggunaan lambda untuk pengurangan dua angka
        val subResult = sub(5, 6)
        println("Hasil Pengurangan: $subResult")

        // Contoh penggunaan lambda untuk mengulangi sebuah string
        val repeatedString = repeat("Faisal Zuhri", 5)
        println("Hasil pengulangan string: $repeatedString")
    }
}

/**
 * Fungsi utama dari program yang membuat instance dari LambdaExpressionReference dan menjalankan contoh-contohnya.
 */
fun main() {
    val examples = LambdaExpressionReference()
    examples.runExamples()
}