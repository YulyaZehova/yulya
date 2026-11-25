package Lesson12.Task14;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Ann", 15),
                new Person("Ivan", 25),
                new Person("Peter", 40),
                new Person("Mariya", 17),
                new Person("Olga", 30));

        List<String> names = people.stream()
                .map(Person::getName)
                .toList();

        System.out.println("names:");
        names.forEach(System.out::println);

        List<Person> adults = people.stream()
                .filter(person -> person.getAge() >= 18)
                .toList();

        System.out.println("adults:");
        adults.stream()
                .map(Person::getName)
                .forEach(System.out::println);

        double averageAge = people.stream()
                .mapToInt(Person::getAge)
                .average()
                .orElse(0);

        System.out.println("average age: " + averageAge);

        Person oldest = people.stream()
                .max(Comparator.comparingInt(Person::getAge))
                .orElse(null);

        if (oldest != null) {
            System.out.println("The oldest: " + oldest.getName());
        }

        System.out.println("By age:");
        people.stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .map(Person::getName)
                .forEach(System.out::println);
    }
}
