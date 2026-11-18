package Lesson7;


public class Main {
    public static void main(String[] args) {
        RobotPartFactory<Robot.Head> headFactory = new HeadFactoryImpl();
        RobotPartFactory<Robot.Body> bodFactory = new BodyFactoryImpl();

        System.out.println("Robots:");

        
        for(int h = 0; h < 3; h++){
            for(int b = 0; b < 3; b++){
                Robot.Head head = headFactory.addHead(h);
                Robot.Body body = bodFactory.addBody(b);
                
                String nameString = "Robot = ";
                Robot robot = new Robot(nameString, head, body);
                System.out.println(robot);
                
            }
        }
        
    }
}
