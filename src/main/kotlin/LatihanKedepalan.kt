/**
 * Object yang berisi fungsi untuk menampilkan dan mengembalikan nilai boolean.
 */
object LatihanKedelapan {

    /**
     * Menampilkan nilai boolean yang benar (true) dan mengembalikan nilai tersebut.
     *
     * @param trueValue Nilai boolean yang akan ditampilkan dan dikembalikan.
     * @return Nilai boolean yang sama dengan parameter yang diterima.
     *
     * Contoh penggunaan:
     *
     * val result = LatihanKedelapan.displayTrueValue(true)
     * println(result) // Output: Nilai Boolean Benar: true
     *
     */
    fun displayTrueValue(trueValue: Boolean): Boolean {
        return trueValue.also { value ->
            println("Nilai Boolean Benar: $value")
        }
    }
}
/**
 * Menampilkan nilai boolean yang salah (false) dan mengembalikan nilai tersebut.
 *
 * @param falseValue Nilai boolean yang akan ditampilkan dan dikembalikan.
 * @return Nilai boolean yang sama dengan parameter yang diterima.
 *
 * Contoh penggunaan:
 *
 * val resultFalse = LatihanKedelapan.displayFalseValue(false)
 * println(resultFalse) // Output: Nilai Boolean Salah: false
 *
 */
fun displayFalseValue(falseValue: Boolean): Boolean {
    return falseValue.also { value ->
        println("Nilai Boolean Salah: $value")
    }
}