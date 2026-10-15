package Lesson4;

import java.util.Random;

public class Main {
    
    public static void main(String[] args) {
        Random random = new Random();
        int columns = 10, rows = 10;
        int element = 1;
        Object[][] massives = new Object [columns][rows];{
            for(int i = 0; i < columns; i++){
                for(int j = 0; j < rows; j++){
                    if(element % 3 == 0){
                        massives[i][j] = Massive.randomDouble(random);
                    } else {
                     if(random.nextBoolean()){
                            massives [i][j] = Massive.randomDouble(random);
                        } else {
                            massives [i][j] = Massive.randomString(random);
                        }
                    }
                    element++;
                }             
            }
            
            // task2
            boolean diagonal = true;
            for (int i = 0; i < columns; i++) {
                Object diagObject = massives[i][i];
                Object sideObject = massives[i][(columns - 1) - i];

                if(diagObject.equals(sideObject)){
                    diagonal = false;
                    break;
                }
            }

            if (diagonal){
                System.out.println("The diagonals coincide");
            } else {
                System.out.println("The diagonals differ");
            }
            
            Object[] diagonalObjects = new Object[20];
            for (int i = 0; i < columns; i++) {
                diagonalObjects[i] = massives[i][i];
                diagonalObjects[i + 10] = massives[i][9-i];
            }
            System.out.println(java.util.Arrays.toString(diagonalObjects));
        
            //task3
            StringBuilder sb = new StringBuilder();
            int count = 0;
            for (Object objectElement : diagonalObjects) {
                if (objectElement instanceof Double) {
                    count++;
                }
}

            long[] roundNumbers = new long[count];
            int index = 0;

            for (Object objectElement : diagonalObjects) {
                if (objectElement instanceof String){
                    String string = (String) objectElement;
                    // from 2 elemnet to 4
                    String subString = string.length() >= 4 ? string.substring(1, 4) : string;

                    if (sb.length() > 0){
                        sb.append(",");
                    }
                    sb.append(subString);

                } else if (objectElement instanceof Double) {
                    double num = (Double) objectElement;
                    double fractional = num - Math.floor(num);
                    long round;
                    
                    if (fractional >= 0.7) {
                        round = (long) Math.ceil(num);
                    }else {
                        round = (long) Math.floor(num);
                    }
                    roundNumbers[index++] = round;

                }             
            }
            System.out.println("Result of strings");
            System.out.println(sb.toString());

            System.out.println("Result of numbers");
            for (int i = 0; i < roundNumbers.length; i++) {
                System.out.print(roundNumbers[i]);
                if(i < roundNumbers.length - 1){
                    System.out.print("_");
                }
            }
            System.out.println();
            System.out.println("Primary massive 10*10");
            Massive.printMassive(massives);     
        }
    }
}
    

