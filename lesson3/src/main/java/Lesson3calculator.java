import java.util.Scanner;
public class Lesson3calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean circle = true;
        // Пишем программу через цикл while т.е., пока circle = true, то цикл работает
        while (circle) {
            System.out.println("Enter the first number");
            double num1 = scanner.nextDouble();

            System.out.println("Enter (+ or - or * or /)");
            char operator = scanner.next().charAt(0);

            System.out.println("Enter the second number");
            double num2 = scanner.nextDouble();

            double result;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    if (num2 == 0) {
                        System.out.println("Cannot be divided by 0");
                        return;
                    }
                    break;
                default:
                    System.out.println("Invalid data");
                    return;

            }
            System.out.println("Result: " + result);

        }
    }
}