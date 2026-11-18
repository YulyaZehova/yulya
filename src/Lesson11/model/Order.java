package Lesson11.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    
    private int id;
    private List<Product> products;
    private String orderDate;

    public Order(int id, List<Product> products, String orderDate) {
        this.id = id;
        this.products = new ArrayList<>(products);
        this.orderDate = orderDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = new ArrayList<>(products);
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }
// in file will be 1;1,3,5;18.11.2026
    public String toFileString() {
        List<String> productIds = new ArrayList<>();
        for (Product p : products) {
            productIds.add(String.valueOf(p.getID()));
        }
        return id + ";" + String.join(",", productIds) + ";" + orderDate;
    }
    
    @Override
    public String toString() {
        return "Order [id=" + id + ", products=" + products + ", orderDate=" + orderDate + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((products == null) ? 0 : products.hashCode());
        result = prime * result + ((orderDate == null) ? 0 : orderDate.hashCode());
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
        Order other = (Order) obj;
        if (id != other.id)
            return false;
        if (products == null) {
            if (other.products != null)
                return false;
        } else if (!products.equals(other.products))
            return false;
        if (orderDate == null) {
            if (other.orderDate != null)
                return false;
        } else if (!orderDate.equals(other.orderDate))
            return false;
        return true;
    }

    

}
