import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DemoTest {

    @Test
    void testAddition() {
        int result = 2 + 3;
        assertEquals(5, result, "Addition test failed!");
    }

    @Test
    void testSubtraction() {
        int result = 10 - 4;
        assertEquals(6, result, "Subtraction test failed!");
    }
}

