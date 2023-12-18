package seminar1.hw.calculator;

public class Calculator {

    public static void main(String[] args) {
//        System.out.printf("Результат вычислений: %s\n", calculation( 2, 2, '+') );
//        System.out.printf("Результат вычислений: %s\n", calculation( 2, 2, '-') );
//        System.out.printf("Результат вычислений: %s\n", calculation( 2, 2, '/') );
//        System.out.printf("Результат вычислений: %s\n", calculation( 2, 2, '*') );
//        System.out.printf("Результат вычислений: %s\n", calculation( 2, 2, '_') );
//        System.out.printf("Результат вычислений: %s\n", calculation( 2, 0, '/') );
//        System.out.printf("Результат вычислений: %s\n", calculation( 221321341, 2131243451, '*') );

        System.out.printf("Конечная цена: %s\n", calculateDiscount(5000.0, 10.0));
    }

//    public static int calculation(int firstOperand, int secondOperand, char operation){
//        int result = 0;
//
//        switch (operation) {
//            case '+':
//                result = firstOperand + secondOperand;
//                break;
//            case '-':
//                result = firstOperand - secondOperand;
//                break;
//            case '/':
//                if (secondOperand == 0) {
//                    throw new ArithmeticException();
//                } else {
//                    result = firstOperand / secondOperand;
//                    break;
//                }
//            case '*':
//                result = firstOperand * secondOperand;
//                break;
//
//            default:
//                throw new IllegalStateException("Unexpected value operator");
//        }
//            return result;
//    }

    public static double calculateDiscount(double price, double discount) {
        double lastPrice;
        if (price < 0 || discount < 0) {
            throw new ArithmeticException("Неправильный аргумент!");
        } else if (discount > 0 && price >= 0 && discount <= 100) {
            return lastPrice = price - price * (discount / 100.0);
        } else {
            return price;
        }
    }
}
 