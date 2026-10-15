package Lesson4;

import java.util.Locale;
import java.util.Random;

public class Massive {
     
    Random random = new Random();

    public static String randomString(Random random) {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder(7);
        
        for (int i = 0; i < 7; i++) {
            int index = random.nextInt(letters.length());
            sb.append(letters.charAt(index));
        }
        
        return sb.toString();
    }

    public static Double randomDouble(Random random) {
        int intPart = random.nextInt(9) + 1;
        double fractPart = random.nextDouble();
        double number = intPart + fractPart;
        String formatted = String.format(Locale.US, "%.5f", number);   
        return Double.parseDouble(formatted);
    }

    public static void printMassive(Object[][] massivObjects){
        for (int i = 0; i < massivObjects.length; i++){
            for (int j = 0; j < massivObjects.length; j++){
                Object object = massivObjects[i][j];

                if (object == null) {
                System.out.printf("%-10s", "null");
                } else {
                 System.out.printf("%-10s", object);
                }
            }
            System.out.println();
        }
    }
}