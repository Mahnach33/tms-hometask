// Класс директор наследует метод интерфейса Position и сохраняет в этом методе свою информацию, которая свойствена
// только классу Director

class Director implements Position {
    public void printPost() {
        System.out.println("Director");
    }

}
