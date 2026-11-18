package Lesson7;

public class Enum {
     public enum HeadName {
        AMD_RYZEN ("AMD Ryzen"),
        INTEL_NUC ("Intel NUC"),
        MEDIATEK ("MediaTek");
     
        private final String title;
        HeadName(String title){
            this.title = title;
        }

        public String getTitle(){
            return title;
        }

        @Override
        public String toString() {
            return title;
        }        
    }

    public enum BodyMaterial {
        CARBON ("Carbon"),
        FIBERGLASS ("Fiberglass"),
        PLASTIC ("Household Plastic");
     
        private final String title;
        BodyMaterial(String title){
            this.title = title;
        }

        public String getTitle(){
            return title;
        }

        @Override
        public String toString() {
            return title;
        }        
    }
}
