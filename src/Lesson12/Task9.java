package Lesson12;

import java.util.List;

public class Task9 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        int sum = numbers.stream()
                .reduce(0, Integer::sum);

        int product = numbers.stream()
                .reduce(1, (a, b) -> a * b);

        String result = numbers.stream()
                .map(String::valueOf)
                .reduce((a, b) -> a + "-" + b)
                .orElse("");

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("String: " + result);
    }
}
