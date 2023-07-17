// Класс директор наследует метод интерфейса Position и сохраняет в этом методе свою информацию, которая свойствена
// только классу Worker
class Worker implements Position{
    public void printPost(){
        System.out.println("Worker");

    }
}
