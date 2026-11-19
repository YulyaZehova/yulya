
package Lesson6.Animals;

public class Veterinarian {
    public void treatAnimal(Animal animal){
        System.out.println("At the appointment: food = " + animal.getFood() 
            + " location = " + animal.getLocation());
    }

    public void examine(Animal animal){
        if ( animal instanceof Dog){
            Dog dog = (Dog)animal;
            System.out.println("Additional information: breed = " + dog.getBreed());
        } else if (animal instanceof Cat){
            Cat cat = (Cat)animal;
            System.out.println("Additional information: Home/Homeless = " 
                + (cat.isIndoor() ? "Home" : "Homeless"));
        } else if (animal instanceof Horse){
            Horse horse = (Horse)animal;
            System.out.println("Additional information: maxSpeed = " + horse.getMaxSpeed());
        }else{
            System.out.println("Unknown animal");
        }
    }
}
