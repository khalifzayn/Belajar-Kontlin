/**
 * Kumpulan fungsi utilitas untuk konversi tipe data di Kotlin.
 *
 * Fungsi-fungsi ini menyediakan konversi umum tipe data, seperti mengubah string menjadi integer atau double,
 * dan integer menjadi double, dengan penanganan kesalahan untuk konversi yang tidak valid.
 *
 * @property ConversionUtils Objek utilitas yang berisi fungsi-fungsi konversi.
 * @since 2024-06-03
 * @version 1.0
 */
object ConversionUtils {

    /**
     * Mengonversi sebuah [String] menjadi [Int].
     * Mengembalikan null jika [String] tidak dapat dikonversi menjadi [Int].
     *
     * @param str [String] yang akan dikonversi.
     * @return [Int] yang telah dikonversi atau null jika konversi gagal.
     * @throws NumberFormatException jika string tidak dapat diubah menjadi integer.
     */
    fun stringToInt(str: String): Int? {
        return try {
            str.toInt()
        } catch (e: NumberFormatException) {
            null
        }
    }

    /**
     * Mengonversi sebuah [String] menjadi [Double].
     * Mengembalikan null jika [String] tidak dapat dikonversi menjadi [Double].
     *
     * @param str [String] yang akan dikonversi.
     * @return [Double] yang telah dikonversi atau null jika konversi gagal.
     * @throws NumberFormatException jika string tidak dapat diubah menjadi double.
     */
    fun stringToDouble(str: String): Double? {
        return try {
            str.toDouble()
        } catch (e: NumberFormatException) {
            null
        }
    }

    /**
     * Mengonversi sebuah [Int] menjadi [Double].
     *
     * @param number [Int] yang akan dikonversi.
     * @return [Double] yang telah dikonversi.
     */
    fun intToDouble(number: Int): Double {
        return number.toDouble()
    }

    /**
     * Mengonversi sebuah [Double] menjadi [String].
     *
     * @param number [Double] yang akan dikonversi.
     * @return [String] yang telah dikonversi.
     */
    fun doubleToString(number: Double): String {
        return number.toString()
    }

    /**
     * Mengonversi sebuah [String] menjadi [Float].
     * Mengembalikan null jika [String] tidak dapat dikonversi menjadi [Float].
     *
     * @param str [String] yang akan dikonversi.
     * @return [Float] yang telah dikonversi atau null jika konversi gagal.
     * @throws NumberFormatException jika string tidak dapat diubah menjadi float.
     */
    fun stringToFloat(str: String): Float? {
        return try {
            str.toFloat()
        } catch (e: NumberFormatException) {
            null
        }
    }

    /**
     * Mengonversi sebuah [Float] menjadi [String].
     *
     * @param number [Float] yang akan dikonversi.
     * @return [String] yang telah dikonversi.
     */
    fun floatToString(number: Float): String {
        return number.toString()
    }

    /**
     * Mengonversi sebuah [String] menjadi [Long].
     * Mengembalikan null jika [String] tidak dapat dikonversi menjadi [Long].
     *
     * @param str [String] yang akan dikonversi.
     * @return [Long] yang telah dikonversi atau null jika konversi gagal.
     * @throws NumberFormatException jika string tidak dapat diubah menjadi long.
     */
    fun stringToLong(str: String): Long? {
        return try {
            str.toLong()
        } catch (e: NumberFormatException) {
            null
        }
    }

    /**
     * Mengonversi sebuah [Long] menjadi [String].
     *
     * @param number [Long] yang akan dikonversi.
     * @return [String] yang telah dikonversi.
     */
    fun longToString(number: Long): String {
        return number.toString()
    }
}

/**
 * Fungsi utama untuk mendemonstrasikan penggunaan fungsi utilitas konversi.
 *
 * Fungsi utama ini menampilkan berbagai operasi konversi seperti mengonversi
 * string menjadi integer, integer menjadi double, dan double menjadi string.
 * Ini juga menunjukkan penanganan kesalahan untuk konversi yang tidak valid.
 *
 * @since 2024-06-03
 */
fun main() {
    val str = "123"
    val invalidStr = "abc"
    val intNumber = 42
    val doubleNumber = 42.42
    val floatNumber = 42.42f
    val longNumber = 123456789L

    // String ke Int
    println("String ke Int:")
    println("Konversi valid: ${ConversionUtils.stringToInt(str)}") // Output: 123
    println("Konversi tidak valid: ${ConversionUtils.stringToInt(invalidStr)}") // Output: null

    // String ke Double
    println("\nString ke Double:")
    println("Konversi valid: ${ConversionUtils.stringToDouble(str)}") // Output: 123.0
    println("Konversi tidak valid: ${ConversionUtils.stringToDouble(invalidStr)}") // Output: null

    // Int ke Double
    println("\nInt ke Double:")
    println("Konversi: ${ConversionUtils.intToDouble(intNumber)}") // Output: 42.0

    // Double ke String
    println("\nDouble ke String:")
    println("Konversi: ${ConversionUtils.doubleToString(doubleNumber)}") // Output: "42.42"

    // String ke Float
    println("\nString ke Float:")
    println("Konversi valid: ${ConversionUtils.stringToFloat(str)}") // Output: 123.0
    println("Konversi tidak valid: ${ConversionUtils.stringToFloat(invalidStr)}") // Output: null

    // Float ke String
    println("\nFloat ke String:")
    println("Konversi: ${ConversionUtils.floatToString(floatNumber)}") // Output: "42.42"

    // String ke Long
    println("\nString ke Long:")
    println("Konversi valid: ${ConversionUtils.stringToLong(str)}") // Output: 123
    println("Konversi tidak valid: ${ConversionUtils.stringToLong(invalidStr)}") // Output: null

    // Long ke String
    println("\nLong ke String:")
    println("Konversi: ${ConversionUtils.longToString(longNumber)}") // Output: "123456789"
}