package seminar1Test;

import seminar1.hw.calculator.Calculator;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void testCalculateDiscount() {
        assertThat(Calculator.calculateDiscount(5000.0, 10.0)).isEqualTo(4500.0);
        assertThat(Calculator.calculateDiscount(5000.0, -10.0)).isEqualTo(4500.0);
        assertThat(Calculator.calculateDiscount(-5000.0, 10.0)).isEqualTo(4500.0);
    }
}
