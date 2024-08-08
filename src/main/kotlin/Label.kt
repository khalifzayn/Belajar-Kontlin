/**
 * Kelas yang menunjukkan penggunaan label dalam loop dan fungsi.
 *
 * Kelas ini menyediakan metode untuk menghitung jumlah total
 * angka dalam daftar dan menunjukkan cara menggunakan label
 * untuk keluar dari loop bersarang.
 */
class LabelExample {

    /**
     * Menghitung total dari daftar angka dan menunjukkan cara menggunakan label.
     *
     * Fungsi ini menerima daftar angka dan menghitung jumlah totalnya.
     * Jika menemukan angka negatif, loop akan dihentikan dengan label.
     *
     * @param numbers Daftar angka yang akan dihitung totalnya.
     * @return Total dari angka dalam daftar, atau 0 jika terdapat angka negatif.
     */
    fun calculateTotal(numbers: List<Int>): Int {
        var total = 0

        // Label untuk loop utama
        outerLoop@ for (number in numbers) {
            // Jika angka negatif ditemukan, keluar dari loop dengan label
            if (number < 0) {
                println("Angka negatif ditemukan: $number. Menghentikan perhitungan.")
                break // Keluar dari loop
            }
            total += number // Tambahkan angka ke total
        }
        return total // Mengembalikan total
    }
}

fun main() {
    val example = LabelExample() // Membuat instance dari LabelExample

    // Daftar angka untuk dihitung totalnya
    val numbers = listOf(1, 2, 3, 4, -1, 5, 6)

    // Menghitung total dan mencetak hasilnya
    val total = example.calculateTotal(numbers)
    println("Total angka: $total") // Menampilkan total angka
}