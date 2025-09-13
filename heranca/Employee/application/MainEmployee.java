package application;

import entities.Employee;
import entities.OutsorcedEmployeee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainEmployee {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.printf("Employee #%d data:\n", i);
            System.out.print("Outsourced (y/n)? ");
            char out = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            sc.nextLine();
            System.out.print("Value per hour: ");
            double vph = sc.nextDouble();
            sc.nextLine();

            if (out == 'y') {
                System.out.print("Additional charge: ");
                double ac = sc.nextDouble();
                sc.nextLine();
                list.add(new OutsorcedEmployeee(name, hours, vph, ac));
            } else {
                list.add(new Employee(name, hours, vph));
            }
        }

        System.out.println("PAYMENTS:");
        for (Employee e : list) {
            System.out.printf("%s - $ %.2f\n", e.getName(), e.payment());
        }

    }
}
