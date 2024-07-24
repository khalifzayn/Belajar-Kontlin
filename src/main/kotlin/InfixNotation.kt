/**
 * Class untuk menunjukkan penggunaan infix notation.
 */
class InfixNotationCalculator {

    /**
     * Fungsi infix untuk menambahkan dua bilangan.
     * @param other Bilangan yang akan ditambahkan.
     * @return Hasil penjumlahan dari this dan other.
     */
    infix fun add(other: Int): Int {
        return this.value + other
    }

    /**
     * Fungsi infix untuk mengalikan dua bilangan.
     * @param other Bilangan yang akan dikalikan.
     * @return Hasil perkalian dari this dan other.
     */
    infix fun multiply(other: Int): Int {
        return this.value * other
    }

    infix fun minus(other: Int): Int {
        return this.value - other
    }

    var value: Int = 0
}

fun main() {
    val calculator = InfixNotationCalculator()
    calculator.value = 5

    // Menggunakan infix notation untuk menambahkan dan mengalikan
    val sum = calculator add 3
    val product = calculator multiply 2
    val minus = calculator minus 3

    println("Sum: $sum") // Output: Sum: 8
    println("Product: $product") // Output: Product: 10
    println("minus: $minus") // Output: minus: 2
}