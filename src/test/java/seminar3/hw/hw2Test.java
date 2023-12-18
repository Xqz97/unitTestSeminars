package seminar3.hw;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
import seminar3.hw.hw1;

import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.*;

public class hw2Test {

    @Test
    void  numberInIntervalTrue(){
        assertTrue(hw2.numberInInterval(26));
    }

    @Test
    void  numberInIntervalFalse(){
        assertFalse(hw2.numberInInterval(25));
    }

}
