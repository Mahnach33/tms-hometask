import java.util.Scanner;
public class Lesson3ex4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter temperature in your place.");
        int t = scanner.nextInt();

        // Здесь указываем, что если введенная пользователем температура больше -5 то тепло
        if (t > -5) {
            System.out.println("Warm");

            // Здесь если меньше -5 или больше -20, то нормально
        } else if (t < -5 || t > -20) {
            System.out.println("Normally");

            // Здесь указываем что если температура будет меньше или равна -20, то холодно
        } else if (t <= -20) {
            System.out.println("Cold");
        }



    }
}