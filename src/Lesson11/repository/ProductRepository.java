package Lesson11.repository;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import Lesson11.exeptions.EntityNotFoundException;
import Lesson11.model.Product;

public class ProductRepository {
    private final Path filePath;
    private final List<Product> products;

    public ProductRepository(String filePath) {
        this.filePath = Paths.get(filePath);
        this.products = new ArrayList<>();
        loadFromFile();
    }

    private void loadFromFile() {

        try {
            for (String line : Files.readAllLines(filePath, StandardCharsets.UTF_8)) {
                if (line.trim().isEmpty())
                    continue;

                String[] parts = line.split(";");
                if (parts.length == 3) {
                    int id = Integer.parseInt(parts[0].trim());
                    String name = parts[1].trim();
                    String date = parts[2].trim();
                    products.add(new Product(id, name, date));
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error during loading file " + e.getMessage());
        }
    }

    public void saveToFile() {
        List<String> lines = new ArrayList<>();
        for (Product p : products) {
            lines.add(p.toFileString());
        }
        try {
            Files.write(filePath, lines, StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println("Error during saving " + e.getMessage());
        }
    }

    public List<Product> getAllProducts() {
        return new ArrayList<>(products);
    }

    public Product findById(int id) throws EntityNotFoundException {
        for (Product p : products) {
            if (p.getID() == id) {
                return p;
            }
        }
        throw new EntityNotFoundException("ID " + id + " is not founded");
    }

    public Product add(String name, String manufactureDate) {
        int newId = generateNextId();
        Product product = new Product(newId, name, manufactureDate);
        products.add(product);
        saveToFile();
        return product;
    }

    public void deleteById(int id) throws EntityNotFoundException {
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product p = iterator.next();
            if (p.getID() == id) {
                iterator.remove();
                saveToFile();
                return;
            }
        }
        throw new EntityNotFoundException("ID " + id + " not found");
    }

    private int generateNextId() {
        int maxId = 0;
        for (Product p : products) {
            if (p.getID() > maxId) {
                maxId = p.getID();
            }
        }
        return maxId + 1;
    }
}
