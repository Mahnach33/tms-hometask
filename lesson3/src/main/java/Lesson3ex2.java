// Импортируем класс Scanner, чтобы пользователь мог взаимодействовать с консолью.
import java.util.Scanner;
public class Lesson3ex2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Здесь мы пишим условие для пользователя, которое будет сразуже выведено в консоль при запуске приложения.
        System.out.println("Enter the month to display the time of the year.");
        System.out.println("if you want to display Winter, enter 12 or 1 or 2.");
        System.out.println("if you want to display Spring, enter 3 or 4 or 5.");
        System.out.println("if you want to display Summer, enter 6 or 7 or 8.");
        System.out.println("if you want to display Autumn, enter 9 or 10 or 11.");

        // То что введет пользователь сохраниться в переменную math типа данных int
        int month = scanner.nextInt();

        // Тут прописываем условие: когда пользователь введет конкретные цифры, то ему выведет определенную пору года.
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Winter");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("Spring");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Summer");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("Autumn");
        }
        // Здесь прописываем что будет, если пользователь введет не то, что нужно.
        else {
            System.out.println("Error");
        }

    }
}