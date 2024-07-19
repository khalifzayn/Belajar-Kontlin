/**
 * Class LatihanReturnType
 *
 * Contoh ini menunjukkan bagaimana menggunakan fungsi dengan berbagai tipe pengembalian.
 */
class LatihanReturnType {

    /**
     * Fungsi yang mengembalikan sebuah nilai integer.
     *
     * @return Int
     */
    fun getNumber(): Int {
        return 42
    }

    /**
     * Fungsi yang mengembalikan sebuah nilai string.
     *
     * @return String
     */
    fun getGreeting(): String {
        return "Halo, selamat datang!"
    }

    /**
     * Fungsi yang mengembalikan sebuah nilai boolean.
     *
     * @return Boolean
     */
    fun isEven(number: Int): Boolean {
        return number % 2 == 0
    }

    /**
     * Fungsi yang mengembalikan sebuah data class.
     *
     * @return Person
     */
    fun getPerson(): Person {
        return Person("Faisal", 25)
    }

    /**
     * Fungsi yang mengembalikan sebuah list of integers.
     *
     * @return List<Int>
     */
    fun getNumbers(): List<Int> {
        return listOf(1, 2, 3, 4, 5)
    }
}

/**
 * Data class untuk menyimpan informasi tentang seseorang.
 *
 * @property name Nama orang.
 * @property age Usia orang.
 */
data class Person(val name: String, val age: Int)

/**
 * Fungsi utama untuk menjalankan contoh penggunaan tipe pengembalian.
 */
fun main() {
    val latihan = LatihanReturnType()

    // Memanggil fungsi yang mengembalikan nilai integer
    val number = latihan.getNumber()
    println("Nomor yang dikembalikan: $number")

    // Memanggil fungsi yang mengembalikan nilai string
    val greeting = latihan.getGreeting()
    println("Pesan sapaan: $greeting")

    // Memanggil fungsi yang mengembalikan nilai boolean
    val isEvenNumber = latihan.isEven(4)
    println("Apakah 4 adalah bilangan genap? $isEvenNumber")

    // Memanggil fungsi yang mengembalikan data class
    val person = latihan.getPerson()
    println("Nama: ${person.name}, Usia: ${person.age}")

    // Memanggil fungsi yang mengembalikan list of integers
    val numbers = latihan.getNumbers()
    println("List of numbers: $numbers")
}