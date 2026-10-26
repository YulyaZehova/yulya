package Lesson6.Animals;

public class Horse extends Animal {
    private int maxSpeed;

    
    public Horse(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Horse(String food, String location, int maxSpeed) {
        super(food, location);
        this.maxSpeed = maxSpeed;
    }

    @Override 
    public void makeNoise(){
        System.out.println("The horse neighs: 'Neigh-neigh-neigh!'");
    }

    @Override 
    public void eat(){
        System.out.println("The horse eats " + getFood());
    }

    @Override 
     public String toString(){
        return super.toString() + "  maxSpeed = " + maxSpeed + "]";
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

}
