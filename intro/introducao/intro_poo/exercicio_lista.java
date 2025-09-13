package intro_poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class exercicio_lista {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i+1) + ":" );
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();
            // cria e adiciona na lista novo funcionário
            employees.add(new Employee(id, name, salary));
        }

        System.out.print("\nEnter the employee id that will have salary increase: ");
        int id = sc.nextInt();

        Employee emp = employees.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
        if (emp != null) {
            System.out.print("Enter the percentage: ");
            double perc = sc.nextDouble();
            emp.increaseSalary(perc); // aumenta o salário
        } else {
            System.out.println("This id does not exist!");
        }

        System.out.println("\nList of employees:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        sc.close();
    }
}
