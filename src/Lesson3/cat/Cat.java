package Lesson3.cat;

public class Cat {
    private static final String DEFAULT_NAME1 = "Barsik";
    private static final int DEFAULT_AGE1 = 1;
    
    private static final String DEFAULT_NAME2 = "Kesha";
    private static final int DEFAULT_AGE2 = 2;
    
    private static final String DEFAULT_NAME3 = "Majra";
    private static final int DEFAULT_AGE3 = 3;

    private static final String DEFAULT_NAME4 = "Ajsha";
    private static final int DEFAULT_AGE4 = 4;

    private static final String DEFAULT_NAME5 = "Murzik";
    private static final int DEFAULT_AGE5 = 5;
    
    private static final String DEFAULT_NAME6 = "Simba";
    private static final int DEFAULT_AGE6 = 6;
    
    private static final String DEFAULT_NAME7 = "Lilu";
    private static final int DEFAULT_AGE7 = 7;

    private static final String DEFAULT_NAME8 = "Kuzja";
    private static final int DEFAULT_AGE8 = 8;

    private static final String DEFAULT_NAME9 = "Maks";
    private static final int DEFAULT_AGE9 = 9;

    private static final String DEFAULT_NAME10 = "Bagira";
    private static final int DEFAULT_AGE10 = 10;

    private int age;
    private String name;

    // Constructor bez parametrov
    public static Cat DefaultCat1(){
       return new Cat (DEFAULT_NAME1, DEFAULT_AGE1);
    }

    public static Cat DefaultCat2(){
       return new Cat (DEFAULT_NAME2, DEFAULT_AGE2);
    }

    public static Cat DefaultCat3(){
       return new Cat (DEFAULT_NAME3, DEFAULT_AGE3);
    }

    public static Cat DefaultCat4(){
       return new Cat (DEFAULT_NAME4, DEFAULT_AGE4);
    }
    public static Cat DefaultCat5(){
       return new Cat (DEFAULT_NAME5, DEFAULT_AGE5);
    }

    public static Cat DefaultCat6(){
       return new Cat (DEFAULT_NAME6, DEFAULT_AGE6);
    }

    public static Cat DefaultCat7(){
       return new Cat (DEFAULT_NAME7, DEFAULT_AGE7);
    }

    public static Cat DefaultCat8(){
       return new Cat (DEFAULT_NAME8, DEFAULT_AGE8);
    }
    public static Cat DefaultCat9(){
       return new Cat (DEFAULT_NAME9, DEFAULT_AGE9);
    }

    public static Cat DefaultCat10(){
       return new Cat (DEFAULT_NAME10, DEFAULT_AGE10);
    }

    // Constructor s parametrami
    public Cat (String name1, int age1){
        this.name = name1;
        this.age = age1;
    }
       
    public Cat() {}

    // Getters and Setters                
    public int getAge() {
        return age;
    } 
    public void setAge(int age) {
        this.age = age;
    }
        
    public String getName() {
        return this.name;
    } 
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Cat [age=" + age + ", name=" + name + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cat other = (Cat) obj;
        if (age != other.age)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

}         