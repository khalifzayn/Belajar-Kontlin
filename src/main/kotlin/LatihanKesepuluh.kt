/**
 * Objek yang berisi fungsi-fungsi untuk berbagai operasi string yang melibatkan margin dan pemotongan.
 */
object LatihanKesepuluh {

    /**
     * Menghapus margin dari string yang memiliki simbol margin khusus di awal setiap baris.
     *
     * @param str String yang akan dihapus marginnya.
     * @param marginPrefix Prefix yang menunjukkan margin pada setiap baris. Default adalah "|".
     * @return String yang telah dihapus marginnya.
     *
     * Contoh penggunaan:
     *
     * val text = """
     *     |Baris 1
     *     |Baris 2
     *     |Baris 3
     * """.trimMargin()
     * println(text)
     * // Output:
     * // Baris 1
     * // Baris 2
     * // Baris 3
     *
     */
    fun trimMarginString(str: String, marginPrefix: String = "|"): String {
        return str.trimMargin(marginPrefix)
    }

    /**
     * Menghapus indentasi dari string yang memiliki indentasi sama di awal setiap baris.
     *
     * @param str String yang akan dihapus indentasinya.
     * @return String yang telah dihapus indentasinya.
     *
     * Contoh penggunaan:
     *
     * val text = """
     *     Baris 1
     *     Baris 2
     *     Baris 3
     * """.trimIndent()
     * println(text)
     * // Output:
     * // Baris 1
     * // Baris 2
     * // Baris 3
     *
     */
    fun trimIndentString(str: String): String {
        return str.trimIndent()
    }

    /**
     * Menggabungkan beberapa baris string menjadi satu string yang terpisah dengan newline.
     *
     * @param lines Vararg dari beberapa baris string.
     * @return String yang menggabungkan semua baris dengan newline.
     *
     * Contoh penggunaan:
     *
     * val text = StringManipulations.joinLines("Baris 1", "Baris 2", "Baris 3")
     * println(text)
     * // Output:
     * // Baris 1
     * // Baris 2
     * // Baris 3
     *
     */
    fun joinLines(vararg lines: String): String {
        return lines.joinToString(separator = "\n")
    }
}