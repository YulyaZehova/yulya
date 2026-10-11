package Lesson2;

import java.util.Scanner;

public class Rainbow {
    
    private static final int RED = 1;
    private static final int ORANGE = 2;
    private static final int YELLOW = 3;
    private static final int GREEN = 4;
    private static final int LIGHTBLUE = 5;
    private static final int BLUE = 6;
    private static final int PURPLE = 7;

    
    // public void start(int[] value)  - if enter array in Main class
    public void start() {          
        System.out.println("Enter the desired color, using number (1-7) or combination of numbers (12,23,34,45,56,67)");
        System.out.println("Use the following description:");
        System.out.println("RED = 1, ORANGE = 2, YELLOW = 3, GREEN = 4, LIGHTBLUE = 5, BLUE = 6, PURPLE = 7 ");

        // Enter value from keyboard

        Scanner scanner = new Scanner(System.in);
        int valueScanner = scanner.nextInt();
      
        // for (int valueScanner : value) - if enter array in Main class
        printColor(valueScanner); 
     
    }  
        
    public static void printColor(int valueScanner) { 
        if (valueScanner > 8) {
            printMixedColor(valueScanner);
        } else {
            printPrimaryColor(valueScanner);
        }
    }

      
    public static void printPrimaryColor(int valueScanner) {  
        switch (valueScanner) {
        case 1 :   
            System.out.println("You entered " + RED + " = " + "red");
            break;
        case 2 :   
             System.out.println("You entered " + ORANGE + " = " + "orange");
            break;
        case 3 :   
            System.out.println("You entered " + YELLOW + " = " + "yellow");
            break;
        case 4 :    
            System.out.println("You entered " + GREEN + " = " + "green");   
            break;
        case 5:    
            System.out.println("You entered " + LIGHTBLUE + " = " + "lightblue");
            break;
        case 6 :    
            System.out.println("You entered " + BLUE + " = " + "blue");
            break;
        case 7 :    
            System.out.println("You entered " + PURPLE + " = " + "purple");
            break;  
        }
    }        
       
       // halftone verifying
    public static void printMixedColor(int valueScanner) {
        switch (valueScanner) {
        case 12 : 
        case 21 : 
            System.out.println("You entered " + RED + "+" + ORANGE + "= " + "red-orange");
            break;
        case 23 : 
        case 32 : 
            System.out.println("You entered " + ORANGE + "+" + YELLOW + "= " + "orange-yellow");
            break;
        case 34 :
        case 43 :     
            System.out.println("You entered " + YELLOW + "+" + GREEN + "= " + "yellow-green");
            break;
        case 45 : 
        case 54 :    
            System.out.println("You entered " + GREEN + "+" + LIGHTBLUE + "= " + "green-lightblue");   
            break;
        case 56:  
        case 65:  
            System.out.println("You entered " + LIGHTBLUE + "+" + BLUE + "= " + "lightblue-blue");
            break;
        case 67 :  
        case 76 :    
            System.out.println("You entered " + BLUE + "+" + PURPLE + "= " + "blue-purple");
            break;
        case 71 : 
        case 17 :   
            System.out.println("You entered " + PURPLE + "+" + RED + "= " + "purple-red");
             break;  
        default:
            System.out.println("Entered Number " + valueScanner + " does not exist");
            break;
        }
    }

}


