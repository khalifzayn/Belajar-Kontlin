/**
 * Contoh penggunaan when expression dalam Kotlin.
 */
class LatihanKeduaPuluhEmpat {

    /**
     * Mengembalikan nama hari berdasarkan nomor hari dalam seminggu.
     *
     * @param dayNumber Nomor hari (1 hingga 7, di mana 1 adalah Senin dan 7 adalah Minggu)
     * @return Nama hari dalam bahasa Indonesia
     */
    fun getDayName(dayNumber: Int): String {
        return when (dayNumber) {
            1 -> "Senin"
            2 -> "Selasa"
            3 -> "Rabu"
            4 -> "Kamis"
            5 -> "Jumat"
            6 -> "Sabtu"
            7 -> "Minggu"
            else -> "Hari tidak valid"
        }
    }

    /**
     * Mengkategorikan angka sebagai positif, negatif, atau nol.
     *
     * @param number Angka yang akan dikategorikan
     * @return Kategori angka ("Positif", "Negatif", atau "Nol")
     */
    fun categorizeNumber(number: Int): String {
        return when {
            number > 0 -> "Positif"
            number < 0 -> "Negatif"
            else -> "Nol"
        }
    }

    /**
     * Mengembalikan jenis karakter berdasarkan input.
     *
     * @param ch Karakter yang akan dievaluasi
     * @return Jenis karakter ("Huruf", "Angka", atau "Karakter Khusus")
     */
    fun getCharacterType(ch: Char): String {
        return when (ch) {
            in 'a'..'z', in 'A'..'Z' -> "Huruf"
            in '0'..'9' -> "Angka"
            else -> "Karakter Khusus"
        }
    }

    /**
     * Mengembalikan deskripsi objek berdasarkan jenisnya.
     *
     * @param obj Objek yang akan dievaluasi
     * @return Deskripsi objek
     */
    fun describeObject(obj: Any): String {
        return when (obj) {
            is String -> "Ini adalah sebuah String"
            is Int -> "Ini adalah sebuah Integer"
            is Boolean -> "Ini adalah sebuah Boolean"
            else -> "Tipe data tidak dikenal"
        }
    }

    /**
     * Mengembalikan rekomendasi berdasarkan musim.
     *
     * @param season Musim (Spring, Summer, Fall, Winter)
     * @return Rekomendasi kegiatan berdasarkan musim
     */
    fun recommendActivity(season: String): String {
        return when (season.toLowerCase()) {
            "spring" -> "Saatnya berkebun!"
            "summer" -> "Pergi berenang!"
            "fall" -> "Waktunya memetik apel!"
            "winter" -> "Bermain ski!"
            else -> "Musim tidak dikenal"
        }
    }
}

fun main() {
    val whenExpression = LatihanKeduaPuluhEmpat()

    println(whenExpression.getDayName(3)) // Output: Rabu
    println(whenExpression.categorizeNumber(-5)) // Output: Negatif
    println(whenExpression.getCharacterType('A')) // Output: Huruf
    println(whenExpression.describeObject(123)) // Output: Ini adalah sebuah Integer
    println(whenExpression.recommendActivity("Summer")) // Output: Pergi berenang!
}