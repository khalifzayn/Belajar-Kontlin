/**
 * Contoh kelas untuk mendemonstrasikan penggunaan extension functions sederhana dalam Kotlin.
 */

/**
 * Extension function untuk membalik string.
 *
 * @return String yang telah dibalik.
 */
fun String.reverse(): String = this.reversed()

/**
 * Extension function untuk menggandakan nilai integer.
 *
 * @return Nilai integer yang telah digandakan.
 */
fun Int.double(): Int = this * 2

fun main() {
    // Menggunakan extension function pada String
    val originalString = "Kotlin"
    val reversedString = originalString.reverse()
    println("Original String: $originalString")  // Output: Original String: Kotlin
    println("Reversed String: $reversedString")  // Output: Reversed String: niltoK

    // Menggunakan extension function pada Int
    val originalNumber = 10
    val doubledNumber = originalNumber.double()
    println("Original Number: $originalNumber")  // Output: Original Number: 10
    println("Doubled Number: $doubledNumber")  // Output: Doubled Number: 20
}