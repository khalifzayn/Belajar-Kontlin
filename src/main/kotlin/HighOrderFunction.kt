/**
 * Contoh penggunaan fungsi high-order di Kotlin.
 */
class HigherOrderFunction {

    /**
     * Fungsi high-order yang menerima dua angka dan fungsi operasi sebagai parameter.
     *
     * @param a Angka pertama.
     * @param b Angka kedua.
     * @param operation Fungsi operasi yang akan diterapkan pada dua angka.
     * @return Hasil dari operasi.
     */
    fun performOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
        return operation(a, b)
    }

    /**
     * Fungsi untuk menambahkan dua angka.
     *
     * @param a Angka pertama.
     * @param b Angka kedua.
     * @return Hasil penambahan dari dua angka.
     */
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    /**
     * Fungsi untuk mengalikan dua angka.
     *
     * @param a Angka pertama.
     * @param b Angka kedua.
     * @return Hasil perkalian dari dua angka.
     */
    fun multiply(a: Int, b: Int): Int {
        return a * b
    }

    /**
     * Menjalankan contoh penggunaan fungsi high-order.
     */
    fun runExamples() {
        // Menggunakan fungsi high-order untuk menambahkan dua angka
        val sumResult = performOperation(5, 6, ::add)
        println("Hasil penambahan: $sumResult")

        // Menggunakan fungsi high-order untuk mengalikan dua angka
        val productResult = performOperation(5, 6, ::multiply)
        println("Hasil perkalian: $productResult")

        // Menggunakan fungsi high-order dengan lambda expression
        val customOperationResult = performOperation(5, 6) { x, y -> x - y }
        println("Hasil operasi custom (pengurangan): $customOperationResult")
    }
}

/**
 * Fungsi utama dari program yang membuat instance dari HigherOrderFunction dan menjalankan contoh-contohnya.
 */
fun main() {
    val examples = HigherOrderFunction()
    examples.runExamples()
}