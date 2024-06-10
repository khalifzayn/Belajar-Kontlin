import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class TestKetujuh {

    @Test
    fun `test display character`() = run {
        val char = LatihanKetujuh.displayCharacter('A')

        assertThat(char).isNotNull()
        assertThat(char).isEqualTo('A')
    }

    @Test
    fun `test display escape sequence`() = run {
        val char = LatihanKetujuh.displayEscapeSequence(
            newLineChar = '\n',
            tabChar = '\t',
            backslashChar = '\\'
        )

        assertThat(char).isNotNull()
    }

    @Test
    fun `test display manipulation char`() = run {
        val char = LatihanKetujuh.displayManipulationChar(
            charLower = 'a',
            charUpper = 'A'
        )

        assertThat(char).isNotNull()
    }

    @Test
    fun `display type checker`() = run {
        val char = LatihanKetujuh.displayTypeChecker(
            charDigit = '3',
            charLetter = 'A',
            charWhitespace = ' '
        )

        assertThat(char).isNotNull()
    }
}