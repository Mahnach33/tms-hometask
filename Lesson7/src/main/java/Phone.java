public class Phone {
    private String number;
    private String model;
    private int weight;

    public Phone (String number, String model, int weight){
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model){
        this.number = number;
        this.model = model;
    }

    public Phone(){
    }

    public String getNumber(){
        return number;
    }
    public void setNumber(String number){
        this.number = number;
    }

    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }

    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }

    public void phoneInfo(){
        System.out.println(number + model + weight);
    }

    public void receiveCall(String name){
        System.out.println("Name: " + name);
    }

    public void receiveCall(String name, String callerNumber) {
        System.out.println("Name: " + name + ", Caller Number: " + callerNumber);
    }

    public void sendMessage(String... phoneNumbers) {
        System.out.print("Sending message to: ");
        for (String number : phoneNumbers) {
            System.out.print(number + " ");
        }
    }

}
