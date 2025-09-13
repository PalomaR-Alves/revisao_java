package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainTax {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char type = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Annual income: ");
            double income = sc.nextDouble();
            sc.nextLine();
            if (type == 'i') {
                System.out.print("Health expenditures: ");
                double he = sc.nextDouble();
                list.add(new Individual(name, income, he));
                sc.nextLine();
            }
            else {
                System.out.print("Number of employees: ");
                int emps = sc.nextInt();
                list.add(new Company(name, income, emps));
                sc.nextLine();
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");
        double sum = 0.0;
        for (TaxPayer t : list) {
            System.out.printf("%s: $ %.2f\n", t.getName(), t.payTax());
            sum += t.payTax();
        }

        System.out.println("\nTOTAL TAXES: $ " + sum);

        sc.close();
    }
}
