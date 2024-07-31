/**
 * Kelas yang berisi fungsi untuk memeriksa bilangan genap/ganjil dan menentukan grade berdasarkan nilai.
 */
class Checker {
    /**
     * Fungsi yang menentukan apakah suatu bilangan genap atau ganjil.
     *
     * @param number Bilangan yang akan diperiksa.
     * @return Sebuah string yang menunjukkan apakah bilangan tersebut "Genap" atau "Ganjil".
     */
    fun checkEvenOdd(number: Int): String {
        // Menggunakan 'return if' untuk mengembalikan hasil pengecekan
        return if (number % 2 == 0) {
            "Genap"
        } else {
            "Ganjil"
        }
    }

    /**
     * Fungsi yang menentukan grade berdasarkan nilai.
     *
     * @param score Nilai yang akan diperiksa.
     * @return Sebuah string yang menunjukkan grade dari nilai tersebut.
     */
    fun determineGrade(score: Int): String {
        // Menggunakan 'return when' untuk mengembalikan grade berdasarkan nilai
        return when {
            score >= 90 -> "A"
            score >= 80 -> "B"
            score >= 70 -> "C"
            score >= 60 -> "D"
            else -> "F"
        }
    }
}

/**
 * Fungsi utama untuk menjalankan program.
 */
fun main() {
    // Membuat instance dari kelas Checker
    val checker = Checker()

    // Memeriksa bilangan genap atau ganjil
    val number = 7
    val evenOddResult = checker.checkEvenOdd(number)
    println("Bilangan $number adalah $evenOddResult.")

    // Menentukan grade berdasarkan nilai
    val score = 85
    val gradeResult = checker.determineGrade(score)
    println("Nilai $score mendapat grade $gradeResult.")
}