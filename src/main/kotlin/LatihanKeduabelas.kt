/**
 * Objek yang berisi contoh penggunaan variabel mutable (var) dalam berbagai konteks.
 */
object LatihanKeduabelas {

    /**
     * Menunjukkan penggunaan variabel mutable dengan operasi aritmatika.
     */
    fun mutableArithmetic() {
        // Deklarasi variabel mutable
        var number: Int = 10

        // Operasi penjumlahan
        number += 5
        println("Penjumlahan: $number") // Output: 15

        // Operasi pengurangan
        number -= 3
        println("Pengurangan: $number") // Output: 12

        // Operasi perkalian
        number *= 2
        println("Perkalian: $number") // Output: 24

        // Operasi pembagian
        number /= 4
        println("Pembagian: $number") // Output: 6

        // Operasi modulus
        number %= 5
        println("Modulus: $number") // Output: 1
    }

    /**
     * Menunjukkan penggunaan variabel mutable dengan string.
     */
    fun mutableStrings() {
        // Deklarasi variabel mutable
        var greeting: String = "Hello"

        // Menggabungkan string
        greeting += ", World!"
        println("Greeting: $greeting") // Output: Hello, World!

        // Mengganti nilai string
        greeting = "Hi"
        println("Greeting: $greeting") // Output: Hi
    }

    /**
     * Menunjukkan penggunaan variabel mutable dengan daftar (list).
     */
    fun mutableList() {
        // Deklarasi variabel mutable berupa daftar
        var numbers: MutableList<Int> = mutableListOf(1, 2, 3)

        // Menambahkan elemen ke daftar
        numbers.add(4)
        println("List after add: $numbers") // Output: [1, 2, 3, 4]

        // Menghapus elemen dari daftar
        numbers.removeAt(0)
        println("List after remove: $numbers") // Output: [2, 3, 4]

        // Mengganti elemen pada indeks tertentu
        numbers[0] = 10
        println("List after set: $numbers") // Output: [10, 3, 4]
    }

    /**
     * Menunjukkan penggunaan variabel mutable dengan peta (map).
     */
    fun mutableMap() {
        // Deklarasi variabel mutable berupa peta
        var capitals: MutableMap<String, String> = mutableMapOf("Indonesia" to "Jakarta", "Malaysia" to "Kuala Lumpur")

        // Menambahkan pasangan kunci-nilai ke peta
        capitals["Japan"] = "Tokyo"
        println("Map after put: $capitals") // Output: {Indonesia=Jakarta, Malaysia=Kuala Lumpur, Japan=Tokyo}

        // Menghapus pasangan kunci-nilai dari peta
        capitals.remove("Malaysia")
        println("Map after remove: $capitals") // Output: {Indonesia=Jakarta, Japan=Tokyo}

        // Mengganti nilai pada kunci tertentu
        capitals["Indonesia"] = "New Jakarta"
        println("Map after replace: $capitals") // Output: {Indonesia=New Jakarta, Japan=Tokyo}
    }

    /**
     * Menunjukkan penggunaan variabel mutable dengan objek data.
     */
    fun mutableDataClass() {
        // Deklarasi data class
        data class Person(var name: String, var age: Int)

        // Membuat instance dari data class
        var person = Person("Alice", 25)

        // Mengubah nilai properti
        person.name = "Bob"
        person.age = 30
        println("Person: $person") // Output: Person(name=Bob, age=30)
    }
}

/**
 * Fungsi utama untuk menjalankan contoh penggunaan variabel mutable.
 */
fun main() {
    LatihanKeduabelas.mutableArithmetic()
    LatihanKeduabelas.mutableStrings()
    LatihanKeduabelas.mutableList()
    LatihanKeduabelas.mutableMap()
    LatihanKeduabelas.mutableDataClass()
}