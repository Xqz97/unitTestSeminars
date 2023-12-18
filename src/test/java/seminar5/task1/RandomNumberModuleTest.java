package seminar5.task1;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class RandomNumberModuleTest {

    @Test
    public void testIntegration() {
        RandomNumberModule randomNumberModule = new RandomNumberModule();
        MaxNumberModule maxNumberModule = new MaxNumberModule();

        List<Integer> randomNums = randomNumberModule.getListOfRandomNums(5);

        assertThat(randomNums).hasSize(5);

        int maxNumber = maxNumberModule.findMaxElement(randomNums);
        assertThat(maxNumber).isNotNull();

        List<Integer> sortedNums = List.copyOf(randomNums); // Создание копии списка randomNums
        Collections.sort(sortedNums); // Сортировка скопированного списка

        assertThat(randomNums).isEqualTo(sortedNums);
    }
}
