package seminar1Test;

import static org.junit.Assert.*;
import org.junit.Test;
import seminar1.task1.SquareRoot;

public class SquareRootTest {
    @Test

    public void testSquarePositive() {
        assertEquals(5.0, SquareRoot.calculationOfSquareRoot(25.0), 0.001);
    }

    @Test
    public void testSquareRootZero(){
        assertEquals(0.0, SquareRoot.calculationOfSquareRoot(0.0), 0.001);
    }
    // Ожидаем получение именно определенного класса исключений.
    @Test(expected = IllegalArgumentException.class)
    public void testSquareRootNegative(){
        SquareRoot.calculationOfSquareRoot(-5.0);
    }

}
