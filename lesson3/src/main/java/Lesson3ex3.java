import java.util.Scanner;
public class Lesson3ex3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number to display even or odd number.");

        // Пользователь вводит число, чтобы определить четное оно или нечетное, и это число сохраняется в переменную
        // number типа данных int
        int number = scanner.nextInt();

        // Далее мы выводим остаток от числа, которое ввел пользователь, и результат сохраняем в переменную result
        int result = number % 2;

        // Здесь указываем, что если наш результат (сохраненный в переменную result) будетравен 0, то число четное
        // если же нет то с помощью else выводим в консоль сообщение о том, что число ен четное.
        if (result == 0){
            System.out.println("This is even number.");
        }  else {
            System.out.println("This is odd number.");
        }

    }
}
