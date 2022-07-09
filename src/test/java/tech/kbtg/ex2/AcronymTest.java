package tech.kbtg.ex2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class AcronymTest {

    @ParameterizedTest
    @CsvSource(value = {
            "Portable Network Graphics|PNG",
            "Ruby on Rails|ROR",
            "First In, First Out|FIFO",
            "GNU Image Manipulation Program|GIMP",
            "Complementary metal-oxide semiconductor|CMOS",
            "tech:kbtg:exercise|TKE",
    }, delimiter = '|')
    void acronymTest(String input, String expect) {
        Acronym acronym = new Acronym();
        // input :: Portable Network Graphics
        // output [expect] :: PNG
        String actual = acronym.abbreviate(input);
        assertEquals(expect, actual);
    }

    @Test
    void portableNetworkGraphicsShouldBeReturnPNG() {
        Acronym acronym = new Acronym();
        String input = "Portable Network Graphics";
        String expect = "PNG";
        String actual = acronym.abbreviate(input);
        assertEquals(expect, actual);
    }
}
