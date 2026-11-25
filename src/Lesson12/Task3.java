package Lesson12;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        Function<Integer, Integer> square = i -> i * i;
        System.out.println("Square");
        for (Integer num : numbers) {
            System.out.println(square.apply(num) + " ");
        }

        Predicate<Integer> isEven = i -> i % 2 == 0;

        System.out.println("Is even? ");
        System.out.println(isEven.test(1));
        System.out.println(isEven.test(2));
        System.out.println(isEven.test(3));

        Consumer<String> print = s -> System.out.println(s);

        System.out.println("\nConsumer:");
        print.accept("Hello");
        print.accept("Java");
        print.accept("Lambda");

        Supplier<String> supplier = () -> "OK";

        System.out.println("\nSupplier:");
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
    }

}
