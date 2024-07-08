/**
 * Contoh Kelas Pembelajaran Ekspresi If.
 *
 * Kelas ini menyediakan contoh-contoh penggunaan ekspresi if dalam bahasa Kotlin.
 */
class LatihanKeDuaPuluhTiga {

    /**
     * Menentukan nilai maksimum dari dua bilangan menggunakan ekspresi if.
     *
     * @param a Bilangan pertama.
     * @param b Bilangan kedua.
     * @return Nilai maksimum dari a dan b.
     */
    fun maksDenganIf(a: Int, b: Int): Int {
        return if (a > b) {
            a
        } else {
            b
        }
    }

    /**
     * Menentukan apakah suatu bilangan adalah positif, negatif, atau nol menggunakan ekspresi if.
     *
     * @param a Bilangan yang akan diperiksa.
     * @return Deskripsi apakah bilangan tersebut positif, negatif, atau nol.
     */
    fun deskripsiBilangan(a: Int): String {
        return if (a > 0) {
            "Positif"
        } else if (a < 0) {
            "Negatif"
        } else {
            "Nol"
        }
    }

    /**
     * Menentukan diskon berdasarkan jumlah pembelian menggunakan ekspresi if.
     *
     * @param jumlahPembelian Jumlah total pembelian.
     * @return Persentase diskon berdasarkan jumlah pembelian.
     */
    fun hitungDiskon(jumlahPembelian: Double): Double {
        return if (jumlahPembelian > 1000) {
            0.1 // 10% diskon
        } else if (jumlahPembelian > 500) {
            0.05 // 5% diskon
        } else {
            0.0 // Tidak ada diskon
        }
    }

    /**
     * Menentukan status kelulusan berdasarkan nilai ujian menggunakan ekspresi if.
     *
     * @param nilai Nilai ujian.
     * @return Status kelulusan ("Lulus" atau "Tidak Lulus").
     */
    fun statusKelulusan(nilai: Int): String {
        return if (nilai >= 60) {
            "Lulus"
        } else {
            "Tidak Lulus"
        }
    }
}

/**
 * Fungsi utama untuk menunjukkan contoh penggunaan dari kelas LatihanKeDuaPuluhTiga.
 */
fun main() {
    val ekspresiIf = LatihanKeDuaPuluhTiga()

    val a = 5
    val b = 10
    val nilaiUjian = 75
    val jumlahPembelian = 750.0

    println("Nilai maksimum antara $a dan $b: ${ekspresiIf.maksDenganIf(a, b)}") // Output: 10
    println("Deskripsi bilangan $a: ${ekspresiIf.deskripsiBilangan(a)}") // Output: Positif
    println("Diskon untuk pembelian sebesar $jumlahPembelian: ${ekspresiIf.hitungDiskon(jumlahPembelian) * 100}%") // Output: 5.0%
    println("Status kelulusan dengan nilai $nilaiUjian: ${ekspresiIf.statusKelulusan(nilaiUjian)}") // Output: Lulus
}