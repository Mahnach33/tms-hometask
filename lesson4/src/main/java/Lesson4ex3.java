import java.util.Arrays;
public class Lesson4ex3 {
    public static void main(String[] args){
        //Создаем два массива
        int[] array1 = new int[] {1,2,3,4,5,6};
        int[] array2 = new int[] {7, 8, 9, 10, 11};

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        int sum1 = 0;
        int sum2 = 0;

        for (int num : array1) {
            sum1 += num;
        }
        for (int num : array2) {
            sum2 += num;
        }

        double average1 = (double) sum1 / array1.length;
        double average2 = (double) sum2 / array2.length;

        if (average1 > average2) {
            System.out.println("Arithmetic mean of array 1 more");
        } else if (average1 < average2) {
            System.out.println("Arithmetic mean of array 2 more");
        } else {
            System.out.println("Arithmetic averages of arrays are equal");
        }

    }


}