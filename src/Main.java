import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double val1;
        double val2;
        char operand;
        char calculatorOperator = 'c';
        double result = 0;

        do {
            if (calculatorOperator == 'c') {
                System.out.println("Hello");
                System.out.print("Введите первый операнд:  ");
                val1 = scanner.nextDouble();
                System.out.print("Введите оператор:  ");
                operand = scanner.next().charAt(0);
            } else {
                val1 = result;
                operand = calculatorOperator;
            }
            System.out.print("Введите второй операнд:  ");
            val2 = scanner.nextDouble();

            result = calculate(val1, val2, operand);
            System.out.println(val1 + " " + val2 + " = " + result);
            calculatorOperator = scanner.next().charAt(0);
        } while (calculatorOperator != 's');


    }

    public static double calculate(double val1, double val2, char operand) {
        return switch (operand) {
            case '+' -> val1 + val2;
            case '-' -> val1 - val2;
            case '*' -> val1 * val2;
            case '/' -> val1 / val2;
            default -> {
                System.out.println("Ошибка ввода");
                yield 0;
            }
        };
    }
}