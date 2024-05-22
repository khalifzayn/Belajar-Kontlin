/**
 * Latihan Tipe Data Primitive di Kotlin
 *
 * Tipe data primitive di Kotlin mencakup beberapa jenis seperti Byte, Short, Int, Long, Float, Double, Char, dan Boolean.
 * Masing-masing tipe data ini memiliki ukuran dan rentang nilai yang berbeda.
 *
 * @since 1.0
 * @version 1.0
 * @author [Faisal Zuhri]
 */
class LatihanKeempat {
    companion object {
        /**
         * Contoh penggunaan tipe data Byte.
         * Byte memiliki ukuran 8-bit dan rentang nilai dari -128 hingga 127.
         */
        fun exampleByte(
            byteValue: Byte = Byte.MIN_VALUE,
        ): Byte {
            return byteValue.also { value ->
                println("Byte Value: $value")
            }
        }

        /**
         * Contoh penggunaan tipe data Short.
         * Short memiliki ukuran 16-bit dan rentang nilai dari -32768 hingga 32767.
         */
        fun exampleShort(
            shortValue: Short = Short.MIN_VALUE,
        ): Short {
            return shortValue.also { value ->
                println("Short Value: $value")
            }
        }

        /**
         * Contoh penggunaan tipe data Int.
         * Int memiliki ukuran 32-bit dan rentang nilai dari -2147483648 hingga 2147483647.
         */
        fun exampleInt(
            intValue: Int = Int.MIN_VALUE,
        ): Int {
            return intValue.also { value ->
                println("Int Value: $value")
            }
        }

        /**
         * Contoh penggunaan tipe data Long.
         * Long memiliki ukuran 64-bit dan rentang nilai dari -9223372036854775808 hingga 9223372036854775807.
         */
        fun exampleLong(
            longValue: Long = Long.MIN_VALUE,
        ): Long {
            return longValue.also { value ->
                println("Long Value: $value")
            }
        }

        /**
         * Contoh penggunaan tipe data Float.
         * Float memiliki ukuran 32-bit dan digunakan untuk menyimpan nilai desimal dengan presisi tunggal.
         */
        fun exampleFloat(
            floatValue: Float = Float.MIN_VALUE,
        ): Float {
            return floatValue.also { value ->
                println("Float Value: $value")
            }
        }

        /**
         * Contoh penggunaan tipe data Double.
         * Double memiliki ukuran 64-bit dan digunakan untuk menyimpan nilai desimal dengan presisi ganda.
         */
        fun exampleDouble(
            doubleValue: Double = Double.MIN_VALUE,
        ): Double {
            return doubleValue.also { value ->
                println("Double Value: $value")
            }
        }

        /**
         * Contoh penggunaan tipe data Char.
         * Char digunakan untuk menyimpan karakter tunggal seperti huruf, angka, atau simbol.
         */
        fun exampleChar(
            charValue: Char = Char.MIN_VALUE
        ): Char {
            return charValue.also { value ->
                println("Char Value: $value")
            }
        }

        /**
         * Contoh penggunaan tipe data Boolean.
         * Boolean memiliki dua nilai: true dan false.
         */
        fun exampleBoolean(
            booleanValue: Boolean = true,
        ): Boolean {
            return booleanValue.also { value ->
                println("Boolean Value ($value): $value")
            }
        }

        /**
         * Fungsi utama untuk menjalankan semua contoh penggunaan tipe data primitive.
         */
        fun runAllExamples() {
            exampleByte()
            exampleShort()
            exampleInt()
            exampleLong()
            exampleFloat()
            exampleDouble()
            exampleChar()
            exampleBoolean()
        }
    }
}

fun main() {
    LatihanKeempat.runAllExamples()
}