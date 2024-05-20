fun main() {
    /**
     *Penggunaan Val (Read-Only Variabel)
     *
     * Val digunakan untuk mendeklarasikan variabel yang nilainya tidak bisa diubah
     * setelah di deklarasikan. Variabel ini mirip dengan final di Java
     *
     * @author: Faisal Zuhri
     * */

    val name ="Faisal Zuhri" // Variabel yang hanya dapat dibaca bertipe String
    println(name) // Output: Arfan

    // name = "Zuhri" // ini akan menyebabkan error saat kompilasi

    val age = 25 //Variabel yang hanya dapat dibaca bertipe Int
    println(age) // Output: 25

    // age = 26 // ini akan menyebabkan error saat kompilasi
}