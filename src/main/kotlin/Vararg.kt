/**
 * Contoh kelas untuk mendemonstrasikan penggunaan variadic parameters (vararg) dalam Kotlin.
 */
class Vararg {

    /**
     * Menggabungkan beberapa string menjadi satu string dengan separator yang diberikan.
     *
     * @param separator String yang digunakan sebagai pemisah antar string.
     * @param strings Variadic parameter yang berisi sejumlah string yang akan digabungkan.
     * @return Hasil penggabungan dari semua string yang diberikan dengan separator di antara mereka.
     */
    fun concatenateStrings(separator: String, vararg strings: String): String {
        return strings.joinToString(separator)
    }

    /**
     * Menghitung jumlah dari sejumlah angka yang diberikan sebagai variadic parameter.
     *
     * @param numbers Variadic parameter yang berisi sejumlah angka yang akan dijumlahkan.
     * @return Jumlah dari semua angka yang diberikan.
     */
    fun sumNumbers(vararg numbers: Int): Int {
        return numbers.sum()
    }

    /**
     * Mengonversi sejumlah nilai double ke dalam format string dengan dua desimal.
     *
     * @param values Variadic parameter yang berisi sejumlah nilai double yang akan dikonversi.
     * @return Daftar string yang merepresentasikan nilai double yang telah diformat.
     */
    fun formatDoubles(vararg values: Double): List<String> {
        return values.map { String.format("%.2f", it) }
    }
}

fun main() {
    val vararg = Vararg()

    // Menggabungkan beberapa string dengan separator ", "
    val concatenated = vararg.concatenateStrings(", ", "Kotlin", "is", "fun")
    println("Concatenated Strings: $concatenated")  // Output: Concatenated Strings: Kotlin, is, fun

    // Menghitung jumlah dari beberapa angka
    val sum = vararg.sumNumbers(1, 2, 3, 4, 5)
    println("Sum of Numbers: $sum")  // Output: Sum of Numbers: 15

    // Mengonversi beberapa nilai double ke dalam format string dengan dua desimal
    val formattedDoubles = vararg.formatDoubles(3.14159, 2.71828, 1.61803)
    println("Formatted Doubles: $formattedDoubles")  // Output: Formatted Doubles: [3.14, 2.72, 1.62]
}