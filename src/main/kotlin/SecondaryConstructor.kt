/**
 * Kelas SecondaryConstructor mewakili sebuah kendaraan dengan atribut brand, name, dan year.
 *
 * Kelas ini menunjukkan penggunaan constructor sekunder di Kotlin, di mana kita dapat
 * membuat beberapa cara untuk menginisialisasi objek dengan berbagai jumlah parameter.
 * Constructor utama digunakan untuk inisialisasi lengkap, sementara constructor sekunder
 * memberikan nilai default untuk beberapa parameter.
 *
 * @constructor Membuat instance baru dari kelas SecondaryConstructor dengan semua parameter.
 *
 * @param paramBrand Merek dari kendaraan.
 * @param paramName Nama model dari kendaraan.
 * @param paramYears Tahun pembuatan atau model dari kendaraan.
 */
class SecondaryConstructor(
    paramBrand: String,
    paramName: String,
    paramYears: String,
) {

    /**
     * Blok inisialisasi yang dijalankan saat objek dibuat.
     *
     * Blok ini mencetak pesan yang menunjukkan bahwa mobil dengan merek yang diberikan
     * sedang diproses.
     */
    init {
        println("Mobil $paramBrand sedang diproses")
    }

    /**
     * Constructor sekunder yang menginisialisasi objek dengan merek dan nama model.
     *
     * Constructor ini menggunakan tahun default "2020" jika tahun tidak diberikan.
     *
     * @param paramBrand Merek dari kendaraan.
     * @param paramName Nama model dari kendaraan.
     */
    constructor(paramBrand: String, paramName: String) : this(paramBrand, paramName, "2020") {
        println("Secondary Constructor 1")
    }

    /**
     * Constructor sekunder yang menginisialisasi objek hanya dengan merek.
     *
     * Constructor ini menggunakan nama model kosong dan tahun default "2020" jika tidak diberikan.
     *
     * @param paramBrand Merek dari kendaraan.
     */
    constructor(paramBrand: String) : this(paramBrand, "") {
        println("Secondary Constructor 2")
    }

    /**
     * Merek kendaraan.
     */
    var brand: String = paramBrand

    /**
     * Nama model kendaraan.
     */
    var name: String = paramName

    /**
     * Tahun pembuatan atau model kendaraan.
     */
    var year: String = paramYears
}

fun main() {
    // Membuat objek avanza dari kelas SecondaryConstructor dengan brand "Toyota" dan name "avanza"
    val avanza = SecondaryConstructor("Toyota", "avanza")

    // Membuat objek almaz dari kelas SecondaryConstructor dengan brand "Wuling" saja
    val almaz = SecondaryConstructor("Wuling")

    // Menampilkan informasi brand, name, dan year dari objek avanza
    println(avanza.brand)
    println(avanza.name)
    println(avanza.year)

    // Menampilkan informasi brand, name, dan year dari objek almaz
    println(almaz.brand)
    println(almaz.name)
    println(almaz.year)
}