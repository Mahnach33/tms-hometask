import java.util.Scanner;

public class Lesson4ex0 {
    public static void main(String[] args) {
        // Создаем массив, где каждому эллементу массива присваиваем значение
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to check");

        int num = scanner.nextInt();

        boolean right = true;
        // for-each тут переменная элем пробегает по каждому элементу массива arr и ищет заданное число пользователем
        // если в массиве есть заданнаое пользователем число, то right = true и цикл останавливается
        for (int elem : arr) {
            if (elem == num){
                right = true;
                break;
            }

            // если наша переменная right правда, то выводится сообщение о том, что число найдено
            if(right = true) {
                System.out.println("Found");

                // Выводится "не найдено" в случае если right является не верной переменной
            }else{
                System.out.println("Not found");
            }
        }

    }
}