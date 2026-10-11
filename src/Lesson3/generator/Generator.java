package Lesson3.generator;
import java.util.Random;

public class Generator {
    private static final Random RANDOM = new Random();
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    
    public static String RandomName() {
        int length = RANDOM.nextInt(8) + 5; 
        StringBuilder name = new StringBuilder();
        
       
        char firstChar = (char) (RANDOM.nextInt(26) + 'A');
        name.append(firstChar);
        
        
        for (int i = 1; i < length; i++) {
            name.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
        }
        
        return name.toString();
    }

       public static int RandomAge() {
        return RANDOM.nextInt(28) + 1;
    }
}

