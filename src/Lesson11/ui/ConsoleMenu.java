package Lesson11.ui;

import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Lesson11.exeptions.EntityNotFoundException;
import Lesson11.model.Order;
import Lesson11.model.Product;
import Lesson11.repository.OrderRepository;
import Lesson11.repository.ProductRepository;

public class ConsoleMenu {
    private static final String HOME_MENU = """
            ===MAIN MENU===
            1.Manage products
            2.Manage orders
            0.Exit
            Select an option: """;

    private static final String PRODUCT_MENU = """
            === PRODUCTS ===
            1. Show all products
            2. Add a product
            3. Remove a product
            0. Back to main menu
            Select an option: """;

    private static final String ORDER_MENU = """
            === ORDERS ===
            1. Show all orders
            2. Add an order
            3. Remove an order
            0. Back to main menu
            Select an option: """;

    private final Scanner scanner;
    private final ProductRepository productRepository;
    private final OrderRepository orderRepository;
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public ConsoleMenu(ProductRepository productRepository, OrderRepository orderRepository) {
        this.scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        this.productRepository = productRepository;
        this.orderRepository = orderRepository;
    }

    public void start() {
        while (true) {
            System.out.println(HOME_MENU);
            String enterString = scanner.nextLine();

            switch (enterString) {
                case "1":
                    productMenu();
                    break;
                case "2":
                    orderMenu();
                    break;
                case "0":
                    productRepository.saveToFile();
                    orderRepository.saveToFile();
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Incorrect menu item");
            }
        }
    }

    private void productMenu() {
        while (true) {
            System.out.println(PRODUCT_MENU);
            String enterString = scanner.nextLine();

            switch (enterString) {
                case "1":
                    getAllProducts();
                    break;
                case "2":
                    addProduct();
                    break;
                case "3":
                    deleteProduct();
                    break;
                case "0":
                    return;
                default:
                    System.out.println("Incorrect menu item");
            }
        }
    }

    private void deleteProduct() {
        System.out.println("Enter Product's ID for removing");
        String enteString = scanner.nextLine().trim();

        try {
            int id = Integer.parseInt(enteString);
            productRepository.deleteById(id);
            System.out.println("Product with ID " + id + " is removed.");
        } catch (EntityNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void addProduct() {
        while (true) {
            System.out.print("Enter Name and Date of Product (e.g. Soft toy wolf 18.11.2026): ");
            String input = scanner.nextLine().trim();

            int lastSpace = input.lastIndexOf(' ');
            if (lastSpace == -1) {
                System.out.println("Invalid format. Enter Name and Date separated by space.");
                continue;
            }

            String name = input.substring(0, lastSpace).trim();
            String dateStr = input.substring(lastSpace + 1).trim();

            if (name.isEmpty()) {
                System.out.println("Product name cannot be empty.");
                continue;
            }

            try {
                LocalDate.parse(dateStr, DATE_FORMATTER);
            } catch (DateTimeParseException e) {
                System.out.println("Use Date Format: dd.MM.yyyy");
                continue;
            }

            Product created = productRepository.add(name, dateStr);
            System.out
                    .println("Product '" + created.getName() + "with ID " + created.getID() + " is added successfully");
            break;
        }
    }

    private void getAllProducts() {
        List<Product> products = productRepository.getAllProducts();
        if (products.isEmpty()) {
            System.out.println("No products available.");
            return;
        }

        System.out.println("List of Products: ");
        for (Product p : products) {
            System.out.println(p.getID() + " " + p.getName() + " " + p.getManufactureDate());
        }
    }

    private void orderMenu() {
        while (true) {
            System.out.println(ORDER_MENU);
            String enterString = scanner.nextLine();

            switch (enterString) {
                case "1":
                    getAllOrders();
                    break;
                case "2":
                    addOrder();
                    break;
                case "3":
                    deleteOrder();
                    break;
                case "0":
                    return;
                default:
                    System.out.println("Incorrect menu item");
            }
        }
    }

    private void deleteOrder() {
        System.out.println("Enter Order ID for removing");
        String newString = scanner.nextLine().trim();

        try {
            int id = Integer.parseInt(newString);
            orderRepository.deleteById(id);
            System.out.println("Order with ID " + id + " is removed");
        } catch (EntityNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    private void addOrder() {
        getAllProducts();
        System.out.print("\nEnter Product IDs  (e.g., 1 3 5): ");
        String input = scanner.nextLine().trim();

        if (input.isEmpty()) {
            System.out.println("Error: No product IDs entered.");
            return;
        }

        String[] newStrings = input.split("[,\\s]+");
        List<Product> selectedProducts = new ArrayList<>();

        for (String s : newStrings) {
            try {
                int prodId = Integer.parseInt(s.trim());
                Product product = productRepository.findById(prodId);
                selectedProducts.add(product);
            } catch (EntityNotFoundException e) {
                System.out.println("Error: " + e.getMessage());
                return;
            }
        }

        String currentDate = LocalDate.now().format(DATE_FORMATTER);
        Order createdOrder = orderRepository.add(selectedProducts, currentDate);
        System.out.println(
                "Order with ID " + createdOrder.getId() + " and Date " + currentDate + " is created successfully");
    }

    private void getAllOrders() {
        List<Order> orders = orderRepository.getAllOrders();
        System.out.println("List of Orders: ");

        if (orders.isEmpty()) {
            System.out.println("No orders available.");
            return;
        }

        for (Order order : orders) {
            String productsStr;
            if (order.getProducts().isEmpty()) {
                productsStr = "There is no Products";
            } else {
                List<String> names = new ArrayList<>();
                for (Product p : order.getProducts()) {
                    names.add(p.toString());
                }
                productsStr = String.join(", ", names);
            }
            System.out.println(order.getId() + " " + order.getOrderDate() + " " + productsStr);
        }
    }
}
