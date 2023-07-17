
import java.util.Scanner;
import java.util.Arrays;
public class Lesson4ex1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5, 7, 8, 9};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Real array" + Arrays.toString(arr));
        System.out.println("Put rhe number to delete");

        int number = scanner.nextInt();

        // Переменная для отслеживания количества вхождений числа
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                count = count + 1;

            }
        }
        if (count == 0) {
            System.out.println(number + " incorrect number");
        } else {
            int[] result = new int[arr.length - count];
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != number) {
                    result[index] = arr[i];
                    index++;
                }

            }
            System.out.println("Результирующий массив: " + Arrays.toString(result));
        }

    }
}