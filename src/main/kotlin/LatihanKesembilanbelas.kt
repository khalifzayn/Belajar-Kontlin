/**
 * Kelas AugmentedAssignmentDemo menyediakan contoh penggunaan augmented assignment dalam bahasa Kotlin.
 * Augmented assignment adalah cara untuk memperbarui nilai variabel dengan menggunakan operasi
 * yang dikombinasikan dengan assignment, seperti +=, -=, *=, /=, dan %=.
 */
class LatihanKesembilanbelas {

    /**
     * Contoh penggunaan augmented assignment untuk penjumlahan.
     *
     * @param initialValue nilai awal yang akan diperbarui.
     * @param increment nilai yang akan ditambahkan.
     * @return nilai akhir setelah penjumlahan augmented assignment.
     */
    fun penjumlahan(initialValue: Int, increment: Int): Int {
        var result = initialValue
        result += increment
        return result
    }

    /**
     * Contoh penggunaan augmented assignment untuk pengurangan.
     *
     * @param initialValue nilai awal yang akan diperbarui.
     * @param decrement nilai yang akan dikurangkan.
     * @return nilai akhir setelah pengurangan augmented assignment.
     */
    fun pengurangan(initialValue: Int, decrement: Int): Int {
        var result = initialValue
        result -= decrement
        return result
    }

    /**
     * Contoh penggunaan augmented assignment untuk perkalian.
     *
     * @param initialValue nilai awal yang akan diperbarui.
     * @param factor nilai yang akan dikalikan.
     * @return nilai akhir setelah perkalian augmented assignment.
     */
    fun perkalian(initialValue: Int, factor: Int): Int {
        var result = initialValue
        result *= factor
        return result
    }

    /**
     * Contoh penggunaan augmented assignment untuk pembagian.
     *
     * @param initialValue nilai awal yang akan diperbarui.
     * @param divisor nilai yang akan membagi.
     * @return nilai akhir setelah pembagian augmented assignment.
     */
    fun pembagian(initialValue: Int, divisor: Int): Int {
        var result = initialValue
        result /= divisor
        return result
    }

    /**
     * Contoh penggunaan augmented assignment untuk modulus.
     *
     * @param initialValue nilai awal yang akan diperbarui.
     * @param modulus nilai yang akan digunakan untuk operasi modulus.
     * @return nilai akhir setelah operasi modulus augmented assignment.
     */
    fun modulus(initialValue: Int, modulus: Int): Int {
        var result = initialValue
        result %= modulus
        return result
    }
}

fun main() {
    val demo = LatihanKesembilanbelas()

    // Contoh penjumlahan augmented assignment
    val hasilPenjumlahan = demo.penjumlahan(10, 5)
    println("Hasil Penjumlahan (10 += 5): $hasilPenjumlahan")

    // Contoh pengurangan augmented assignment
    val hasilPengurangan = demo.pengurangan(10, 5)
    println("Hasil Pengurangan (10 -= 5): $hasilPengurangan")

    // Contoh perkalian augmented assignment
    val hasilPerkalian = demo.perkalian(10, 5)
    println("Hasil Perkalian (10 *= 5): $hasilPerkalian")

    // Contoh pembagian augmented assignment
    val hasilPembagian = demo.pembagian(10, 5)
    println("Hasil Pembagian (10 /= 5): $hasilPembagian")

    // Contoh modulus augmented assignment
    val hasilModulus = demo.modulus(10, 5)
    println("Hasil Modulus (10 %= 5): $hasilModulus")
}