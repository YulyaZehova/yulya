package Lesson12;

import java.util.List;

public class Task6 {
    public static void main(String[] args) {
        List<String> words = List.of("cat", "dog", "house", "car");

        List<Integer> lengths = words.stream()
                .map(String::length)
                .toList();

        System.out.println(lengths);

        List<String> uppers = words.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println(uppers);

        List<String> addedToWords = words.stream()
                .map(word -> word + "!")
                .toList();

        System.out.println(addedToWords);

        words.stream()
                .forEach(word -> System.out.println(word + " -> " + word.length()));
    }
}
