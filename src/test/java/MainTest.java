import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void checkThatIConvertsTo1() {
        assertEquals(1, Main.convertToNumber("I"));
    }

    @Test
    void checkThatIIConvertsTo2() {
        assertEquals(2, Main.convertToNumber("II"));
    }

    @Test
    void checkThatIIIConvertsTo3() {
        assertEquals(3, Main.convertToNumber("III"));
    }

    @Test
    void checkThatIVConvertsTo4() {
        assertEquals(4, Main.convertToNumber("IV"));
    }

    @Test
    void checkThatVConvertsTo5() {
        assertEquals(5, Main.convertToNumber("V"));
    }

    @Test
    void checkThatVIConvertsTo6() {
        assertEquals(6, Main.convertToNumber("VI"));
    }

    @Test
    void checkThatVIIConvertsTo7() {
        assertEquals(7, Main.convertToNumber("VII"));
    }

    @Test
    void checkThatVIIIConvertsTo8() {
        assertEquals(8, Main.convertToNumber("VIII"));
    }

    @Test
    void checkThatIXConvertsTo9() {
        assertEquals(9, Main.convertToNumber("IX"));
    }

    @Test
    void checkThatXConvertsTo10() {
        assertEquals(10, Main.convertToNumber("X"));
    }

    @Test
    void checkThatNumbersReturn0() {
        assertEquals(0, Main.convertToNumber("99"));
    }

    @Test
    void checkThatNonRomanNumeralsReturn0() {
        assertEquals(0, Main.convertToNumber("xyz"));
    }
}