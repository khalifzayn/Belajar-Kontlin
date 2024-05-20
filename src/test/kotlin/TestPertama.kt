import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test


class TestPertama {
    /**
     * Metode pengujian ini memeriksa apakah fungsi showingPrint dari kelas pertama
     * berjalan dengan sukses dan mengembalikan hasil yang tidak null serta bertipe Unit.
     *
     * Kasus uji ini memastikan bahwa showingPrint tidak mengembalikan nilai
     * kosong (null) dan memastikan bahwa tipe yang dikembalikan adalah Unit.
     */


    @Test
    fun `showing print success (case not Empty)` () = run {
        // Variable memanggil instance LatihanPertama
        val latihanPertama = LatihanPertama()

        // Variable menampung data dari variable latihanPertama
        val result = latihanPertama.showingPrint

        // Mengecheck Apakah Datanya tidak kosong
        assertThat(result).isNotNull()

        //Mengecheck Apakah Tipe data dari function showingPrint adalah Unit
        assertThat(result).isInstanceOf(Unit::class.java)
    }
}