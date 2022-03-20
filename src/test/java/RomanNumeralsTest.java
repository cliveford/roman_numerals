import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsTest {

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
    void checkThatNumbersReturn0() {
        assertEquals(0, RomanNumerals.convertToNumber("99"));
    }

    @Test
    void checkThatNonRomanNumeralsReturn0() {
        assertEquals(0, RomanNumerals.convertToNumber("xyz"));
    }
}