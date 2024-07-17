/**
 * Class LatihanReturnUnit
 *
 * Contoh ini menunjukkan bagaimana menggunakan fungsi yang mengembalikan Unit.
 * Unit adalah tipe pengembalian default untuk fungsi yang tidak mengembalikan nilai apapun.
 */
class LatihanKeduaPuluhSembila {

    /**
     * Fungsi ini tidak mengembalikan nilai apapun, secara implisit mengembalikan Unit.
     */
    fun printGreeting() {
        println("Halo, selamat datang!")
    }

    /**
     * Fungsi ini secara eksplisit mengembalikan Unit.
     *
     * @return Unit
     */
    fun printFarewell(): Unit {
        println("Sampai jumpa lagi!")
        return Unit // Ini tidak diperlukan, hanya untuk menunjukkan eksplisit pengembalian Unit
    }

    /**
     * Fungsi ini menunjukkan bahwa Unit bisa diabaikan.
     */
    fun noReturnNeeded() {
        println("Ini juga tidak mengembalikan apa-apa.")
    }

    /**
     * Fungsi ini mengembalikan Unit secara eksplisit dengan logika lebih kompleks.
     *
     * @param name Nama orang yang akan disapa.
     * @return Unit
     */
    fun greetPerson(name: String): Unit {
        if (name.isBlank()) {
            println("Halo, orang tak dikenal!")
        } else {
            println("Halo, $name!")
        }
        return Unit // Pengembalian eksplisit, meskipun tidak diperlukan
    }
}

/**
 * Fungsi utama untuk menjalankan contoh penggunaan Unit.
 */
fun main() {
    val latihan = LatihanKeduaPuluhSembila()

    // Memanggil fungsi tanpa pengembalian eksplisit
    latihan.printGreeting()

    // Memanggil fungsi dengan pengembalian eksplisit Unit
    latihan.printFarewell()

    // Memanggil fungsi yang tidak membutuhkan pengembalian eksplisit
    latihan.noReturnNeeded()

    // Memanggil fungsi dengan logika dan pengembalian eksplisit Unit
    latihan.greetPerson("Faisal")
    latihan.greetPerson("")
}