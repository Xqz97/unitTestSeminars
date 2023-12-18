package seminar1.task2;

public class Sum {

    public static void main(String[] args) {
        System.out.println(sumOfTwoNum(1, Integer.MAX_VALUE));
    }

    public static int sumOfTwoNum(int num1, int num2){
        assert Integer.MAX_VALUE - Math.abs(num1) >= Math.abs(num2) : "Вышли за пределы целых чисел";
        return num1 + num2;
    }
}
