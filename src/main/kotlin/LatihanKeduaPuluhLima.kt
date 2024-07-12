/**
 * Contoh penggunaan for loop di Kotlin di dalam sebuah kelas.
 *
 * Kelas ini menunjukkan cara menggunakan for loop untuk:
 * 1. Iterasi melalui rentang angka.
 * 2. Iterasi melalui array.
 * 3. Iterasi melalui daftar (list).
 * 4. Iterasi melalui map (peta).
 */
class LatihanDuaPuluhLima {

    /**
     * Iterasi melalui rentang angka dan mencetak setiap angka.
     *
     * @param range Rentang angka yang akan diiterasi.
     */
    fun iterateThroughRange(range: IntRange) {
        println("Iterasi melalui rentang angka:")
        for (number in range) {
            println(number)
        }
        println()
    }

    /**
     * Iterasi melalui array dan mencetak setiap elemen.
     *
     * @param array Array yang akan diiterasi.
     */
    fun iterateThroughArray(array: Array<String>) {
        println("Iterasi melalui array:")
        for (element in array) {
            println(element)
        }
        println()
    }

    /**
     * Iterasi melalui daftar dan mencetak setiap elemen.
     *
     * @param list Daftar yang akan diiterasi.
     */
    fun iterateThroughList(list: List<String>) {
        println("Iterasi melalui daftar:")
        for (item in list) {
            println(item)
        }
        println()
    }

    /**
     * Iterasi melalui map dan mencetak setiap pasangan kunci-nilai.
     *
     * @param map Map yang akan diiterasi.
     */
    fun iterateThroughMap(map: Map<String, String>) {
        println("Iterasi melalui map:")
        for ((key, value) in map) {
            println("Key: $key, Value: $value")
        }
        println()
    }
}

/**
 * Fungsi utama untuk mengeksekusi contoh for loop di dalam kelas LatihanDuaPuluhLima`.
 */
fun main() {
    val loopExamples = LatihanDuaPuluhLima()

    // 1. Iterasi melalui rentang angka
    loopExamples.iterateThroughRange(1..5)

    // 2. Iterasi melalui array
    val array = arrayOf("Kotlin", "Java", "Swift", "Python")
    loopExamples.iterateThroughArray(array)

    // 3. Iterasi melalui daftar
    val list = listOf("Apple", "Banana", "Cherry", "Date")
    loopExamples.iterateThroughList(list)

    // 4. Iterasi melalui map
    val map = mapOf("Key1" to "Value1", "Key2" to "Value2", "Key3" to "Value3")
    loopExamples.iterateThroughMap(map)
}