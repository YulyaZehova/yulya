package Lesson12;

import java.util.List;

public class Task10 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 4, 6, 8, 10);

        boolean allEven = numbers.stream()
                .allMatch(n -> n % 2 == 0);

        boolean greaterThan8 = numbers.stream()
                .anyMatch(n -> n > 8);

        boolean notNegative = numbers.stream()
                .noneMatch(n -> n < 0);

        System.out.println("allEven: " + allEven);
        System.out.println("greater than 8: " + greaterThan8);
        System.out.println("not Negative: " + notNegative);

        System.out.println();

        List<Integer> numbers2 = List.of(1, 3, 5, 7);

        boolean allEven2 = numbers2.stream()
                .allMatch(n -> n % 2 == 0);

        boolean greaterThan82 = numbers2.stream()
                .anyMatch(n -> n > 8);

        boolean notNegative2 = numbers2.stream()
                .noneMatch(n -> n < 0);

        System.out.println("allEven: " + allEven2);
        System.out.println("greater than 8: " + greaterThan82);
        System.out.println("not Negative: " + notNegative2);
    }
}
