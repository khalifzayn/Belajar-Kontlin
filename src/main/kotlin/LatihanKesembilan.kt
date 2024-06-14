/**
 * Objek yang berisi fungsi-fungsi untuk berbagai operasi string.
 */
object LatihanSembilan {

    /**
     * Menggabungkan dua string menjadi satu.
     *
     * @param str1 String pertama.
     * @param str2 String kedua.
     * @return String hasil gabungan dari str1 dan str2.
     *
     * Contoh penggunaan:
     *
     * val result = LatihanSembilan.concatenate("Hello, ", "World!")
     * println(result) // Output: Hello, World!
     *
     */
    fun concatenate(str1: String, str2: String): String {
        return str1 + str2
    }

    /**
     * Menghitung jumlah karakter dalam sebuah string.
     *
     * @param str String yang akan dihitung jumlah karakternya.
     * @return Jumlah karakter dalam string.
     *
     * Contoh penggunaan:
     *
     * val count = LatihanSembilan.countCharacters("Hello, World!")
     * println(count) // Output: 13
     *
     */
    fun countCharacters(str: String): Int {
        return str.length
    }

    /**
     * Mengecek apakah sebuah string kosong atau tidak.
     *
     * @param str String yang akan diperiksa.
     * @return True jika string kosong, false jika tidak.
     *
     * Contoh penggunaan:
     *
     * val isEmpty = LatihanSembilan.isEmptyString("")
     * println(isEmpty) // Output: true
     *
     */
    fun isEmptyString(str: String): Boolean {
        return str.isEmpty()
    }

    /**
     * Mengubah semua karakter dalam string menjadi huruf besar.
     *
     * @param str String yang akan diubah.
     * @return String dengan semua karakter dalam huruf besar.
     *
     * Contoh penggunaan:
     *
     * val upper = LatihanSembilan.toUpperCase("hello")
     * println(upper) // Output: HELLO
     *
     */
    fun toUpperCase(str: String): String {
        return str.uppercase()
    }

    /**
     * Mengubah semua karakter dalam string menjadi huruf kecil.
     *
     * @param str String yang akan diubah.
     * @return String dengan semua karakter dalam huruf kecil.
     *
     * Contoh penggunaan:
     *
     * val lower = LatihanSembilan.toLowerCase("HELLO")
     * println(lower) // Output: hello
     *
     */
    fun toLowerCase(str: String): String {
        return str.lowercase()
    }

    /**
     * Memeriksa apakah sebuah string mengandung substring tertentu.
     *
     * @param str String utama.
     * @param substring Substring yang akan dicari.
     * @return True jika substring ditemukan dalam string utama, false jika tidak.
     *
     * Contoh penggunaan:
     *
     * val contains = LatihanSembilan.containsSubstring("Hello, World!", "World")
     * println(contains) // Output: true
     *
     */
    fun containsSubstring(str: String, substring: String): Boolean {
        return str.contains(substring)
    }

    /**
     * Memotong spasi di awal dan akhir sebuah string.
     *
     * @param str String yang akan dipotong.
     * @return String yang telah dipotong spasinya di awal dan akhir.
     *
     * Contoh penggunaan:
     *
     * val trimmed = LatihanSembilan.trimString("   Hello, World!   ")
     * println(trimmed) // Output: Hello, World!
     *
     */
    fun trimString(str: String): String {
        return str.trim()
    }
}