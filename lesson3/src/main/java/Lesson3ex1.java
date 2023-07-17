// Импортируем класс Scanner, чтобы пользователь мог взаимодействовать с консолью.
import java.util.Scanner;
public class Lesson3ex1 {
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
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                // Оператор break; здесь нужен, чтобы после первого блока case(12, 1, 2) не пошла программа дальше
                // на другие блоки, поэтому break; прерывает это
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            // defoult - оператор, который выводит в консоль слово Error в случае, если пользователь введет что-то
            // не правильно

            default:
                System.out.println("Error");

        }
    }

}
