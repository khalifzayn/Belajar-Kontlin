/**
 * Kelas Constructor mewakili sebuah kendaraan dengan atribut brand dan year.
 *
 * Kelas ini menunjukkan penggunaan constructor di Kotlin, di mana parameter
 * yang diterima oleh constructor digunakan untuk menginisialisasi properti
 * dari objek yang dibuat.
 *
 * @constructor Membuat instance baru dari kelas Constructor.
 *
 * @param paramBrand Merek dari kendaraan.
 * @param paramYears Tahun pembuatan atau model dari kendaraan.
 */
class Constructor(
    paramBrand: String,
    paramYears: String,
) {
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
    // Membuat objek avanza dari kelas Constructor dengan brand "Toyota" dan year "2022"
    val avanza = Constructor("Toyota", "2022")

    // Membuat objek almaz dari kelas Constructor dengan brand "Wuling" dan year "2019"
    val almaz = Constructor("Wuling", "2019")

    // Menampilkan informasi brand dan year dari objek avanza
    println(avanza.brand)
    println(avanza.year)

    // Menampilkan informasi brand dan year dari objek almaz
    println(almaz.brand)
    println(almaz.year)
}