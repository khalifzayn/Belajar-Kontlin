/**
 * Kelas LatihanKetiga merupakan kelas contoh untuk latihan.
 *
 * @since 1.0
 * @author Faisal Zuhri
 */
class LatihanKetiga {

    companion object {

        /**
         * Pesan yang akan dimodifikasi dan dikirim.
         *
         * Nilai awalnya adalah "Hallo".
         *
         * @since 1.0
         */
        var message: String = ""

        /**
         * Mengirimkan pesan yang telah dimodifikasi dengan menambahkan "Arfan" ke dalamnya.
         *
         * @return Pesan yang telah dimodifikasi.
         * @since 1.0
         */
        fun sendMessage(
            newValue: String
        ): String {
            message += newValue
            return message.also { value ->
                println(value)
            }
        }
    }
}

/**
 * Fungsi utama yang menjalankan program.
 *
 * Mengubah nilai pesan menjadi "Hi " dan kemudian memanggil fungsi sendMessage untuk
 * menampilkan dan mengembalikan pesan yang telah dimodifikasi.
 *
 * @since 1.0
 */
fun main() {
    LatihanKetiga.message = "Hi "
    LatihanKetiga.sendMessage(newValue = "Faisal")
}