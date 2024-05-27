import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class TestKeempat {

    @Test
    fun `test min byte`() = run {
        val byteValue = LatihanKeempat.exampleByte()
        assertThat(byteValue).isNotNull()
        assertThat(byteValue).isLessThan(Byte.MAX_VALUE)
        assertThat(byteValue).isEqualTo(Byte.MIN_VALUE)
    }

    @Test
    fun `test max byte`() = run {
        val byteValue = LatihanKeempat.exampleByte(Byte.MAX_VALUE)
        assertThat(byteValue).isNotNull()
        assertThat(byteValue).isGreaterThan(Byte.MIN_VALUE)
        assertThat(byteValue).isEqualTo(Byte.MAX_VALUE)
    }

    @Test
    fun `test min short`() = run {
        val shortValue = LatihanKeempat.exampleShort()
        assertThat(shortValue).isNotNull()
        assertThat(shortValue).isLessThan(Short.MAX_VALUE)
        assertThat(shortValue).isEqualTo(Short.MIN_VALUE)
    }

    @Test
    fun `test max short`() = run {
        val shortValue = LatihanKeempat.exampleShort(Short.MAX_VALUE)
        assertThat(shortValue).isNotNull()
        assertThat(shortValue).isGreaterThan(Short.MIN_VALUE)
        assertThat(shortValue).isEqualTo(Short.MAX_VALUE)
    }

    @Test
    fun `test min int`() = run {
        val intValue = LatihanKeempat.exampleInt()
        assertThat(intValue).isNotNull()
        assertThat(intValue).isLessThan(Int.MAX_VALUE)
        assertThat(intValue).isEqualTo(Int.MIN_VALUE)
    }

    @Test
    fun `test max int`() = run {
        val intValue = LatihanKeempat.exampleInt(Int.MAX_VALUE)
        assertThat(intValue).isNotNull()
        assertThat(intValue).isGreaterThan(Int.MIN_VALUE)
        assertThat(intValue).isEqualTo(Int.MAX_VALUE)
    }

    @Test
    fun `test min long`() = run {
        val longValue = LatihanKeempat.exampleLong()
        assertThat(longValue).isNotNull()
        assertThat(longValue).isLessThan(Long.MAX_VALUE)
        assertThat(longValue).isEqualTo(Long.MIN_VALUE)
    }

    @Test
    fun `test max long`() = run {
        val longValue = LatihanKeempat.exampleLong(Long.MAX_VALUE)
        assertThat(longValue).isNotNull()
        assertThat(longValue).isGreaterThan(Long.MIN_VALUE)
        assertThat(longValue).isEqualTo(Long.MAX_VALUE)
    }

    @Test
    fun `test min float`() = run {
        val floatValue = LatihanKeempat.exampleFloat()
        assertThat(floatValue).isNotNull()
        assertThat(floatValue).isLessThan(Float.MAX_VALUE)
        assertThat(floatValue).isEqualTo(Float.MIN_VALUE)
    }

    @Test
    fun `test max float`() = run {
        val floatValue = LatihanKeempat.exampleFloat(Float.MAX_VALUE)
        assertThat(floatValue).isNotNull()
        assertThat(floatValue).isGreaterThan(Float.MIN_VALUE)
        assertThat(floatValue).isEqualTo(Float.MAX_VALUE)
    }

    @Test
    fun `test min double`() = run {
        val doubleValue = LatihanKeempat.exampleDouble()
        assertThat(doubleValue).isNotNull()
        assertThat(doubleValue).isLessThan(Double.MAX_VALUE)
        assertThat(doubleValue).isEqualTo(Double.MIN_VALUE)
    }

    @Test
    fun `test max double`() = run {
        val doubleValue = LatihanKeempat.exampleDouble(Double.MAX_VALUE)
        assertThat(doubleValue).isNotNull()
        assertThat(doubleValue).isGreaterThan(Double.MIN_VALUE)
        assertThat(doubleValue).isEqualTo(Double.MAX_VALUE)
    }

    @Test
    fun `test min char`() = run {
        val charValue = LatihanKeempat.exampleChar()
        assertThat(charValue).isNotNull()
        assertThat(charValue).isLessThan(Char.MAX_VALUE)
        assertThat(charValue).isEqualTo(Char.MIN_VALUE)
    }

    @Test
    fun `test max char`() = run {
        val charValue = LatihanKeempat.exampleChar(Char.MAX_VALUE)
        assertThat(charValue).isNotNull()
        assertThat(charValue).isGreaterThan(Char.MIN_VALUE)
        assertThat(charValue).isEqualTo(Char.MAX_VALUE)
    }

    @Test
    fun `test true boolean`() = run {
        val booleanValue = LatihanKeempat.exampleBoolean()
        assertThat(booleanValue).isNotNull()
        assertThat(booleanValue).isTrue()
    }

    @Test
    fun `test false boolean`() = run {
        val booleanValue = LatihanKeempat.exampleBoolean(false)
        assertThat(booleanValue).isNotNull()
        assertThat(booleanValue).isFalse()
    }
}
