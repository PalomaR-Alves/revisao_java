package poo;

import java.util.Locale;
import java.util.Scanner;

public class main_product {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product p = new Product();
        System.out.println("Enter product data");
        System.out.print("Name: ");
        p.name = sc.nextLine();
        System.out.print("Price: ");
        p.price = sc.nextDouble();
        System.out.print("Quantity: ");
        p.quantity = sc.nextInt();

        System.out.println("Product data: " + p); // usando toString

        System.out.println("\nEnter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        p.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + p);

        System.out.println();
        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        p.removeProducs(quantity);

        System.out.println();
        System.out.println("Updated data: " + p);


        sc.close();

    }
}
