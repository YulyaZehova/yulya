package Lesson7;

import Lesson7.Enum;
import Lesson7.Main;

public class Robot {
    private String name;
    private Robot.Head head;
    private Robot.Body body; 

    public Robot() {}

    public Robot(String name, Robot.Head head, Robot.Body body) {
            this.name = name;
            this.head = head;
            this.body = body;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Robot.Head getHead() {
        return head;
    }

    public void setHead(Robot.Head head) {
        this.head = head;
    }

    public Robot.Body getBody() {
        return body;
    }

    public void setBody(Robot.Body body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Robot [name=" + name + head + body + "]";
    }
    
    public class Head{
        private final Enum.HeadName headName;

        public Head(Enum.HeadName headName) {
            this.headName = headName;
        }
        
        public String getTitle() {
            return headName.getTitle();
        }

        @Override
        public String toString() {
            return " Head [headName=" + headName.toString() + "]";
        }

    }

    public class Body{
        private final Enum.BodyMaterial bodyMaterial;
        public Body(Enum.BodyMaterial bodyMaterial) {
            this.bodyMaterial = bodyMaterial;
        }
        
        public String getTitle() {
            return bodyMaterial.getTitle();
        }

        @Override
        public String toString() {
            return " Body [Body Material=" + bodyMaterial.toString() + "]";
        }

    }
}
