package Lesson11.repository;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Lesson11.exeptions.EntityNotFoundException;
import Lesson11.model.Order;
import Lesson11.model.Product;

public class OrderRepository {

    private final Path filePath;
    private final List<Order> orders;
    private final ProductRepository productRepository;

    public OrderRepository(String filePath, ProductRepository productRepository) {
        this.filePath = Paths.get(filePath);
        this.productRepository = productRepository;
        this.orders = new ArrayList<>();
        loadFromFile();
    }

    private void loadFromFile() {
        try {
            for (String line : Files.readAllLines(filePath, StandardCharsets.UTF_8)) {
                if (line.trim().isEmpty())
                    continue;

                String[] parts = line.split(";", -1);
                if (parts.length == 3) {
                    int id = Integer.parseInt(parts[0].trim());
                    String productIdsPart = parts[1].trim();
                    String orderDate = parts[2].trim();

                    List<Product> orderProducts = new ArrayList<>();
                    if (!productIdsPart.isEmpty()) {
                        for (String prodIdStr : productIdsPart.split(",")) {
                            try {
                                int prodId = Integer.parseInt(prodIdStr.trim());
                                orderProducts.add(productRepository.findById(prodId));
                            } catch (EntityNotFoundException ignored) {
                                // if product was removed - ignored
                            }
                        }
                    }

                    orders.add(new Order(id, orderProducts, orderDate));
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error reading Order.txt: " + e.getMessage());
        }
    }

    public void saveToFile() {
        List<String> lines = new ArrayList<>();
        for (Order p : orders) {
            lines.add(p.toFileString());
        }
        try {
            Files.write(filePath, lines, StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println("Error during saving " + e.getMessage());
        }
    }

    private int generateNextId() {
        int maxId = 0;
        for (Order p : orders) {
            if (p.getId() > maxId) {
                maxId = p.getId();
            }
        }
        return maxId + 1;
    }

    public List<Order> getAllOrders() {
        return new ArrayList<>(orders);
    }

    public Order add(List<Product> selectedProducts, String orderDate) {
        int newId = generateNextId();
        Order order = new Order(newId, selectedProducts, orderDate);
        orders.add(order);
        saveToFile();
        return order;
    }

    public void deleteById(int id) throws EntityNotFoundException {
        Iterator<Order> iterator = orders.iterator();
        while (iterator.hasNext()) {
            Order p = iterator.next();
            if (p.getId() == id) {
                iterator.remove();
                saveToFile();
                return;
            }
        }
        throw new EntityNotFoundException("ID " + id + " not found");
    }

}
