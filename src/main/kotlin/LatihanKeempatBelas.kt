/**
 * Objek yang berisi contoh penggunaan tipe nullable (?) dalam berbagai konteks dasar.
 */
object LatihanKeempatBelas {

    /**
     * Menunjukkan cara deklarasi dan inisialisasi variabel nullable.
     */
    fun nullableDeclaration() {
        // Deklarasi variabel nullable
        var nullableString: String? = "Hello"
        println("Initial nullableString: $nullableString") // Output: Hello

        // Mengubah nilai menjadi null
        nullableString = null
        println("Nullable string after set to null: $nullableString") // Output: null
    }

    /**
     * Menunjukkan penggunaan operator safe call (?.) untuk mengakses properti atau metode dari objek nullable.
     */
    fun safeCallOperator() {
        val nullableString: String? = "Hello"

        // Menggunakan operator safe call untuk mendapatkan panjang string
        val length = nullableString?.length
        println("Length of nullableString: $length") // Output: 5

        val nullableStringNull: String? = null

        // Safe call pada nilai null
        val lengthNull = nullableStringNull?.length
        println("Length of nullableStringNull: $lengthNull") // Output: null
    }

    /**
     * Menunjukkan penggunaan operator elvis (?:) untuk memberikan nilai default jika nilai adalah null.
     */
    fun elvisOperator() {
        val nullableString: String? = null

        // Menggunakan operator elvis untuk memberikan nilai default
        val result = nullableString ?: "Default Value"
        println("Result with Elvis operator: $result") // Output: Default Value
    }

    /**
     * Menunjukkan penggunaan casting aman dengan as? untuk mengubah tipe data secara aman.
     */
    fun safeCasting() {
        val obj: Any = "Hello"

        // Menggunakan safe casting untuk mengubah tipe data
        val str: String? = obj as? String
        println("Safe casting result: $str") // Output: Hello

        val number: Int? = obj as? Int
        println("Safe casting result with incompatible type: $number") // Output: null
    }

    /**
     * Menunjukkan penggunaan nullable dengan koleksi.
     */
    fun nullableCollections() {
        // Deklarasi daftar nullable
        val nullableList: List<String?> = listOf("Hello", null, "World")

        for (item in nullableList) {
            // Menggunakan safe call untuk menghindari NullPointerException
            println("Item: ${item?.toUpperCase()}") // Output: HELLO, null, WORLD
        }
    }

    /**
     * Menunjukkan penggunaan nullable dalam pengelolaan map.
     */
    fun nullableMap() {
        // Deklarasi map dengan nilai nullable
        val nullableMap: Map<String, String?> = mapOf("Key1" to "Value1", "Key2" to null)

        // Mengakses nilai dengan operator safe call
        val value1 = nullableMap["Key1"]
        val value2 = nullableMap["Key2"]
        val value3 = nullableMap["Key3"]

        println("Value for Key1: $value1") // Output: Value for Key1: Value1
        println("Value for Key2: $value2") // Output: Value for Key2: null
        println("Value for Key3: $value3") // Output: Value for Key3: null
    }

    /**
     * Menunjukkan penanganan nullable dengan if dan when.
     */
    fun nullableControlFlow() {
        val nullableString: String? = "Hello"

        // Menggunakan if untuk memeriksa null
        if (nullableString != null) {
            println("Nullable string is not null: $nullableString") // Output: Hello
        } else {
            println("Nullable string is null")
        }

        // Menggunakan when untuk memeriksa null
        when (nullableString) {
            null -> println("Nullable string is null")
            else -> println("Nullable string is not null: $nullableString") // Output: Hello
        }

        val nullableStringNull: String? = null

        // Menggunakan if untuk memeriksa null
        if (nullableStringNull != null) {
            println("Nullable string is not null: $nullableStringNull")
        } else {
            println("Nullable string is null") // Output: Nullable string is null
        }

        // Menggunakan when untuk memeriksa null
        when (nullableStringNull) {
            null -> println("Nullable string is null") // Output: Nullable string is null
            else -> println("Nullable string is not null: $nullableStringNull")
        }
    }
}

/**
 * Fungsi utama untuk menjalankan contoh penggunaan tipe nullable.
 */
fun main() {
    LatihanKeempatBelas.nullableDeclaration()
    LatihanKeempatBelas.safeCallOperator()
    LatihanKeempatBelas.elvisOperator()
    LatihanKeempatBelas.safeCasting()
    LatihanKeempatBelas.nullableCollections()
    LatihanKeempatBelas.nullableMap()
    LatihanKeempatBelas.nullableControlFlow()
}