package Lesson12.Task4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Function<String, String> toUpper = StringHelper::upper;

        System.out.println("Function:");
        System.out.println(toUpper.apply("hello"));

        Predicate<String> shortCheck = StringHelper::isShort;

        System.out.println("\nPredicate:");
        System.out.println(shortCheck.test("cat"));
        System.out.println(shortCheck.test("dog"));

        Consumer<String> printer = System.out::println;

        System.out.println("\nConsumer:");
        printer.accept("The first string");
        printer.accept("The second string");
        printer.accept("The third string");

        List<String> words = new ArrayList<>(
                List.of("apple", "cat", "dog", "hause", "car"));

        words.sort(String::compareToIgnoreCase);

        System.out.println("\nSorted List: ");
        System.out.println(words);
    }
}
