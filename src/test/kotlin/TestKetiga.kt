import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

/**
 * Kelas TestKetiga digunakan untuk menguji fungsionalitas dari kelas LatihanKetiga.
 *
 * Kelas ini berisi dua unit test untuk memverifikasi perilaku metode sendMessage dari
 * kelas LatihanKetiga.
 *
 * @since 1.0
 * @version 1.0
 * @source LatihanKetiga.kt
 * @author Faisal Zuhri
 */
class TestKetiga {

    /**
     * Menguji perilaku metode sendMessage ketika pesan yang dikirim kosong.
     *
     * Fungsi ini memverifikasi bahwa nilai awal dari message adalah kosong dan
     * memastikan bahwa nilai yang dikembalikan juga kosong. Selain itu, fungsi ini
     * memastikan bahwa kedua nilai tersebut adalah instance dari String.
     *
     * @since 1.0
     */
    @Test
    fun `test empty message`() {
        val message = LatihanKetiga.message
        val sendMessage = LatihanKetiga.sendMessage("")
        assertThat(message).isEmpty()
        assertThat(sendMessage).isEmpty()
        assertThat(message).isInstanceOf(String::class.java)
        assertThat(sendMessage).isInstanceOf(String::class.java)
    }

    /**
     * Menguji perilaku metode sendMessage ketika pesan yang dikirim tidak kosong.
     *
     * Fungsi ini memverifikasi bahwa nilai awal dari message adalah kosong dan
     * memastikan bahwa nilai yang dikembalikan tidak kosong. Selain itu, fungsi ini
     * memastikan bahwa kedua nilai tersebut adalah instance dari String.
     *
     * @since 1.0
     */
    @Test
    fun `test not empty message`() {
        val sendMessage = LatihanKetiga.sendMessage("Faisal")
        val message = LatihanKetiga.message
        assertThat(message).isNotEmpty()
        assertThat(sendMessage).isNotEmpty()
        assertThat(message).isInstanceOf(String::class.java)
        assertThat(sendMessage).isInstanceOf(String::class.java)
    }
}