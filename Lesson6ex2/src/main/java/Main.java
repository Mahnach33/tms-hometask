public class Main {
    public static void main(String[] args){

        //Создаем объект для каждой должности
        Director director = new Director();
        Worker worker = new Worker();
        Accountant accountant = new Accountant();


        //Выводим информацию по каждому объекту
        director.printPost();
        worker.printPost();
        accountant.printPost();
    }
}
