import java.util.Scanner;

// Добавляем класс Arrays для того, чтобы можно было читать массив
import java.util.Arrays;

public class Lesson4ex2 {
    public static void main(String[] args) {
        System.out.println("Put the size of array");
        Scanner scanner = new Scanner(System.in);
        int sizeArr = scanner.nextInt();

        int[] arr = new int[sizeArr];

        for(int i = 0; i < sizeArr; i++) {

            //Добавляем метод Math.random и даем массиво рандомные элементы от 1 до 99
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println("Array: " + Arrays.toString(arr));


        int max = arr[0];
        int min = arr[0];

        // Переменная sum нужна для выведения среднего значения
        int sum = arr[0];

        for (int i = 0; i < sizeArr; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            sum += arr[i];
        }

        int average = sum / sizeArr;

        System.out.println("Max valye: " + max);
        System.out.println("Min value: " + min);
        System.out.println("Avarage value: " + average);


    }
}