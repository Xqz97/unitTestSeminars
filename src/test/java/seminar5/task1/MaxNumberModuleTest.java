package seminar5.task1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class MaxNumberModuleTest {

    @Test
    public void testMaxNumber(){
        MaxNumberModule maxNumberModule = new MaxNumberModule();
        List<Integer> testArray = new ArrayList<>(5);
        testArray.add(5);
        testArray.add(3);
        testArray.add(1);
        testArray.add(500);
        testArray.add(13);
        assertThat(maxNumberModule.findMaxElement(testArray)).isEqualTo(500);
    }
}
