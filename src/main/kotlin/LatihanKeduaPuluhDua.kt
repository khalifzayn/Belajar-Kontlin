/**
 * Contoh Kelas Pembelajaran Operasi Boolean.
 *
 * Kelas ini menyediakan contoh-contoh penggunaan operasi boolean dasar dalam bahasa Kotlin.
 */
class LatihanKeDuaPuluhDua {

    /**
     * Melakukan operasi AND pada dua nilai boolean.
     *
     * Operasi AND menghasilkan true hanya jika kedua nilai boolean adalah true.
     *
     * @param a Nilai boolean pertama.
     * @param b Nilai boolean kedua.
     * @return Hasil operasi AND dari a dan b.
     */
    fun operasiAND(a: Boolean, b: Boolean): Boolean {
        return a && b
    }

    /**
     * Melakukan operasi OR pada dua nilai boolean.
     *
     * Operasi OR menghasilkan true jika salah satu atau kedua nilai boolean adalah true.
     *
     * @param a Nilai boolean pertama.
     * @param b Nilai boolean kedua.
     * @return Hasil operasi OR dari a dan b.
     */
    fun operasiOR(a: Boolean, b: Boolean): Boolean {
        return a || b
    }

    /**
     * Melakukan operasi NOT pada nilai boolean.
     *
     * Operasi NOT membalikkan nilai boolean: true menjadi false dan sebaliknya.
     *
     * @param a Nilai boolean yang akan di-negasi.
     * @return Hasil operasi NOT dari a.
     */
    fun operasiNOT(a: Boolean): Boolean {
        return !a
    }

    /**
     * Melakukan operasi XOR pada dua nilai boolean.
     *
     * Operasi XOR menghasilkan true jika hanya satu dari nilai boolean yang true.
     *
     * @param a Nilai boolean pertama.
     * @param b Nilai boolean kedua.
     * @return Hasil operasi XOR dari a dan b.
     */
    fun operasiXOR(a: Boolean, b: Boolean): Boolean {
        return a xor b
    }

    /**
     * Melakukan operasi NAND (Not AND) pada dua nilai boolean.
     *
     * Operasi NAND menghasilkan true kecuali kedua nilai boolean adalah true.
     *
     * @param a Nilai boolean pertama.
     * @param b Nilai boolean kedua.
     * @return Hasil operasi NAND dari a dan b.
     */
    fun operasiNAND(a: Boolean, b: Boolean): Boolean {
        return !(a && b)
    }

    /**
     * Melakukan operasi NOR (Not OR) pada dua nilai boolean.
     *
     * Operasi NOR menghasilkan true hanya jika kedua nilai boolean adalah false.
     *
     * @param a Nilai boolean pertama.
     * @param b Nilai boolean kedua.
     * @return Hasil operasi NOR dari a dan b.
     */
    fun operasiNOR(a: Boolean, b: Boolean): Boolean {
        return !(a || b)
    }

    /**
     * Melakukan operasi Implikasi (Implies) pada dua nilai boolean.
     *
     * Operasi Implikasi menghasilkan false hanya jika a adalah true dan b adalah false.
     * Dalam semua kasus lain, hasilnya adalah true.
     *
     * @param a Nilai boolean pertama.
     * @param b Nilai boolean kedua.
     * @return Hasil operasi Implikasi dari a ke b (a → b).
     */
    fun operasiImplikasi(a: Boolean, b: Boolean): Boolean {
        return !a || b
    }

    /**
     * Melakukan operasi Ekivalensi (Equivalence) pada dua nilai boolean.
     *
     * Operasi Ekivalensi menghasilkan true jika kedua nilai boolean adalah sama.
     *
     * @param a Nilai boolean pertama.
     * @param b Nilai boolean kedua.
     * @return Hasil operasi Ekivalensi dari a dan b.
     */
    fun operasiEkivalensi(a: Boolean, b: Boolean): Boolean {
        return a == b
    }
}

/**
 * Fungsi utama untuk menunjukkan contoh penggunaan dari kelas LatihanKeDuaPuluhDua.
 */
fun main() {
    val operasi = LatihanKeDuaPuluhDua()

    val a = true
    val b = false

    println("Operasi AND: ${operasi.operasiAND(a, b)}") // Output: false
    println("Operasi OR: ${operasi.operasiOR(a, b)}") // Output: true
    println("Operasi NOT: ${operasi.operasiNOT(a)}") // Output: false
    println("Operasi XOR: ${operasi.operasiXOR(a, b)}") // Output: true
    println("Operasi NAND: ${operasi.operasiNAND(a, b)}") // Output: true
    println("Operasi NOR: ${operasi.operasiNOR(a, b)}") // Output: false
    println("Operasi Implikasi: ${operasi.operasiImplikasi(a, b)}") // Output: false
    println("Operasi Ekivalensi: ${operasi.operasiEkivalensi(a, b)}") // Output: false
}