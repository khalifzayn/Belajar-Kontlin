const val APP_VERSION ="1.0.0"
object LatihanKelimabelas {
    fun displayAppVersion(appVersion: String): String {
        return appVersion.also {value ->
            println("Value App Version: $value")

        }
    }
}

fun main() {
    LatihanKelimabelas.displayAppVersion(APP_VERSION)
}