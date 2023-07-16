import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //Создаем объект где прописываем номер и изначальный баланс карточки и присваиваем эти данные переменный card
        //класса CreditCard
        CreditCard card1 = new CreditCard("121312B2132CR23 ", 500);
        CreditCard card2 = new CreditCard("2133213RD324B32 ", 600);
        CreditCard card3 = new CreditCard("234234234DER343 ", 700);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter what do you want 'deposit' or 'derive' the sum");
        String action = scanner.nextLine();

        //Если действие пользователя равно "deposit", то он вводит сумму, которая сохраняется в переменной
        //depositAmount1 после чего внутри метода addSum происходит следующее: текущий баланс += добавленная сумма денег
        //помле этого текущий баланс карточки1 становится больше
        if(action.equalsIgnoreCase("deposit")) {
            System.out.println("Enter deposit the sum for card 1: ");
            double depositAmount1 = scanner.nextDouble();
            card1.addSum(depositAmount1);
            // тоже самое только с снятием суммы
        } else if(action.equalsIgnoreCase("derive")){
            System.out.println("Enter derive the sum for card 1: ");
            double deriveAmount1 = scanner.nextDouble();
            card1.outSum(deriveAmount1);
        }else{
            System.out.println("Invalid data");
        }

        if(action.equalsIgnoreCase("deposit")) {
            System.out.println("Enter deposit the sum for card 2: ");
            double depositAmount2 = scanner.nextDouble();
            card2.addSum(depositAmount2);
        }else if(action.equalsIgnoreCase("derive")){
            System.out.println("Enter derive the sum for card 2: ");
            double deriveAmount1 = scanner.nextDouble();
            card2.outSum(deriveAmount1);
        }else{
            System.out.println("Invalid data");
        }

        if(action.equalsIgnoreCase("deposit")) {
            System.out.println("Enter deposit the sum for card 3: ");
            double depositAmount3 = scanner.nextDouble();
            card3.addSum(depositAmount3);
        }else if(action.equalsIgnoreCase("derive")){
            System.out.println("Enter derive the sum for card 3: ");
            double deriveAmount1 = scanner.nextDouble();
            card3.outSum(deriveAmount1);
        }else{
            System.out.println("Invalid data");
        }

        //Выводим информацию о всех карточках
        card1.cardInfo();
        card2.cardInfo();
        card3.cardInfo();



        }










    }

