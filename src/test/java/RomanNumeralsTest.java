import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsTest {

    @ParameterizedTest
    @ValueSource(strings = { "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X" })
    void checkThatRomanNumeralsConvertToANumberBetween1And10(String input) {
        int number = RomanNumerals.convertToNumber(input);
        assertTrue(number >=1 && number <=10);
    }

    @ParameterizedTest
    @CsvSource({"I,1", "II,2", "III,3", "IV,4", "V,5", "VI,6", "VII,7", "VIII,8", "IX,9", "X,10"})
     void checkThatRomanNumeralsConvertToCorrectNumber(String input, String expected) {
        String number = Integer.toString(RomanNumerals.convertToNumber(input));
        assertEquals(expected, number);
    }

    @Test
    void checkThatIConvertsTo1() {
        assertEquals(1, RomanNumerals.convertToNumber("I"));
    }

    @Test
    void checkThatIIConvertsTo2() {
        assertEquals(2, RomanNumerals.convertToNumber("II"));
    }

    @Test
    void checkThatIIIConvertsTo3() {
        assertEquals(3, RomanNumerals.convertToNumber("III"));
    }

    @Test
    void checkThatIVConvertsTo4() {
        assertEquals(4, RomanNumerals.convertToNumber("IV"));
    }

    @Test
    void checkThatVConvertsTo5() {
        assertEquals(5, RomanNumerals.convertToNumber("V"));
    }

    @Test
    void checkThatVIConvertsTo6() {
        assertEquals(6, RomanNumerals.convertToNumber("VI"));
    }

    @Test
    void checkThatVIIConvertsTo7() {
        assertEquals(7, RomanNumerals.convertToNumber("VII"));
    }

    @Test
    void checkThatVIIIConvertsTo8() {
        assertEquals(8, RomanNumerals.convertToNumber("VIII"));
    }

    @Test
    void checkThatIXConvertsTo9() {
        assertEquals(9, RomanNumerals.convertToNumber("IX"));
    }

    @Test
    void checkThatXConvertsTo10() {
        assertEquals(10, RomanNumerals.convertToNumber("X"));
    }

    @Test
    void checkThatLowercaseXConvertsTo0() {
        assertEquals(0, RomanNumerals.convertToNumber("x"));
    }

    @Test
    void checkThatLowercaseIAndUppercaseXConvertTo0() {
        assertEquals(0, RomanNumerals.convertToNumber("iX"));
    }

    @Test
    void checkThatNumberConvertsTo0() {
        assertEquals(0, RomanNumerals.convertToNumber("9"));
    }

    @Test
    void checkThatMultipleNumbersConvertTo0() {
        assertEquals(0, RomanNumerals.convertToNumber("92680"));
    }

    @Test
    void checkThatMultipleMixedCaseLettersConvertTo0() {
        assertEquals(0, RomanNumerals.convertToNumber("xVz"));
    }
}