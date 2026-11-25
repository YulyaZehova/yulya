package Lesson12;

import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Evens : " + evenNumbers);

        List<Integer> greaterFive = numbers.stream()
                .filter(n -> n > 5)
                .collect(Collectors.toList());

        System.out.println("Greter than 5: " + greaterFive);

        List<Integer> oddSeven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .filter(n -> n < 7)
                .collect(Collectors.toList());

        System.out.println("Odd than 7: " + oddSeven);

        numbers.stream()
                .filter(n -> n % 3 == 0)
                .forEach(System.out::println);

        long count = numbers.stream()
                .filter(n -> n > 5)
                .count();

        System.out.println("Number of numbers > 5 : " + count);
    }
}
