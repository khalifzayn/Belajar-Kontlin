/**
 * Kelas FunctionScope mendefinisikan ruang lingkup fungsi anggota.
 */
class FunctionScope {
    /**
     * Fungsi anggota yang mencetak nama "Kotlin".
     * Fungsi ini hanya dapat diakses melalui instance dari kelas FunctionScope.
     */
    fun showName() {
        print("Name: Kotlin")
    }
}

/**
 * Fungsi top-level yang mencoba memanggil fungsi showName.
 * Fungsi ini akan menghasilkan error karena showName tidak berada dalam ruang lingkup global.
 */
fun dataKTP() {
    // Error: showName() tidak dapat diakses dari sini karena berada dalam kelas FunctionScope
    // showName()
}

/**
 * Fungsi main adalah titik masuk untuk eksekusi program.
 * Fungsi ini mencoba memanggil fungsi showName yang akan menghasilkan error karena showName
 * tidak berada dalam ruang lingkup global.
 */
fun main() {
    // Error: showName() tidak dapat diakses dari sini karena berada dalam kelas FunctionScope
    // showName()
}