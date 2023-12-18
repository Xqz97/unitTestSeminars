package seminar5.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomNumberModule {

    public List<Integer> getListOfRandomNums(int count){
        List<Integer> numbers = new ArrayList<>(count);
        Random random = new Random();

        // Заполнение списка случайными числами
        for (int i = 0; i < count; i++) {
            int randomNumber = random.nextInt(100); // Генерация случайного числа от 0 до 99
            numbers.add(randomNumber);
        }

        return numbers;
    }

}