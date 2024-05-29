import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class TestKelima {

    @Test
    fun `test integer decimal literal non empty`() = run {
        val integer = LatihanKelima.integerDecimalLiteral(90)
        assertThat(integer).isNotNull()
        assertThat(integer).isEqualTo(90)
    }

    @Test
    fun `test integer hex literal non empty`() = run {
        val integer = LatihanKelima.integerDecimalLiteral(0x7b)
        assertThat(integer).isNotNull()
        assertThat(integer).isEqualTo(0x7b)
    }

    @Test
    fun `test integer binary literal non empty`() = run {
        val integer = LatihanKelima.integerDecimalLiteral(0b01010110)
        assertThat(integer).isNotNull()
        assertThat(integer).isEqualTo(0b01010110)
    }

    @Test
    fun `test integer underscore literal non empty`() = run {
        val integer = LatihanKelima.integerDecimalLiteral(7_000_000)
        assertThat(integer).isNotNull()
        assertThat(integer).isEqualTo(7_000_000)
    }

    @Test
    fun `test float literal non empty`() = run {
        val float = LatihanKelima.floatLiteral(3.14f)
        assertThat(float).isNotNull()
        assertThat(float).isEqualTo(3.14f)
    }

    @Test
    fun `test double literal non empty`() = run {
        val double = LatihanKelima.doubleLiteral(3.14)
        assertThat(double).isNotNull()
        assertThat(double).isEqualTo(3.14)
    }

    @Test
    fun `test double scientific literal non empty`() = run {
        val double = LatihanKelima.doubleScientificLiteral(3.14e3)
        assertThat(double).isNotNull()
        assertThat(double).isEqualTo(3.14e3)
    }

    @Test
    fun `test char letter literal non empty`() = run {
        val char = LatihanKelima.charLetterLiteral('K')
        assertThat(char).isNotNull()
        assertThat(char).isEqualTo('K')
    }

    @Test
    fun `test char digital literal non empty`() = run {
        val char = LatihanKelima.charDigitLiteral('1')
        assertThat(char).isNotNull()
        assertThat(char).isEqualTo('1')
    }

    @Test
    fun `test char special literal non empty`() = run {
        val char = LatihanKelima.charSpecialLiteral('\u1f60')
        assertThat(char).isNotNull()
        assertThat(char).isEqualTo('\u1f60')
    }

    @Test
    fun `test string simple literal non empty`() = run {
        val string = LatihanKelima.stringSimpleLiteral("Faisal Zuhri")
        assertThat(string).isNotNull()
        assertThat(string).isEqualTo("Faisal Zuhri")
    }

    @Test
    fun `test string multiline literal non empty`() = run {
        val string = LatihanKelima.stringMultiLineLiteral(
            """
                Nama: Faisal Zuhri
                hobby: ngoding
            """.trimIndent()
        )
        assertThat(string).isNotNull()
        assertThat(string).isEqualTo( """
                Nama: Faisal Zuhri
                hobby: ngoding
            """.trimIndent()
        )
    }

    @Test
    fun `test boolean true literal non empty`() = run {
        val boolean = LatihanKelima.booleanTrueLiteral(true)
        assertThat(boolean).isTrue()
        assertThat(boolean).isEqualTo(true)
    }

    @Test
    fun `test boolean false literal non empty`() = run {
        val boolean = LatihanKelima.booleanFalseLiteral(false)
        assertThat(boolean).isFalse()
        assertThat(boolean).isEqualTo(false)
    }

    @Test
    fun `test nullable literal non empty`() = run {
        val nullable = LatihanKelima.nullLiteral(null)
        assertThat(nullable).isNull()
        assertThat(nullable).isEqualTo(null)
    }
}