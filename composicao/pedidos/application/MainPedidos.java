package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class MainPedidos {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.printf("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.printf("Birth Date (DD/MM/YYYY): ");
        // recebe data em string e a guarda em obj LocalDate informando em qual formato ela está
        LocalDate birthDate = LocalDate.parse(sc.nextLine(), fmt);
        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String status = sc.nextLine();
        System.out.print("How many items to this order? ");
        int items_quantity = sc.nextInt();
        sc.nextLine();

        Client client = new Client(name, email, birthDate);
        Order order = new Order(LocalDateTime.now(), OrderStatus.valueOf(status), client);

        for (int i = 1; i <= items_quantity; i++) {
            System.out.printf("Enter item #%d data:\n", i);
            System.out.print("Product name: ");
            name = sc.nextLine();
            System.out.print("Product price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            Product prod = new Product(name, price);
            OrderItem item = new OrderItem(prod, quantity);
            order.addItem(item);
        }



        System.out.println("\nORDER SUMMARY:");
        System.out.println(order);

        sc.close();

    }
}
