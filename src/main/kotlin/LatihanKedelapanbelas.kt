import kotlin.math.pow
import kotlin.math.sqrt

/**
 * Kelas LatihanDelapanBelas menyediakan operasi matematika dasar.
 */
class LatihanDelapanBelas {

    /**
     * Menambahkan dua angka dan mengembalikan hasilnya.
     *
     * @param a angka pertama yang akan ditambahkan.
     * @param b angka kedua yang akan ditambahkan.
     * @return jumlah dari a dan b.
     */
    fun tambah(a: Double, b: Double): Double {
        return a + b
    }

    /**
     * Mengurangi angka kedua dari angka pertama dan mengembalikan hasilnya.
     *
     * @param a angka yang akan dikurangi.
     * @param b angka yang akan mengurangi a.
     * @return hasil pengurangan a dengan b.
     */
    fun kurang(a: Double, b: Double): Double {
        return a - b
    }

    /**
     * Mengalikan dua angka dan mengembalikan hasilnya.
     *
     * @param a angka pertama yang akan dikalikan.
     * @param b angka kedua yang akan dikalikan.
     * @return hasil perkalian a dan b.
     */
    fun kali(a: Double, b: Double): Double {
        return a * b
    }

    /**
     * Membagi angka pertama dengan angka kedua dan mengembalikan hasilnya.
     *
     * @param a angka yang akan dibagi.
     * @param b angka yang akan membagi a.
     * @return hasil pembagian a dengan b.
     * @throws IllegalArgumentException jika b adalah nol.
     */
    fun bagi(a: Double, b: Double): Double {
        if (b == 0.0) {
            throw IllegalArgumentException("Pembagian dengan nol tidak diperbolehkan")
        }
        return a / b
    }

    /**
     * Menghitung pangkat dari suatu angka.
     *
     * @param basis angka basis.
     * @param eksponen eksponen yang akan dikenakan pada basis.
     * @return hasil basis pangkat eksponen.
     */
    fun pangkat(basis: Double, eksponen: Double): Double {
        return basis.pow(eksponen)
    }

    /**
     * Menghitung akar kuadrat dari suatu angka.
     *
     * @param angka angka yang akan dihitung akar kuadratnya.
     * @return akar kuadrat dari angka yang diberikan.
     * @throws IllegalArgumentException jika angka negatif.
     */
    fun akar(angka: Double): Double {
        if (angka < 0) {
            throw IllegalArgumentException("Akar kuadrat dari angka negatif tidak diperbolehkan")
        }
        return sqrt(angka)
    }
}

fun main() {
    val kalkulator = LatihanDelapanBelas()

    val jumlah = kalkulator.tambah(10.0, 5.0)
    println("Jumlah: $jumlah")

    val selisih = kalkulator.kurang(10.0, 5.0)
    println("Selisih: $selisih")

    val produk = kalkulator.kali(10.0, 5.0)
    println("Produk: $produk")

    val hasilBagi = kalkulator.bagi(10.0, 5.0)
    println("Hasil Bagi: $hasilBagi")

    val hasilPangkat = kalkulator.pangkat(2.0, 3.0)
    println("Hasil Pangkat: $hasilPangkat")

    val akarKuadrat = kalkulator.akar(25.0)
    println("Akar Kuadrat: $akarKuadrat")
}