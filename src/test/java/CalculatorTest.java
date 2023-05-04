import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(-1, -2);
        Assertions.assertTrue(result >= 0, "Wynik dodawania nie może być mniejszy od zera");
    }
}