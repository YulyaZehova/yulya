package Lesson12;

import java.util.List;

public class Task8 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 40, 50);

        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        double average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        int max = numbers.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElse(0);

        int min = numbers.stream()
                .mapToInt(Integer::intValue)
                .min()
                .orElse(0);

        long count = numbers.stream()
                .count();

        System.out.println("Sum: " + sum);
        System.out.println("Avarage: " + average);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Count: " + count);
    }
}
