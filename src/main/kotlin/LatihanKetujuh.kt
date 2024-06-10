/**
 * Kelas LatihanKetujuh berisi fungsi untuk menampilkan dan mengembalikan karakter.
 */
object LatihanKetujuh  {

    /**
     * Menampilkan dan mengembalikan karakter yang diberikan.
     *
     * Fungsi ini mencetak nilai karakter ke konsol dan mengembalikannya.
     *
     * @param charValue Karakter yang akan ditampilkan dan dikembalikan.
     * @return Karakter yang diberikan.
     */
    fun displayCharacter(charValue: Char): Char {
        return charValue.also {
            println("Print Character Value: $charValue")
        }
    }

    /**
     * Menampilkan urutan karakter escape (escape sequence) yang diberikan.
     *
     * Fungsi ini mencetak karakter newline, tab, dan backslash ke konsol.
     *
     * @param newLineChar Karakter newline yang akan ditampilkan.
     * @param tabChar Karakter tab yang akan ditampilkan dan digunakan untuk membuat tabulasi.
     * @param backslashChar Karakter backslash yang akan ditampilkan.
     */
    fun displayEscapeSequence(
        newLineChar: Char,
        tabChar: Char,
        backslashChar: Char
    ) {
        println("New Line:$newLineChar")
        println("Tab:${tabChar}This is after a tab")
        println("Backslash:$backslashChar")
    }

    /**
     * Menampilkan manipulasi karakter dari huruf kecil ke huruf besar dan sebaliknya.
     *
     * Fungsi ini mengubah karakter huruf kecil menjadi huruf besar dan karakter huruf besar menjadi huruf kecil,
     * kemudian mencetak hasilnya ke konsol.
     *
     * @param charLower Karakter huruf kecil yang akan diubah menjadi huruf besar.
     * @param charUpper Karakter huruf besar yang akan diubah menjadi huruf kecil.
     */
    fun displayManipulationChar(
        charLower: Char,
        charUpper: Char
    ) {
        val toUpper: Char = charLower.uppercaseChar()
        val toLower: Char = charUpper.lowercaseChar()

        println("Lowercase to Uppercase: $toUpper")
        println("Uppercase to Lowercase: $toLower")
    }

    /**
     * Menampilkan tipe karakter (digit, huruf, atau spasi) yang diberikan.
     *
     * Fungsi ini memeriksa apakah karakter yang diberikan adalah digit, huruf, atau spasi,
     * kemudian mencetak hasilnya ke konsol.
     *
     * @param charDigit Karakter yang akan diperiksa apakah merupakan digit.
     * @param charLetter Karakter yang akan diperiksa apakah merupakan huruf.
     * @param charWhitespace Karakter yang akan diperiksa apakah merupakan spasi.
     */
    fun displayTypeChecker(
        charDigit: Char,
        charLetter: Char,
        charWhitespace: Char
    ) {
        println("$charDigit is a digit: ${charDigit.isDigit()}")
        println("$charLetter is a letter: ${charLetter.isLetter()}")
        println("Whitespace is a whitespace: ${charWhitespace.isWhitespace()}")
    }
}