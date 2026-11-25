package Lesson12;

public class Task1 {
    public static void main(String[] args) {
        Runnable task1 = () -> System.out.println("Hello from lambdas");
        task1.run();
        Runnable task2 = () -> System.out.println("The second lambda is working");
        task1.run();
        task2.run();
    }

}
