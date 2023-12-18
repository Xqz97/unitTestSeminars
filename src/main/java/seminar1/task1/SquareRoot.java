package seminar1.task1;

public class SquareRoot {

    public static void main(String[] args) {
        System.out.printf("Результат нахождения корня: %s", SquareRoot.calculationOfSquareRoot(-121));
    }


    public static double calculationOfSquareRoot(double num){
        if (num < 0){
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }
        return Math.sqrt(num);
    }
}
