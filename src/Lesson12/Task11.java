package Lesson12;

import java.util.List;
import java.util.stream.Collectors;

public class Task11 {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "orang", "kiwi");

        String result1 = fruits.stream()
                .collect(Collectors.joining(", "));
        System.out.println(result1);

        String result2 = fruits.stream()
                .collect(Collectors.joining(" | ", "[", "]"));
        System.out.println(result2);

        String result3 = fruits.stream()
                .filter(fruit -> fruit.length() > 5)
                .collect(Collectors.joining(", "));
        System.out.println(result3);

        String result4 = fruits.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(" "));
        System.out.println(result4);
    }
}
