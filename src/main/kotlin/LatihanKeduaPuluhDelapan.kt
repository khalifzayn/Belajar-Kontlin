/**
 * Kelas ini berisi contoh fungsi dalam Kotlin, termasuk fungsi tanpa parameter,
 * fungsi dengan parameter, dan fungsi dengan argumen default.
 */
class LatihanKeDuaPuluhDelapan {

    /**
     * Fungsi untuk mencetak nama default.
     *
     * @throws Tidak ada
     */
    fun printName() {
        println("Nama anda: Faisal")
    }

    /**
     * Fungsi untuk mencetak nama yang diberikan.
     *
     * @param name Nama yang akan dicetak.
     * @throws Tidak ada
     */
    fun printName(name: String) {
        println("Nama anda: $name")
    }

    /**
     * Fungsi untuk mencetak informasi pribadi dengan argumen default.
     *
     * @param name Nama yang akan dicetak. Defaultnya adalah string kosong.
     * @param age Umur yang akan dicetak. Defaultnya adalah 0.
     * @param address Alamat yang akan dicetak. Defaultnya adalah string kosong.
     * @throws Tidak ada
     */
    fun printPersonal(
        name: String = "",
        age: Int = 0,
        address: String = "",
    ) {
        println("""
            Name: $name
            Age: $age
            Address: $address
        """.trimMargin("|"))
    }
}

/**
 * Fungsi utama yang menjalankan contoh-contoh fungsi dalam kelas LatihanKeDuaPuluhDelapan.
 */
fun main() {
    val latihan = LatihanKeDuaPuluhDelapan()

    // Memanggil fungsi tanpa parameter
    latihan.printName()

    // Memanggil fungsi dengan parameter
    latihan.printName("Faisal")

    // Memanggil fungsi dengan argumen bernama
    latihan.printPersonal(
        name = "Faisal",
        age = 30,
        address = "Medan"
    )
}