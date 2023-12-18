package seminar5.task1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class IntegrationTest {
    @Test
    public void testIntegration() {
        RandomNumberModule randomNumberModule = new RandomNumberModule();
        MaxNumberModule maxNumberModule = new MaxNumberModule();

        List<Integer> randomNums = randomNumberModule.getListOfRandomNums(5);

        assertThat(randomNums).hasSize(5); // Проверяем, что список случайных чисел имеет размер 5

        randomNums.add(5);
        randomNums.add(3);
        randomNums.add(1);
        randomNums.add(500);
        randomNums.add(13);

        int maxNumber = maxNumberModule.findMaxElement(randomNums);
        assertThat(maxNumber).isNotNull();

        List<Integer> sortedNums = new ArrayList<>(randomNums);
        Collections.sort(sortedNums);

        assertThat(maxNumber).isEqualTo(sortedNums.get(9));
    }
}
