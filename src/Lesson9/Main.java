package Lesson9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> testIntegerList = new MyArrayList<>();
        System.out.println("Is list empty? - " + testIntegerList.isEmpty());
        MyList<String> testString = new MyArrayList<>();
        testString.add("String1");
        testString.add("String2");
        testString.add("String3");
        System.out.println("Verifying size - " + testString.size());
        System.out.println("Verifying method add(index, value): " + testString.add(2, "String4"));
        System.out.println("Verifyng method get: " + testString.get(2));
        System.out.println("Verifying method contains e.g. String3: " + testString.contains("String3"));
        System.out.println("Verifying method indexof: " + testString.indexOf("String2"));
        String notUpdatedValue = testString.set(1, "UpdatedString");
        System.out.println("Verifying method set(index,value): " + "\n Not updated value- " + notUpdatedValue + "\n New value- " 
            + testString.get(1));
        testString.addAll(Arrays.asList("Test1", "Test2"));
        for (int i = 0; i < testString.size(); i++) {
        System.out.print(testString.get(i) + " ");
            }
        System.out.println();
        System.out.println("Verifying method addAll: " + testString.size());
        System.out.println("Veriffying method remove: " + testString.remove(4) + "; Updated size = " + testString.size());
        System.out.println("Verifying method remove(Object): " + testString.remove("Test2") + " Updated size: " + testString.size());
        
    }
}
