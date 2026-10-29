package Lesson7;


public interface RobotPartFactory {
    Robot.Head addHead(int h);
    Robot.Body addBody(int b);
}
    class BodyFactoryImpl implements RobotPartFactory {
        @Override 
        public Robot.Body addBody(int b){
            Enum.BodyMaterial bodyMaterial = Enum.BodyMaterial.values()[b];
            Robot robot = new Robot();
            Robot.Body body = robot.new Body(bodyMaterial);
            return body;
        }
        @Override 
        public Robot.Head addHead(int h){
            return null;
        }
        
    }

    class HeadFactoryImpl implements RobotPartFactory {
        @Override 
        public Robot.Head addHead(int h){
            Enum.HeadName headName = Enum.HeadName.values()[h];
            Robot robot = new Robot();
            Robot.Head head = robot.new Head(headName);
            return head;
        }
        
        @Override 
        public Robot.Body addBody(int b){
            return null;
        }
    }
    

