/**
 * Kelas LatihanKeduapuluh menyediakan contoh penggunaan unary operator dalam bahasa Kotlin.
 * Unary operator adalah operator yang hanya memerlukan satu operan.
 * Contoh unary operator meliputi: +, -, !, ++, dan --.
 */
class LatihanKeduapuluh {

    /**
     * Menggunakan unary plus operator.
     *
     * @param value nilai yang akan digunakan dengan unary plus operator.
     * @return nilai yang sama seperti input (tidak ada perubahan).
     */
    fun unaryPlus(value: Int): Int {
        return +value
    }

    /**
     * Menggunakan unary minus operator.
     *
     * @param value nilai yang akan digunakan dengan unary minus operator.
     * @return nilai negatif dari input.
     */
    fun unaryMinus(value: Int): Int {
        return -value
    }

    /**
     * Menggunakan logical NOT operator.
     *
     * @param value nilai boolean yang akan digunakan dengan logical NOT operator.
     * @return negasi dari nilai boolean input.
     */
    fun logicalNot(value: Boolean): Boolean {
        return !value
    }

    /**
     * Menggunakan increment operator (prefix dan postfix).
     *
     * @param value nilai yang akan di-increment.
     * @return nilai setelah di-increment (prefix dan postfix).
     */
    fun increment(value: Int): Pair<Int, Int> {
        var prefixIncrement = value
        var postfixIncrement = value
        return Pair(++prefixIncrement, postfixIncrement++)
    }

    /**
     * Menggunakan decrement operator (prefix dan postfix).
     *
     * @param value nilai yang akan di-decrement.
     * @return nilai setelah di-decrement (prefix dan postfix).
     */
    fun decrement(value: Int): Pair<Int, Int> {
        var prefixDecrement = value
        var postfixDecrement = value
        return Pair(--prefixDecrement, postfixDecrement--)
    }
}

fun main() {
    val demo = LatihanKeduapuluh()

    // Contoh unary plus operator
    val unaryPlusResult = demo.unaryPlus(5)
    println("Unary Plus (+5): $unaryPlusResult")

    // Contoh unary minus operator
    val unaryMinusResult = demo.unaryMinus(5)
    println("Unary Minus (-5): $unaryMinusResult")

    // Contoh logical NOT operator
    val logicalNotResult = demo.logicalNot(true)
    println("Logical NOT (!true): $logicalNotResult")

    // Contoh increment operator
    val (prefixIncrement, postfixIncrement) = demo.increment(5)
    println("Increment Prefix (++5): $prefixIncrement")
    println("Increment Postfix (5++): $postfixIncrement")

    // Contoh decrement operator
    val (prefixDecrement, postfixDecrement) = demo.decrement(5)
    println("Decrement Prefix (--5): $prefixDecrement")
    println("Decrement Postfix (5--): $postfixDecrement")
}