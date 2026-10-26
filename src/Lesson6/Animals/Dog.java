package Lesson6.Animals;

public class Dog extends Animal {
    private String breed;


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Dog(String food, String location, String breed) {
        super(food, location);
         this.breed = breed;
    }

    @Override 
    public void  makeNoise(){
        System.out.println("The dog barks: Woof-woof!");
    }

    @Override 
    public void eat(){
        System.out.println("The dog eats " + getFood());
    }

    @Override 
    public String toString(){
        return super.toString() + "  breed = " + breed + "]";
    }
}

