package Lesson6.Animals;

public class Animal {
    private String food;
    private String location;

    

    public Animal() {
        this.food = null;
        this.location = null;
    }


    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise(){
        System.out.println(this.getClass().getSimpleName() + " makes a sound" );
    }

    public void eat(){
        System.out.println(this.getClass().getSimpleName() + " eats " + food);
    }
    
    public final void sleep(){
        System.out.println(this.getClass().getSimpleName() + " sleeps");
    }


    public String getFood() {
        return food;
    }


    public void setFood(String food) {
        this.food = food;
    }


    public String getLocation() {
        return location;
    }


    public void setLocation(String location) {
        this.location = location;
    }
    
    @Override 
    public String toString(){
        return this.getClass().getSimpleName() + "  [food= " + food + 
                " location= " + location;
    }
}
