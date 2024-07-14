/**
 * Contoh penggunaan while loop dan do-while loop di Kotlin.
 *
 * Kelas ini menunjukkan cara menggunakan while loop dan do-while loop untuk:
 * 1. Iterasi melalui angka sampai kondisi terpenuhi.
 * 2. Iterasi melalui daftar (list) menggunakan iterator.
 * 3. Contoh penggunaan do-while loop.
 */
class LatihanKeDuaPuluhEnam {

    /**
     * Iterasi melalui angka dari 1 sampai kondisi terpenuhi menggunakan while loop.
     *
     * @param limit Batas atas untuk iterasi.
     */
    fun iterateThroughNumbers(limit: Int) {
        println("Iterasi melalui angka menggunakan while loop:")
        var number = 1
        while (number <= limit) {
            println(number)
            number++
        }
        println()
    }

    /**
     * Iterasi melalui daftar menggunakan iterator dan while loop.
     *
     * @param list Daftar yang akan diiterasi.
     */
    fun iterateThroughList(list: List<String>) {
        println("Iterasi melalui daftar menggunakan while loop dan iterator:")
        val iterator = list.iterator()
        while (iterator.hasNext()) {
            println(iterator.next())
        }
        println()
    }

    /**
     * Contoh penggunaan do-while loop yang memastikan setidaknya satu iterasi dilakukan.
     */
    fun doWhileExample() {
        println("Contoh penggunaan do-while loop:")
        var count = 0
        do {
            println("Iterasi ke-$count")
            count++
        } while (count < 5)
        println()
    }
}

/**
 * Fungsi utama untuk mengeksekusi contoh while loop dan do-while loop di dalam kelas LatihanKeDuaPuluhEnam.
 */
fun main() {
    val whileLoopExamples = LatihanKeDuaPuluhEnam()

    // 1. Iterasi melalui angka sampai kondisi terpenuhi
    whileLoopExamples.iterateThroughNumbers(5)

    // 2. Iterasi melalui daftar menggunakan iterator
    val list = listOf("Kotlin", "Java", "Swift", "Python")
    whileLoopExamples.iterateThroughList(list)

    // 3. Contoh penggunaan do-while loop
    whileLoopExamples.doWhileExample()
}