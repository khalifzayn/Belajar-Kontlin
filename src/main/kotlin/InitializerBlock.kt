/**
 * Kelas InitializerBlock mewakili sebuah kendaraan dengan atribut brand dan year,
 * serta mencetak pesan ketika objek baru dibuat menggunakan blok inisialisasi (init).
 *
 * Kelas ini menunjukkan penggunaan blok inisialisasi di Kotlin, di mana kode
 * di dalam blok init dijalankan setiap kali sebuah instance dari kelas dibuat.
 *
 * @constructor Membuat instance baru dari kelas InitializerBlock.
 *
 * @param paramBrand Merek dari kendaraan.
 * @param paramYears Tahun pembuatan atau model dari kendaraan.
 */
class InitializerBlock(
    paramBrand: String,
    paramYears: String,
) {
    /**
     * Blok inisialisasi yang dijalankan saat objek dibuat.
     *
     * Blok ini digunakan untuk mencetak pesan yang menunjukkan bahwa mobil
     * dengan merek yang diberikan sedang diproses.
     */
    init {
        println("Mobil $paramBrand sedang diproses")
    }

    /**
     * Merek kendaraan.
     */
    var brand: String = paramBrand

    /**
     * Tahun pembuatan atau model kendaraan.
     */
    var year: String = paramYears
}

fun main() {
    // Membuat objek avanza dari kelas InitializerBlock dengan brand "Toyota" dan year "2022"
    val avanza = InitializerBlock("Toyota", "2022")

    // Membuat objek almaz dari kelas InitializerBlock dengan brand "Wuling" dan year "2019"
    val almaz = InitializerBlock("Wuling", "2019")

    // Menampilkan informasi brand dan year dari objek avanza
    println(avanza.brand)
    println(avanza.year)

    // Menampilkan informasi brand dan year dari objek almaz
    println(almaz.brand)
    println(almaz.year)
}