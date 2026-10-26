package Lesson6.Animals;

public class Cat extends Animal {
    private boolean isIndoor;

    public Cat(boolean isIndoor) {
        this.isIndoor = isIndoor;
    }

    public Cat(String food, String location, boolean isIndoor) {
        super(food, location);
        this.isIndoor = isIndoor;
    }

    @Override 
    public void makeNoise(){
        System.out.println("The cat meows: 'Meow!'");
    }

    @Override 
    public void eat(){
        System.out.println("The cat eats " + getFood());
    }

    @Override 
     public String toString(){
        return super.toString() + "  isIndoor = " + isIndoor + "]";
    }

     public boolean isIndoor() {
        return isIndoor;
    }

    public void setIndoor(boolean isIndoor) {
        this.isIndoor = isIndoor;
    }
}
