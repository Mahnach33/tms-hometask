public class Lesson3ex6 {
    public static void main(String[] args){
        // Цикл начинается с 5; работать будет до тех пор пока i меньше либо равно 5; i с каждым циклом уменьшается на 1
        for (int i = 5; i <= 5; i--){
            // Как только i станет меньши либо равно 0, то цикл прекращается
            if (i <= 0){
                break;
            }
            System.out.println(i);
        }
    }
}