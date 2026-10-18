package Lesson5;


public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("123-123-123", "Sumsung ", 111);
        Phone phone2 = new Phone("223-223-223", "iPhone ");
        Phone phone3 = new Phone();
        phone3.setNumber("555-555-555");

        phone1.receiveCall("Yulya");
        System.out.println("RecieveCall with one parameter for Object1 " + phone1.getNumber());
        phone2.receiveCall("Nika");
        System.out.println("RecieveCall with one parameter for Object2 " + phone2.getNumber());
        phone3.receiveCall("Makar");
        System.out.println("RecieveCall with one parameter for Object3 " + phone3.getNumber());

        System.out.println("RecieveCall with two parameters for Object1 ");
        phone1.receiveCall("Yulya", "44-44-44");

        System.out.println("sendMessage method");
        phone1.sendMessage("777-77-77", "888-88-88");
        phone2.sendMessage("999-99-99");
    }

   

    
}
