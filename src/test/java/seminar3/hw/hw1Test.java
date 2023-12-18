package seminar3.hw;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class hw1Test {

    @Test
    void  evenOddNumberTest1(){
        assertTrue(hw1.evenOddNumber(4));
    }

    @Test
    void  evenOddNumberTest2(){
        assertFalse(hw1.evenOddNumber(3));
    }

}
