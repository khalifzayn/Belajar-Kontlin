import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class TestKeenam {

    @Test
    fun `test string to int`() = run {
        val str = ConversionUtils.stringToInt("123")
        assertThat(str).isNotNull()
        assertThat(str).isEqualTo(123)
    }

    @Test
    fun `test string to exception`() = run {
        val str = ConversionUtils.stringToInt("1.23")
        assertThat(str).isNull()
    }

    @Test
    fun `test string to double`() = run {
        val double = ConversionUtils.stringToDouble("1.23")
        assertThat(double).isNotNull()
        assertThat(double).isEqualTo(1.23)
    }

    @Test
    fun `test string to double exception`() = run {
        val double = ConversionUtils.stringToDouble("123L")
        assertThat(double).isNull()
    }


    @Test
    fun `test string to float`() = run {
        val float = ConversionUtils.stringToFloat("1.23")
        assertThat(float).isNotNull()
        assertThat(float).isEqualTo(1.23)
    }

    @Test
    fun `test string to float exception`() = run {
        val float = ConversionUtils.stringToFloat("1.23")
        assertThat(float).isNull()
    }

    @Test
    fun `test float to string`() = run {
        val float = ConversionUtils.floatToString(1.23F)
        assertThat(float).isNotNull()
        assertThat(float).isEqualTo("1.23")
    }

    @Test
    fun `test string to long`() = run {
        val string = ConversionUtils.stringToLong("123")
        assertThat(string).isNotNull()
        assertThat(string).isEqualTo(123)
    }

    @Test
    fun `test string to long exception`() = run {
        val string = ConversionUtils.stringToLong("1.23")
        assertThat(string).isNull()
    }

    @Test
    fun `test long to string`() = run {
        val long = ConversionUtils.longToString(123L)
        assertThat(long).isNotNull()
        assertThat(long).isEqualTo("123")
    }
}