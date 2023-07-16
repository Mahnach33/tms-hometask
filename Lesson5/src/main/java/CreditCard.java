import java.util.Scanner;
public class CreditCard {
// Прописываем поля для CreditCard
    private String numBill;
    private int balance;

    // Затем делаем конструктор для идентификации карточки
    public CreditCard(String numBill, int balance){
        this.numBill = numBill;
        this.balance = balance;
    }

    //Метод для пополнения баланса карточки
    public void addSum (double amount){
        balance += amount;
    }

    //Метод для снятия средств с карточки, также прописываем условие на случай если карточка пуста
    public void outSum (double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Not enought money");
        }
    }

        //Метод для просмотра баланса карточки
        public void cardInfo() {
            System.out.println("The credit card number: " + numBill);
            System.out.println("The current balance: " + balance);

        }




}

