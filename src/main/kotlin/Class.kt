/**
 * Kelas Person merepresentasikan sebuah orang dengan nama, umur, dan alamat.
 *
 * Kelas ini menunjukkan konsep dasar OOP seperti encapsulation, constructors,
 * properties, dan methods. Kelas ini juga dilengkapi dengan fungsi untuk
 * memperbarui alamat dan memberikan informasi tentang orang tersebut.
 *
 * @property name Nama dari orang tersebut.
 * @property age Umur dari orang tersebut.
 * @property address Alamat dari orang tersebut.
 */
class Class(
    var name: String,
    var age: Int,
    var address: String
) {

    /**
     * Mengubah alamat orang tersebut.
     *
     * Fungsi ini memungkinkan alamat dari objek Person untuk diubah.
     *
     * @param newAddress Alamat baru yang akan ditetapkan.
     */
    fun updateAddress(newAddress: String) {
        address = newAddress
        println("Alamat untuk $name telah diperbarui menjadi: $newAddress")
    }

    /**
     * Menampilkan informasi lengkap tentang orang tersebut.
     *
     * Fungsi ini memberikan deskripsi lengkap dari orang ini, termasuk nama, umur, dan alamat.
     *
     * @return Deskripsi lengkap dari orang tersebut.
     */
    fun getClassInfo(): String {
        return "Nama: $name, Umur: $age, Alamat: $address"
    }
}

fun main() {
    // Membuat instance dari class Person
    val Class = Class("John Doe", 30, "Jl. Merdeka No. 10")

    // Mengakses dan menampilkan informasi orang tersebut
    println(Class.getClassInfo())

    // Memperbarui alamat orang tersebut
    Class.updateAddress("Jl. Sudirman No. 20")

    // Menampilkan informasi yang telah diperbarui
    println(Class.getClassInfo())
}