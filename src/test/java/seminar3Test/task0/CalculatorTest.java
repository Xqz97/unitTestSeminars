package seminar3Test.task0;

import org.junit.jupiter.api.*;
import seminar3.task0.Calculator;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    @Test
    void computeLengthOfCircleTest(){
        assertThat(Calculator.computeLengthOfCircle(10)).isEqualTo(62.83185307179586);
    }

}
