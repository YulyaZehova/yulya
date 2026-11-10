package Lesson10.main;

import Lesson10.exception.EmptyNameException;
import Lesson10.exception.InsufficientFundsException;
import Lesson10.exception.InvalidAgeException;

public class Main {

    public static void main(String[] args) {

        try {
            String result = registerUser("", 101);
        } catch (EmptyNameException e) {
            System.out.println(e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage() + " " + e.getInvalidAge());
        } finally {
            System.out.println("User name and Age are verified");
        }

        try {
            double balance = checkedBalance(0.00);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage() + e.getBalance());
        } finally {
            System.out.println("Balance is verified");
        }
    }

    public static String registerUser(String name, int age) throws EmptyNameException, InvalidAgeException {
        if (name == null || name.isEmpty()) {
            throw new EmptyNameException("Name cannot be empty");
        }
        if (age < 0 || age > 100) {
            throw new InvalidAgeException("Invalid age: ", age);
        }
        return "User " + name + " is registered";
    }

    public static double checkedBalance(double balance) throws InsufficientFundsException {
        if (balance <= 0) {
            throw new InsufficientFundsException("Insufficient funds! - ", balance);
        }
        return balance;
    }
}
