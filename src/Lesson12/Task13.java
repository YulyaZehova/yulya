package Lesson12;

import java.util.List;
import java.util.stream.IntStream;

public class Task13 {
    public static void main(String[] args) {

        IntStream.rangeClosed(1, 10)
                .forEach(System.out::println);

        IntStream.rangeClosed(1, 20)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        int sum1 = IntStream.rangeClosed(1, 100)
                .sum();

        System.out.println("Sum = " + sum1);

        int sumSquares = IntStream.rangeClosed(1, 10)
                .map(n -> n * n)
                .sum();

        System.out.println("Sum squares = " + sumSquares);

        List<Integer> numbers = IntStream.rangeClosed(1, 5)
                .boxed()
                .toList();

        System.out.println(numbers);
    }
}
