package intro_poo;

import java.util.Locale;
import java.util.Scanner;

public class main_product {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        /*
        System.out.print("Quantity: ");
        int quantity = sc.nextInt();
        */

        Product p = new Product(name, price);

        p.setName("Computer");
        System.out.println("Updated name: " + p.getName());

        System.out.println("Product data: " + p); // usando toString

        System.out.print("\nEnter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        p.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + p);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        p.removeProducs(quantity);

        System.out.println();
        System.out.println("Updated data: " + p);


        sc.close();

    }
}
