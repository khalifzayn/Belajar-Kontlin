import kotlin.math.pow
import kotlin.math.sqrt

// 1. fungsi latihankedelapanbelas adalah menyediakan operasi Aritmatika dasar

// 2. menambahkan dua angka dan mengembalikan hasilnya
//      contoh penggunaan :
//
      fun tambah(a: Double, b: Double): Double {
          return a + b
      }

// 3. mengurangi angka kedua dari angka pertama dan mengembalikan hasilnya
//      contoh penggunaan :
//
      fun kurang(a: Double, b: Double): Double {
          return a - b
      }

// 4. tidak diperbolehkan membagi dengan angka nol
//       contoh kode untuk mendemonstrasikan :
//
       fun bagi(a: Double, b: Double): Double {
           if (b == 0.0) {
               throw IllegalArgumentException()
           }
        return a / b
       }

    // 5. menghitung pangkat dari suatu angka
    //      contoh penggunaan :
      fun pangkat(basis: Double, eksponen: Double): Double {
          return basis.pow(eksponen)
      }

    // 6. akar kuadrat dari angka negatif tidak di perbolehkan
    //      contoh kode untuk mendemonstrasikan
    fun akar(angka: Double): Double {
        if (angka < 0) {
            throw IllegalArgumentException()
        }
    return sqrt(angka)
    }

    // 7.
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