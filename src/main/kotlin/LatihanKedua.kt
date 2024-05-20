/**
 * Kelas LatihanKedua berisi fungsi-fungsi untuk menampilkan data seperti nama dan umur.
 *
 * @author Faisal Zuhri
 * @since 1.0
 * @version 1.0
 */
class LatihanKedua {

    companion object {

        /**
         * Menampilkan nama yang diberikan.
         *
         * @param valueName Nama yang akan ditampilkan. Nilai default adalah string kosong.
         * @sample LatihanKedua.Companion.showingDataName("John Doe")
         * @throws IllegalArgumentException jika valueName berisi karakter tidak valid.
         */
        fun showingDataName(valueName: String = "") {
            // valueName = "Value Baru" ini akan menyebabkan error saat kompilasi

            println("Nama: $valueName")
        }

        /**
         * Menampilkan umur yang diberikan.
         *
         * @param valueAge Umur yang akan ditampilkan. Nilai default adalah 0.
         * @sample LatihanKedua.Companion.showingDataAge(25)
         * @throws IllegalArgumentException jika valueAge negatif.
         */
        fun showingDataAge(valueAge: Int = 0) {

            // valueAge = 24 ini akan menyebabkan error saat kompilasi

            println("Age: $valueAge")
        }

        /**
         * Menjalankan semua fungsi di dalam kelas LatihanKedua.
         *
         * @sample LatihanKedua.Companion.runAll()
         */
        fun runAll() {
            showingDataName()
            showingDataAge()
        }
    }
}

/**
 * Fungsi main untuk menjalankan LatihanKedua.
 *
 * @sample main()
 */
fun main() {
    LatihanKedua.runAll()
}