/**
 * Objek yang berisi fungsi-fungsi untuk berbagai metode penggabungan string.
 */
object LatihanKesebelas {

    /**
     * Menggabungkan dua string menggunakan operator plus (+).
     *
     * @param str1 String pertama.
     * @param str2 String kedua.
     * @return String hasil penggabungan dari str1 dan str2.
     *
     * Contoh penggunaan:
     *
     * val result = LatihanKesebelas.combineWithPlusOperator("Hello, ", "World!")
     * println(result) // Output: Hello, World!
     *
     */
    fun combineWithPlusOperator(str1: String, str2: String): String {
        return str1 + str2
    }

    /**
     * Menggabungkan dua string menggunakan metode plus.
     *
     * @param str1 String pertama.
     * @param str2 String kedua.
     * @return String hasil penggabungan dari str1 dan str2.
     *
     * Contoh penggunaan:
     *
     * val result = LatihanKesebelas.combineWithPlusMethod("Hello, ", "World!")
     * println(result) // Output: Hello, World!
     *
     */
    fun combineWithPlusMethod(str1: String, str2: String): String {
        return str1.plus(str2)
    }

    /**
     * Menggabungkan beberapa string menggunakan StringBuilder.
     *
     * @param strings Vararg dari beberapa string yang akan digabungkan.
     * @return String hasil penggabungan dari semua string yang diberikan.
     *
     * Contoh penggunaan:
     *
     * val result = LatihanKesebelas.combineWithStringBuilder("Hello, ", "World", "!")
     * println(result) // Output: Hello, World!
     *
     */
    fun combineWithStringBuilder(vararg strings: String): String {
        val stringBuilder = StringBuilder()
        for (str in strings) {
            stringBuilder.append(str)
        }
        return stringBuilder.toString()
    }

    /**
     * Menggabungkan dua string menggunakan template string (interpolasi string).
     *
     * @param str1 String pertama.
     * @param str2 String kedua.
     * @return String hasil penggabungan dari str1 dan str2 menggunakan template string.
     *
     * Contoh penggunaan:
     *
     * val result = LatihanKesebelas.combineWithTemplateString("Hello, ", "World!")
     * println(result) // Output: Hello, World!
     *
     */
    fun combineWithTemplateString(str1: String, str2: String): String {
        return "$str1$str2"
    }
}