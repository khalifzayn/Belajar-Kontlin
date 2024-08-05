/**
 * Contoh penggunaan closure di Kotlin.
 */
class Closure {

    /**
     * Fungsi untuk menghasilkan fungsi closure yang menambahkan nilai dengan basis yang diberikan.
     * Fungsi ini menunjukkan bagaimana closure dapat "menutup" variabel dari lingkup luar.
     *
     * @param base Angka dasar yang akan digunakan oleh closure untuk penambahan.
     * @return Fungsi lambda yang menambahkan angkanya dengan base.
     */
    fun createAdder(base: Int): (Int) -> Int {
        // Fungsi lambda yang mengakses variabel base dari lingkup luar.
        return { number: Int ->
            base + number
        }
    }

    /**
     * Fungsi untuk menghasilkan fungsi closure yang mengulangi sebuah string dengan basis yang diberikan.
     * Fungsi ini menunjukkan bagaimana closure dapat "menutup" variabel dari lingkup luar.
     *
     * @param times Jumlah pengulangan string yang akan digunakan oleh closure.
     * @return Fungsi lambda yang mengulangi string dengan times.
     */
    fun createStringRepeater(times: Int): (String) -> String {
        // Fungsi lambda yang mengakses variabel times dari lingkup luar.
        return { str: String ->
            str.repeat(times)
        }
    }

    /**
     * Contoh menjalankan fungsi-fungsi closure yang telah didefinisikan.
     */
    fun runExamples() {
        // Menggunakan fungsi closure untuk menambahkan angka
        val addFive = createAdder(5)
        val sumResult = addFive(10)
        println("Hasil penambahan dengan base 5: $sumResult") // Output: Hasil penambahan dengan base 5: 15

        // Menggunakan fungsi closure untuk mengulangi string
        val repeatTwice = createStringRepeater(2)
        val repeatedString = repeatTwice("Hello ")
        println("Hasil pengulangan string dua kali: $repeatedString") // Output: Hasil pengulangan string dua kali: Hello Hello
    }
}

/**
 * Fungsi utama untuk menjalankan contoh penggunaan closure.
 */
fun main() {
    val example = Closure()
    example.runExamples()
}