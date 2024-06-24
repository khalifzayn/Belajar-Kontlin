/**
 * Objek yang berisi contoh penggunaan variabel immutable (val) dalam berbagai konteks.
 */
object LatihanKetigabelas {

    /**
     * Menunjukkan penggunaan variabel immutable dengan operasi aritmatika.
     */
    fun immutableArithmetic() {
        // Deklarasi variabel immutable
        val number: Int = 10
        println("Nilai awal: $number") // Output: 10

        // Operasi aritmatika
        val sum = number + 5
        val difference = number - 3
        val product = number * 2
        val quotient = number / 2
        val modulus = number % 3

        // Menampilkan hasil operasi aritmatika
        println("Penjumlahan: $sum")       // Output: 15
        println("Pengurangan: $difference") // Output: 7
        println("Perkalian: $product")      // Output: 20
        println("Pembagian: $quotient")     // Output: 5
        println("Modulus: $modulus")        // Output: 1
    }

    /**
     * Menunjukkan penggunaan variabel immutable dengan string.
     */
    fun immutableStrings() {
        // Deklarasi variabel immutable
        val greeting: String = "Hello"
        println("Greeting: $greeting") // Output: Hello

        // Menggabungkan string
        val newGreeting = greeting + ", World!"
        println("New Greeting: $newGreeting") // Output: Hello, World!
    }

    /**
     * Menunjukkan penggunaan variabel immutable dengan daftar (list).
     */
    fun immutableList() {
        // Deklarasi variabel immutable berupa daftar
        val numbers: List<Int> = listOf(1, 2, 3)
        println("Original List: $numbers") // Output: [1, 2, 3]

        // Membuat daftar baru dengan elemen tambahan
        val newNumbers = numbers + 4
        println("New List: $newNumbers") // Output: [1, 2, 3, 4]
    }

    /**
     * Menunjukkan penggunaan variabel immutable dengan peta (map).
     */
    fun immutableMap() {
        // Deklarasi variabel immutable berupa peta
        val capitals: Map<String, String> = mapOf("Indonesia" to "Jakarta", "Malaysia" to "Kuala Lumpur")
        println("Original Map: $capitals") // Output: {Indonesia=Jakarta, Malaysia=Kuala Lumpur}

        // Membuat peta baru dengan pasangan kunci-nilai tambahan
        val newCapitals = capitals + ("Japan" to "Tokyo")
        println("New Map: $newCapitals") // Output: {Indonesia=Jakarta, Malaysia=Kuala Lumpur, Japan=Tokyo}
    }

    /**
     * Menunjukkan penggunaan variabel immutable dengan objek data.
     */
    fun immutableDataClass() {
        // Deklarasi data class
        data class Person(val name: String, val age: Int)

        // Membuat instance dari data class
        val person = Person("Alice", 25)
        println("Person: $person") // Output: Person(name=Alice, age=25)

        // Membuat instance baru dengan properti yang diubah
        val newPerson = person.copy(name = "Bob")
        println("New Person: $newPerson") // Output: Person(name=Bob, age=25)
    }
}

/**
 * Fungsi utama untuk menjalankan contoh penggunaan variabel immutable.
 */
fun main() {
    LatihanKetigabelas.immutableArithmetic()
    LatihanKetigabelas.immutableStrings()
    LatihanKetigabelas.immutableList()
    LatihanKetigabelas.immutableMap()
    LatihanKetigabelas.immutableDataClass()
}