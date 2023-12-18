package seminar3.task1;

public class SomeService {

    // Задание 1
    public String fizzBuzzСonditions(int num) {
        if (num % 15 == 0) {
            return "FizzBuzz";
        }
        if (num % 5 == 0) {
            return "Buzz";
        }
        if (num % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(num);
    }

    // Задание 2
    public boolean firstOrLast6(int[] nums) {
        if (nums[0] == 6){
            return true;
        }

        if (nums[nums.length - 1] == 6) {
            return true;
        }
          return false;

    }

    // Задание 3

    /**
     * 3.4. Метод принимает на вход 3 числа (int a, b, c). Нужно вернуть их сумму. Однако, если одно из значений равно 13,
     * то оно не учитывается в сумме. Так, например, если b равно 13, то считается сумма только a и c.
     */

    public int  luckySum(int a, int b, int c){
        int sum = 0;

        int[] input = new int[] {a,b,c};

        for (int i = 0; i < input.length; i++) {
            if (input[i] != 13) {
                sum += input[i];
            }
        }

        return sum;
    }



}
