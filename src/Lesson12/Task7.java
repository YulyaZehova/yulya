package Lesson12;

import java.util.Comparator;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        List<String> names = List.of("Ann", "Boris", "Ann", "Vera", "Boris", "Gleb");

        List<String> withoutDuplicates = names.stream()
                .distinct()
                .toList();

        System.out.println(withoutDuplicates);

        List<String> alfabeticSorts = names.stream()
                .sorted()
                .toList();

        System.out.println(alfabeticSorts);

        List<String> firstTwo = names.stream()
                .distinct()
                .sorted()
                .limit(2)
                .toList();

        System.out.println(firstTwo);

        List<String> skipped = names.stream()
                .skip(2)
                .toList();

        System.out.println(skipped);

        List<String> sortedByLength = names.stream()
                .sorted(Comparator.comparingInt(String::length))
                .toList();

        System.out.println(sortedByLength);

    }
}
