/**
 * Kelas LatihanKeEnamBelas menyediakan operasi dasar pada array.
 */
class LatihanKeEnamBelas {

    /**
     * Membuat array dari tipe Int dengan nilai awal.
     * @param values Nilai-nilai awal yang akan dimasukkan ke dalam array.
     * @return IntArray dengan nilai-nilai yang diberikan.
     */
    fun createIntArray(vararg values: Int): IntArray {
        return intArrayOf(*values)
    }

    /**
     * Membuat array dari tipe String dengan nilai awal.
     * @param values Nilai-nilai awal yang akan dimasukkan ke dalam array.
     * @return Array dari tipe String.
     */
    fun createStringArray(vararg values: String): Array<String> {
        return arrayOf(*values)
    }

    /**
     * Membuat array dari tipe Double dengan nilai awal.
     * @param values Nilai-nilai awal yang akan dimasukkan ke dalam array.
     * @return DoubleArray dengan nilai-nilai yang diberikan.
     */
    fun createDoubleArray(vararg values: Double): DoubleArray {
        return doubleArrayOf(*values)
    }

    /**
     * Membuat array kosong dari tipe Char dengan ukuran yang diberikan.
     * @param size Ukuran dari array yang akan dibuat.
     * @return Array dari tipe Char dengan elemen kosong.
     */
    fun createEmptyCharArray(size: Int): CharArray {
        return CharArray(size) { ' ' }
    }

    /**
     * Mengubah nilai elemen pada array Int pada indeks yang diberikan.
     * @param array Array yang akan diubah.
     * @param index Indeks dari elemen yang akan diubah.
     * @param newValue Nilai baru untuk elemen pada indeks yang diberikan.
     */
    fun updateIntArrayElement(array: IntArray, index: Int, newValue: Int) {
        array[index] = newValue
    }

    /**
     * Mengubah nilai elemen pada array String pada indeks yang diberikan.
     * @param array Array yang akan diubah.
     * @param index Indeks dari elemen yang akan diubah.
     * @param newValue Nilai baru untuk elemen pada indeks yang diberikan.
     */
    fun updateStringArrayElement(array: Array<String>, index: Int, newValue: String) {
        array[index] = newValue
    }

    /**
     * Mengubah nilai elemen pada array Double pada indeks yang diberikan.
     * @param array Array yang akan diubah.
     * @param index Indeks dari elemen yang akan diubah.
     * @param newValue Nilai baru untuk elemen pada indeks yang diberikan.
     */
    fun updateDoubleArrayElement(array: DoubleArray, index: Int, newValue: Double) {
        array[index] = newValue
    }

    /**
     * Mengubah nilai elemen pada array Char pada indeks yang diberikan.
     * @param array Array yang akan diubah.
     * @param index Indeks dari elemen yang akan diubah.
     * @param newValue Nilai baru untuk elemen pada indeks yang diberikan.
     */
    fun updateCharArrayElement(array: CharArray, index: Int, newValue: Char) {
        array[index] = newValue
    }

    /**
     * Mendapatkan panjang dari array.
     * @param array Array yang akan diukur panjangnya.
     * @return Panjang dari array.
     */
    fun getArrayLength(array: Any): Int {
        return when (array) {
            is IntArray -> array.size
            is Array<*> -> array.size
            is DoubleArray -> array.size
            is CharArray -> array.size
            else -> throw IllegalArgumentException("Unsupported array type")
        }
    }

    /**
     * Mengiterasi elemen-elemen dari array dan mencetaknya ke konsol.
     * @param array Array yang akan diiterasi.
     */
    fun printArrayElements(array: Any) {
        when (array) {
            is IntArray -> array.forEach { println(it) }
            is Array<*> -> array.forEach { println(it) }
            is DoubleArray -> array.forEach { println(it) }
            is CharArray -> array.forEach { println(it) }
            else -> throw IllegalArgumentException("Unsupported array type")
        }
    }

    /**
     * Membuat array dari tipe String yang dapat mengandung nilai null.
     * @param size Ukuran dari array yang akan dibuat.
     * @return Array dari tipe String yang dapat mengandung nilai null.
     */
    fun createNullableStringArray(size: Int): Array<String?> {
        return arrayOfNulls(size)
    }
}

// Main function untuk pengujian manual
fun main() {
    val arrayOps = LatihanKeEnamBelas()

    val intArray = arrayOps.createIntArray(1, 2, 3, 4, 5)
    val stringArray = arrayOps.createStringArray("Kotlin", "Java", "Swift")
    val doubleArray = arrayOps.createDoubleArray(1.1, 2.2, 3.3, 4.4, 5.5)
    val charArray = arrayOps.createEmptyCharArray(5)

    println("Element pertama dari intArray: ${intArray[0]}")
    arrayOps.updateIntArrayElement(intArray, 0, 10)
    println("Element pertama dari intArray setelah diubah: ${intArray[0]}")

    println("Element kedua dari stringArray: ${stringArray[1]}")
    arrayOps.updateStringArrayElement(stringArray, 1, "Python")
    println("Element kedua dari stringArray setelah diubah: ${stringArray[1]}")

    println("Element ketiga dari doubleArray: ${doubleArray[2]}")
    arrayOps.updateDoubleArrayElement(doubleArray, 2, 6.6)
    println("Element ketiga dari doubleArray setelah diubah: ${doubleArray[2]}")

    println("Element pertama dari charArray: ${charArray[0]}")
    arrayOps.updateCharArrayElement(charArray, 0, 'A')
    println("Element pertama dari charArray setelah diubah: ${charArray[0]}")

    println("Panjang intArray: ${arrayOps.getArrayLength(intArray)}")
    println("Panjang stringArray: ${arrayOps.getArrayLength(stringArray)}")

    println("Iterasi melalui intArray:")
    arrayOps.printArrayElements(intArray)

    val nullableArray = arrayOps.createNullableStringArray(3)
    nullableArray[0] = "Hello"
    nullableArray[1] = null
    nullableArray[2] = "World"
    println("Menampilkan nullableArray:")
    arrayOps.printArrayElements(nullableArray)
}