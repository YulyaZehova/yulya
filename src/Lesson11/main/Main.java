package Lesson11.main;

import Lesson11.exeptions.EntityNotFoundException;
import Lesson11.repository.OrderRepository;
import Lesson11.repository.ProductRepository;
import Lesson11.ui.ConsoleMenu;

public class Main {
    public static void main(String[] args) throws EntityNotFoundException {

        ProductRepository productRepository = new ProductRepository("src/Lesson11/repository/products.txt");
        OrderRepository orderRepository = new OrderRepository("src/Lesson11/repository/orders.txt", productRepository);
        ConsoleMenu menu = new ConsoleMenu(productRepository, orderRepository);
        menu.start();
    }
}
