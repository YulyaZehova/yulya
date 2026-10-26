package Lesson6.Animals;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[6];
        animals[0] = new Dog("meet", "outdoors", "shepherd");
        animals[1] = new Dog("dry food", "home", "beagle");
        animals[2] = new Cat("fish", "flat", true);
        animals[3] = new Cat("milk", "village", false);
        animals[4] = new Horse("apple", "farms", 50);
        animals[5] = new Horse("corn", "stables", 60);

        Veterinarian veterinarian = new Veterinarian();
        int dogNumber = 0;
        int catNumber = 0;
        int horseNumber = 0;
        

        for(int i = 0; i < animals.length; i++){
            Animal animal = animals[i];
            
            System.out.println("==== Animal #" + (i+1) + " ===" );
            
            animal.makeNoise();
            animal.eat();
            animal.sleep();
            veterinarian.treatAnimal(animal);
            veterinarian.examine(animal);
            System.out.println(animal.toString());
            System.out.println();

            if(animal instanceof Dog){
                dogNumber++;
            }else if(animal instanceof Cat){
                catNumber++;
            }else if(animal instanceof Horse){
                horseNumber++;
            }
        }

        System.out.println("====== Totals ======");
        System.out.println("dogs = " + dogNumber);
        System.out.println("cats = " + catNumber);
        System.out.println("horses = " + horseNumber);
    }
    
}
