package application;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainProduct {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Produto> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.printf("Product #%d data:\n", i);
            System.out.print("Common, used or imported (c/u/i)? ");
            char type = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextInt();
            sc.nextLine();

            switch (type) {
                case 'c':
                    list.add(new Produto(name, price));
                    break;
                case 'u':
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    LocalDate date = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    list.add(new ProdutoUsado(name, price, date));
                    break;
                case 'i':
                    System.out.print("Customs fee: ");
                    double fee = sc.nextDouble();
                    list.add(new ProdutoImportado(name, price, fee));
                    break;
            }
        }

        System.out.println("PRICE TAGS:");
        for (Produto p : list) {
            System.out.println(p.priceTag());
        }

    }
}
