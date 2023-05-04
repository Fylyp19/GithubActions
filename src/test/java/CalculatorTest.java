import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 2);
        Assertions.assertEquals(4, result, "Expected result is 4");
    }

    @Test
    public void testAdd2() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 4);
        Assertions.assertEquals(6, result, "Expected result is 5");
    }
}
