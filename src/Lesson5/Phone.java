package Lesson5;

public class Phone {
    private String number;
    private String model;
    private int weight;
    
    public Phone(String number, String model, int weight){
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model){
        this.number = number;
        this.model = model;
    }

    public Phone(){
        System.out.println("Parameterless Constructor");
    }

    public void receiveCall(String name){
        System.out.println("Calling {" + name + "}");
    }

    public void receiveCall(String name, String numberCall){
        System.out.println("Calling {" + name + "}" + " Number = " + numberCall);
    }

    public void sendMessage(String... numbers){
        for (String numbeString : numbers) {
            System.out.println(numbeString);
        }
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    
}
