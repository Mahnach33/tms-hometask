import java.util.Scanner;
public class Lesson3ex7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int value = 0;

        // Прописываем условие, на случай если пользователь введет 0
        if(number <= 0){
            System.out.println("Invalid value.");
            // С помощью return; обновляем программу (на случай если будет 0)
            return;
        }
        for (int i = 1; i <= number; i++){

            // Добавляем переменную value, в которой сохранен сложение всех чисел к число, которое ввел пользователь
            value = value + i;
        }
        System.out.println(value);
    }
}
