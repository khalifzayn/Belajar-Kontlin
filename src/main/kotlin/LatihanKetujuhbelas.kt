/**
 * Contoh penggunaan range dalam Kotlin.
 */
object LatihanKetujubelas {

    /**
     * Menampilkan semua bilangan dalam rentang dari 1 hingga 10.
     */
    fun intRangeExample() {
        val range: IntRange = 1..10
        for (i in range) {
            println(i)
        }
    }

    /**
     * Menampilkan semua huruf dalam rentang dari 'a' hingga 'f'.
     */
    fun charRangeExample() {
        val range: CharRange = 'a'..'f'
        for (ch in range) {
            println(ch)
        }
    }

    /**
     * Menampilkan semua bilangan dalam rentang dari 100L hingga 110L.
     */
    fun longRangeExample() {
        val range: LongRange = 100L..110L
        for (l in range) {
            println(l)
        }
    }

    /**
     * Menampilkan semua bilangan genap dalam rentang dari 2 hingga 20.
     */
    fun stepRangeExample() {
        val range: IntProgression = 2..20 step 2
        for (i in range) {
            println(i)
        }
    }

    /**
     * Menampilkan semua bilangan dalam rentang terbalik dari 10 hingga 1.
     */
    fun downToRangeExample() {
        val range: IntProgression = 10 downTo 1
        for (i in range) {
            println(i)
        }
    }
}

fun main() {
    LatihanKetujubelas.intRangeExample()
    println("----")
    LatihanKetujubelas.charRangeExample()
    println("----")
    LatihanKetujubelas.longRangeExample()
    println("----")
    LatihanKetujubelas.stepRangeExample()
    println("----")
    LatihanKetujubelas.downToRangeExample()
}