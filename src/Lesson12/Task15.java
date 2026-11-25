package Lesson12;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task15 {
    public static void main(String[] args) {

        List<String> words = List.of("cat", "dog", "cat", "house", "dog", "cat", "hedgehog");

        Map<Integer, List<String>> byLength = words.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println("sort by length:");
        byLength.forEach((length, list) -> System.out.println(length + " -> " + list));

        Map<String, Long> countWords = words.stream()
                .collect(Collectors.groupingBy(
                        word -> word,
                        Collectors.counting()
                ));

        System.out.println("count words:");
        countWords.forEach((word, count) -> System.out.println(word + " -> " + count));

        Map<Boolean, List<String>> part = words.stream()
                .collect(Collectors.partitioningBy(
                        word -> word.length() <= 3
                ));

        System.out.println("length <= 3:");
        System.out.println(part.get(true));

        System.out.println("length > 3:");
        System.out.println(part.get(false));
    }
}
