package Lesson12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("apple", "cat", "dog", "hause", "car"));
        Comparator<String> byLength = (s1, s2) -> Integer.compare(s1.length(), s2.length());
        words.sort(byLength);
        System.out.println(words);
        Comparator<String> byName = (s1, s2) -> s1.compareTo(s2);
        words.sort(byName);
        System.out.println(words);
    }

}
