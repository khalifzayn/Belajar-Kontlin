/**
 * Kelas Latihan Kelima ini menunjukkan penggunaan berbagai jenis literals dalam bahasa Kotlin.
 *
 * Literals yang ditunjukkan termasuk integer, float, double, char, string, boolean, dan null literals.
 *
 * @author [Faisal Zuhri]
 * @version 1.0
 * @since 1.0
 * @source Dokumentasi resmi Kotlin: https://kotlinlang.org/docs/reference/basic-types.html#literal-constants
 */
class LatihanKelima {

    companion object {

        /**
         * Menunjukkan penggunaan integer decimal literal.
         *
         * @param decimalValue Nilai integer desimal, default adalah 42.
         * @return Nilai integer desimal yang diberikan.
         */
        fun integerDecimalLiteral(
            decimalValue: Int = 42
        ): Int {
            return decimalValue.also { value ->
                println("Integer Decimal Literal Value: $value")
            }
        }

        /**
         * Menunjukkan penggunaan integer hex literal.
         *
         * @param hexValue Nilai integer hexadecimal, default adalah 0x7B.
         * @return Nilai integer hexadecimal yang diberikan.
         */
        fun integerHexLiteral(
            hexValue: Int = 0x7B
        ): Int {
            return hexValue.also { value ->
                println("Integer Hex Literal Value: $value")
            }
        }

        /**
         * Menunjukkan penggunaan integer binary literal.
         *
         * @param binaryValue Nilai integer biner, default adalah 0b01111011.
         * @return Nilai integer biner yang diberikan.
         */
        fun integerBinaryLiteral(
            binaryValue: Int = 0b01111011
        ): Int {
            return binaryValue.also { value ->
                println("Integer Binary Literal Value: $value")
            }
        }

        /**
         * Menunjukkan penggunaan integer dengan underscore literal.
         *
         * @param underscoreValue Nilai integer dengan underscore, default adalah 1_000_000.
         * @return Nilai integer dengan underscore yang diberikan.
         */
        fun integerUnderscoreLiteral(
            underscoreValue: Int = 1_000_000
        ): Int {
            return underscoreValue.also { value ->
                println("Integer Underscore Literal Value: $value")
            }
        }

        /**
         * Menunjukkan penggunaan float literal.
         *
         * @param floatValue Nilai float, default adalah 123.45f.
         * @return Nilai float yang diberikan.
         */
        fun floatLiteral(
            floatValue: Float = 123.45f
        ): Float {
            return floatValue.also { value ->
                println("Float Literal Value: $value")
            }
        }

        /**
         * Menunjukkan penggunaan double literal.
         *
         * @param doubleValue Nilai double, default adalah 123.45.
         * @return Nilai double yang diberikan.
         */
        fun doubleLiteral(
            doubleValue: Double = 123.45
        ): Double {
            return doubleValue.also { value ->
                println("Double Literal Value: $value")
            }
        }

        /**
         * Menunjukkan penggunaan scientific double literal.
         *
         * @param scientificValue Nilai double dalam format ilmiah, default adalah 1.23e2.
         * @return Nilai double ilmiah yang diberikan.
         */
        fun doubleScientificLiteral(
            scientificValue: Double = 1.23e2
        ): Double {
            return scientificValue.also { value ->
                println("Double Scientific Literal Value: $value")
            }
        }

        /**
         * Menunjukkan penggunaan character letter literal.
         *
         * @param letterValue Nilai character, default adalah 'K'.
         * @return Nilai character yang diberikan.
         */
        fun charLetterLiteral(
            letterValue: Char = 'K'
        ): Char {
            return letterValue.also { value ->
                println("Char Letter Literal Value: $value")
            }
        }

        /**
         * Menunjukkan penggunaan character digit literal.
         *
         * @param digitValue Nilai character digit, default adalah '9'.
         * @return Nilai character digit yang diberikan.
         */
        fun charDigitLiteral(
            digitValue: Char = '9'
        ): Char {
            return digitValue.also { value ->
                println("Char Digit Literal Value: $value")
            }
        }

        /**
         * Menunjukkan penggunaan character special literal.
         *
         * @param specialValue Nilai character spesial, default adalah '\n'.
         * @return Nilai character spesial yang diberikan.
         */
        fun charSpecialLiteral(
            specialValue: Char = '\n'
        ): Char {
            return specialValue.also { value ->
                println("Char Special Literal Value: $value")
            }
        }

        /**
         * Menunjukkan penggunaan string sederhana literal.
         *
         * @param simpleValue Nilai string sederhana, default adalah "Hello Kotlin".
         * @return Nilai string sederhana yang diberikan.
         */
        fun stringSimpleLiteral(
            simpleValue: String = "Hello Kotlin"
        ): String {
            return simpleValue.also { value ->
                println("String Simple Literal Value: $value")
            }
        }

        /**
         * Menunjukkan penggunaan string multi-baris literal.
         *
         * @param multiLineValue Nilai string multi-baris, default adalah string dengan dua baris teks.
         * @return Nilai string multi-baris yang diberikan.
         */
        fun stringMultiLineLiteral(
            multiLineValue: String = """
                |First Line
                |Second Line
                """.trimMargin()
        ): String {
            return multiLineValue.also { value ->
                println("String Multi Line Literal Value: $value")
            }
        }

        /**
         * Menunjukkan penggunaan boolean true literal.
         *
         * @param trueValue Nilai boolean true, default adalah true.
         * @return Nilai boolean true yang diberikan.
         */
        fun booleanTrueLiteral(
            trueValue: Boolean = true
        ): Boolean {
            return trueValue.also { value ->
                println("Boolean True Literal Value: $value")
            }
        }

        /**
         * Menunjukkan penggunaan boolean false literal.
         *
         * @param falseValue Nilai boolean false, default adalah false.
         * @return Nilai boolean false yang diberikan.
         */
        fun booleanFalseLiteral(
            falseValue: Boolean = false
        ): Boolean {
            return falseValue.also { value ->
                println("Boolean False Literal Value: $value")
            }
        }

        /**
         * Menunjukkan penggunaan null literal.
         *
         * @param nullableValue Nilai string yang dapat bernilai null, default adalah null.
         * @return Nilai string yang dapat bernilai null yang diberikan.
         */
        fun nullLiteral(
            nullableValue: String? = null
        ): String? {
            return nullableValue.also { value ->
                println("Nullable Literal Value: $value")
            }
        }

        /**
         * Menjalankan semua fungsi untuk menunjukkan semua jenis literals.
         */
        fun runAll() {
            integerDecimalLiteral()
            integerHexLiteral()
            integerBinaryLiteral()
            integerUnderscoreLiteral()
            floatLiteral()
            doubleLiteral()
            doubleScientificLiteral()
            charLetterLiteral()
            charDigitLiteral()
            charSpecialLiteral()
            stringSimpleLiteral()
            stringMultiLineLiteral()
            booleanTrueLiteral()
            booleanFalseLiteral()
            nullLiteral()
        }
    }
}

/**
 * Fungsi utama untuk menjalankan semua contoh literals.
 */
fun main() {
    LatihanKelima.runAll()
}