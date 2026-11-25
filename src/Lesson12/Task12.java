package Lesson12;

import java.util.List;
import java.util.Optional;

public class Task12 {
    public static Optional<Integer> parse(String s) {
        try {
            return Optional.of(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }

    public static void main(String[] args) {

        List<String> words = List.of("table", "window", "door", "cupboard");

        words.stream()
                .filter(word -> word.startsWith("d"))
                .findFirst()
                .ifPresent(System.out::println);

        String result = words.stream()
                .filter(word -> word.startsWith("a"))
                .findFirst()
                .orElse("not founded");

        System.out.println(result);

        Optional<Integer> number1 = parse("123");
        Optional<Integer> number2 = parse("abc");

        System.out.println(number1);
        System.out.println(number2);

        System.out.println(parse("123").orElse(-1));
        System.out.println(parse("abc").orElse(-1));
    }
}
