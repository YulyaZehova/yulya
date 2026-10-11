package Lesson3.main;

import Lesson3.cat.Cat;
import Lesson3.generator.Generator;
import java.util.Random;

public class Main {
    
    public static void main(String[] args) {
    
        System.out.println("Generating Default Cat's Names and Cat's Ages:");
        While();
        System.out.println("Generating Random Cat's Names and Cat's Ages:");
        For();
        System.out.println("Generating Pre-defined Cat's Name and Cat's Ages");
        DoWhile();
        System.out.println("Generating 5 Cats using for each cicle");
        ForEach ();
    
    }
    

    private static void While() {
    Cat[] cats = {Cat.DefaultCat1(), Cat.DefaultCat2(), Cat.DefaultCat3(), Cat.DefaultCat4(),
            Cat.DefaultCat5(), Cat.DefaultCat6(), Cat.DefaultCat7(), Cat.DefaultCat8(), 
            Cat.DefaultCat9(), Cat.DefaultCat10()};
    int i = 0;

    while (i < cats.length) {
        Cat current = cats[i];
        System.out.println("Name = " + current.getName() + " Age = " + current.getAge());
        i ++;
        }  
        
    }   
    private static void For() {
    //String[] names = {"Name1", "Name2", "Name3", "Name4", "Name5", "Name6", "Name7", 
          //  "Name8", "Name9", "Name10"};
    Random random = new Random();
    for(int x = 0; x < 10; x++){
            Cat cat = new Cat();
           // cat.setAge(random.nextInt(10) + 4);
           // cat.setName(names[random.nextInt(names.length)]);
            cat.setName(Generator.RandomName());
            cat.setAge(Generator.RandomAge());
            System.out.println("Name: " + cat.getName() + " Age: " + cat.getAge());
        }
    }
    private static void DoWhile() { 
        String[] names = {"Barsik", "Kesha", "Majra", "Ajsha", "Murzik", "Simba", "Lilu", 
                "Kuzja", "Maks", "Bagira"};
        int[] ages = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Cat[] cats = new Cat[10];
        int y = 0;
        do {
            cats[y] = new Cat(names[y],ages[y]);
            System.out.println(cats[y]);
            y++;
        } while (y < 10);
    }
    private static void ForEach(){
        Cat[] fiveCats = {Cat.DefaultCat1(), Cat.DefaultCat2(), Cat.DefaultCat3(), Cat.DefaultCat4(), Cat.DefaultCat5()};
        for (Cat cats : fiveCats) {
            System.out.println("Name = " + cats.getName() + " Age = " + cats.getAge());
        }
    }
}
