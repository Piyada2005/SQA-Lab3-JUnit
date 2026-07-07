package sqa.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyFirstJUnitJupiterTests {

    private final ShiftCipher cipher = new ShiftCipher();

    @Test
    void testTC01() {
        String result = cipher.shift("SOFTWARE", 3);
        assertEquals("ZVMADHYL", result);
    }

    @Test
    void testTC02() {
        String result = cipher.shift("software", 3);
        assertEquals("zvmadhyl", result);
    }

    @Test
    void testTC03() {
        String result = cipher.shift("GITHUB", 3);
        assertEquals("JLWKXE", result);
    }

    @Test
    void testTC04() {
        String result = cipher.shift("github", 2);
        assertEquals("IKVJWD", result);
    }
}