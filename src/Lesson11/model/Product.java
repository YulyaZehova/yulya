package Lesson11.model;

public class Product {
        
    private int id;
    private String name;
    private String manufactureDate;

    public Product(int id, String name, String manufactureDate) {
        this.id = id;
        this.name = name;
        this.manufactureDate = manufactureDate;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
// in file will be  1;Soft toy bear;15.11.2026
    public String toFileString() {
        return id + ";" + name + ";" + manufactureDate;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((manufactureDate == null) ? 0 : manufactureDate.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (manufactureDate == null) {
            if (other.manufactureDate != null)
                return false;
        } else if (!manufactureDate.equals(other.manufactureDate))
            return false;
        return true;
    }

}
