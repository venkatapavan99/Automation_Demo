import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {

    @Test
    public void testAddition() {
        int result = 2 + 3;
        Assert.assertEquals(result, 5, "Addition test failed");
    }

    @Test
    public void testSubtraction() {
        int result = 5 - 3;
        Assert.assertEquals(result, 2, "Subtraction test failed");
    }
}
