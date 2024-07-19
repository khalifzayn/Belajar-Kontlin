/**
 * Contoh kelas untuk mendemonstrasikan penggunaan single expression functions dalam Kotlin.
 */
class SingleExpressionFunction {

    /**
     * Menghitung kuadrat dari sebuah angka menggunakan single expression function.
     *
     * @param number Angka yang akan dikuadratkan.
     * @return Hasil kuadrat dari angka yang diberikan.
     */
    fun square(number: Int): Int = number * number

    /**
     * Mengonversi suhu dari Celsius ke Fahrenheit menggunakan single expression function.
     *
     * @param celsius Suhu dalam Celsius.
     * @return Suhu dalam Fahrenheit.
     */
    fun celsiusToFahrenheit(celsius: Double): Double = celsius * 9 / 5 + 32

    /**
     * Mengecek apakah sebuah angka ganjil menggunakan single expression function.
     *
     * @param number Angka yang akan dicek.
     * @return true jika angka ganjil, false jika angka genap.
     */
    fun isOdd(number: Int): Boolean = number % 2 != 0

    /**
     * Menggabungkan dua string dengan spasi di antara mereka menggunakan single expression function.
     *
     * @param firstString String pertama.
     * @param secondString String kedua.
     * @return Hasil penggabungan kedua string dengan spasi di antara mereka.
     */
    fun concatenateWithSpace(firstString: String, secondString: String): String = "$firstString $secondString"

    /**
     * Menghitung panjang string menggunakan single expression function.
     *
     * @param input String yang akan dihitung panjangnya.
     * @return Panjang dari string yang diberikan.
     */
    fun stringLength(input: String): Int = input.length
}

fun main() {
    val example = SingleExpressionFunction()

    // Menghitung kuadrat dari 4
    println("Square of 4: ${example.square(4)}")  // Output: Square of 4: 16

    // Mengonversi 25 Celsius ke Fahrenheit
    println("25 Celsius to Fahrenheit: ${example.celsiusToFahrenheit(25.0)}")  // Output: 25 Celsius to Fahrenheit: 77.0

    // Mengecek apakah 7 adalah angka ganjil
    println("Is 7 odd? ${example.isOdd(7)}")  // Output: Is 7 odd? true

    // Menggabungkan "Hello" dan "World" dengan spasi
    println("Concatenate 'Hello' and 'World': ${example.concatenateWithSpace("Hello", "World")}")  // Output: Concatenate 'Hello' and 'World': Hello World

    // Menghitung panjang string "Kotlin"
    println("Length of 'Kotlin': ${example.stringLength("Kotlin")}")  // Output: Length of 'Kotlin': 6
}