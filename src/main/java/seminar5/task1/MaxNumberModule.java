package seminar5.task1;

import java.util.List;

public class MaxNumberModule {

    public int findMaxElement(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("Список чисел пуст или равен null");
        }

        int max = numbers.get(0);
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        return max;
    }
}
