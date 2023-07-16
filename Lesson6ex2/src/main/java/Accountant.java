// Класс директор наследует метод интерфейса Position и сохраняет в этом методе свою информацию, которая свойствена
// только классу Accountant
class Accountant implements Position {
    public void printPost(){
        System.out.println("Accountant");

    }
}
