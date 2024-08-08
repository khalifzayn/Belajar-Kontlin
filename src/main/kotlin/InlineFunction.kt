/**
 * Kelas utilitas untuk menghitung dan mengukur waktu eksekusi.
 *
 * Kelas ini menyediakan metode untuk mengukur waktu eksekusi dari
 * blok kode yang diberikan.
 */
class ExecutionTimer {

    /**
     * Mengukur waktu eksekusi dari blok kode.
     *
     * Fungsi ini menerima sebuah lambda sebagai parameter dan
     * mengeksekusinya sambil mengukur waktu yang diperlukan untuk
     * eksekusi tersebut. Waktu dilaporkan dalam milidetik.
     *
     * @param block Blok kode yang akan dieksekusi dan diukur.
     * @return Waktu yang diperlukan untuk mengeksekusi blok, dalam milidetik.
     */
    inline fun measureExecutionTime(block: () -> Unit): Long {
        val startTime = System.currentTimeMillis() // Mengambil waktu mulai
        block() // Mengeksekusi blok kode
        val endTime = System.currentTimeMillis() // Mengambil waktu selesai
        return endTime - startTime // Mengembalikan waktu yang berlalu
    }
}

fun main() {
    val timer = ExecutionTimer() // Membuat instance dari ExecutionTimer

    // Contoh penggunaan metode measureExecutionTime
    val executionTime = timer.measureExecutionTime {
        // Mensimulasikan tugas dengan tidur selama 1 detik
        Thread.sleep(1000)
    }

    println("Waktu eksekusi: $executionTime ms") // Menampilkan waktu eksekusi
}