/**
 * Object AppConfig digunakan untuk menyimpan pengaturan aplikasi.
 *
 * Object ini merupakan contoh penggunaan singleton dalam Kotlin, di mana hanya ada
 * satu instance dari AppConfig yang tersedia di seluruh aplikasi.
 */
object AppConfig {
    var appName: String = "My Application"
    var version: String = "1.0.0"

    /**
     * Menampilkan informasi pengaturan aplikasi.
     *
     * @return String yang berisi nama aplikasi dan versinya.
     */
    fun showConfig(): String {
        return "$appName - Version: $version"
    }

    /**
     * Memperbarui pengaturan aplikasi.
     *
     * @param newAppName Nama baru untuk aplikasi.
     * @param newVersion Versi baru untuk aplikasi.
     */
    fun updateConfig(newAppName: String, newVersion: String) {
        appName = newAppName
        version = newVersion
    }
}

fun main() {
    // Menampilkan pengaturan awal
    println(AppConfig.showConfig())

    // Memperbarui pengaturan aplikasi
    AppConfig.updateConfig("Awesome App", "2.0.0")

    // Menampilkan pengaturan setelah diperbarui
    println(AppConfig.showConfig())
}