public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+375-44-771-59-66, ", "Samsung A52, ", 170);
        Phone phone2 = new Phone("+375-44-333-77-00, ", "Honor ultra, ", 200);
        Phone phone3 = new Phone("+375-29-337-18-96, ", "Nokia, ", 500);

        phone1.phoneInfo();
        phone2.phoneInfo();
        phone3.phoneInfo();

        System.out.println("Number of phone1: " + phone1.getNumber());
        phone1.receiveCall("Ivan", "+123-456-789"); // Вызов перегруженного метода receiveCall

        System.out.println("Number of phone2: " + phone2.getNumber());
        phone2.receiveCall("Kirill", "+987-654-321"); // Вызов перегруженного метода receiveCall

        System.out.println("Number of phone3: " + phone3.getNumber());
        phone3.receiveCall("Jenya", "+111-222-333"); // Вызов перегруженного метода receiveCall

        phone1.sendMessage("+375-44-771-59-66");// Вызов метода sendMessage
        phone2.sendMessage("+375-44-333-77-00");
        phone3.sendMessage("+375-29-337-18-96");
    }

    }


