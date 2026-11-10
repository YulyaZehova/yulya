package Lesson10.exception;

public class InvalidAgeException extends Exception {
    private int invalidAge;

    public InvalidAgeException(String message, int invalidAge) {
        super(message);
        this.invalidAge = invalidAge;
    }

    public int getInvalidAge() {
        return invalidAge;
    }
}
