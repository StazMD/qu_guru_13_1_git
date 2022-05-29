package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest {

    @Test
    void firstTest() {
        Assertions.assertFalse(6 > 2);
    }
    @Test

    void secondTest() {
        Assertions.assertFalse(6 > 1);
    }

}
