/**
 * Kelas LatihanKeDuaPuluhSatu menunjukkan penggunaan operator perbandingan di Kotlin.
 * Operator perbandingan digunakan untuk membandingkan dua nilai.
 * Hasil dari operator perbandingan adalah nilai boolean (true atau false).
 */
class LatihanKeDuaPuluhSatu {

    /**
     * Membandingkan apakah dua nilai sama.
     *
     * @param a nilai pertama yang akan dibandingkan.
     * @param b nilai kedua yang akan dibandingkan.
     * @return true jika a sama dengan b, false jika tidak.
     */
    fun apakahSama(a: Int, b: Int): Boolean {
        return a == b
    }

    /**
     * Membandingkan apakah dua nilai tidak sama.
     *
     * @param a nilai pertama yang akan dibandingkan.
     * @param b nilai kedua yang akan dibandingkan.
     * @return true jika a tidak sama dengan b, false jika sama.
     */
    fun apakahTidakSama(a: Int, b: Int): Boolean {
        return a != b
    }

    /**
     * Membandingkan apakah nilai pertama lebih besar dari nilai kedua.
     *
     * @param a nilai pertama yang akan dibandingkan.
     * @param b nilai kedua yang akan dibandingkan.
     * @return true jika a lebih besar dari b, false jika tidak.
     */
    fun apakahLebihBesar(a: Int, b: Int): Boolean {
        return a > b
    }

    /**
     * Membandingkan apakah nilai pertama lebih kecil dari nilai kedua.
     *
     * @param a nilai pertama yang akan dibandingkan.
     * @param b nilai kedua yang akan dibandingkan.
     * @return true jika a lebih kecil dari b, false jika tidak.
     */
    fun apakahLebihKecil(a: Int, b: Int): Boolean {
        return a < b
    }

    /**
     * Membandingkan apakah nilai pertama lebih besar atau sama dengan nilai kedua.
     *
     * @param a nilai pertama yang akan dibandingkan.
     * @param b nilai kedua yang akan dibandingkan.
     * @return true jika a lebih besar atau sama dengan b, false jika tidak.
     */
    fun apakahLebihBesarAtauSama(a: Int, b: Int): Boolean {
        return a >= b
    }

    /**
     * Membandingkan apakah nilai pertama lebih kecil atau sama dengan nilai kedua.
     *
     * @param a nilai pertama yang akan dibandingkan.
     * @param b nilai kedua yang akan dibandingkan.
     * @return true jika a lebih kecil atau sama dengan b, false jika tidak.
     */
    fun apakahLebihKecilAtauSama(a: Int, b: Int): Boolean {
        return a <= b
    }
}

/**
 * Fungsi utama untuk menjalankan contoh penggunaan kelas LatihanKeDuaPuluhSatu.
 */
fun main() {
    val latihan = LatihanKeDuaPuluhSatu()

    val a = 5
    val b = 10

    println("Apakah $a sama dengan $b? ${latihan.apakahSama(a, b)}")
    println("Apakah $a tidak sama dengan $b? ${latihan.apakahTidakSama(a, b)}")
    println("Apakah $a lebih besar dari $b? ${latihan.apakahLebihBesar(a, b)}")
    println("Apakah $a lebih kecil dari $b? ${latihan.apakahLebihKecil(a, b)}")
    println("Apakah $a lebih besar atau sama dengan $b? ${latihan.apakahLebihBesarAtauSama(a, b)}")
    println("Apakah $a lebih kecil atau sama dengan $b? ${latihan.apakahLebihKecilAtauSama(a, b)}")
}