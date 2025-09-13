package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class MainContratos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // lê infos do trabalhador
        System.out.print("Enter department's name: ");
        String department = sc.nextLine();

        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Level: ");
        String level = sc.nextLine();
        System.out.print("Base salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();

        Worker worker = new Worker(name, WorkerLevel.valueOf(level), salary, new Department(department));

        System.out.print("How many contracts to this worker? ");
        int cont = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= cont; i++) {
            // lê infos do contrato
            System.out.printf("Enter contract #%d data:\n", i);
            System.out.print("Date (DD/MM/YYYY): ");
            LocalDate date = LocalDate.parse(sc.nextLine(), fmt); // lê a string e converte para LocalDate
            System.out.print("Value per hour: ");
            double vph = sc.nextDouble();
            sc.nextLine();
            System.out.print("Duration (hours): ");
            int duration = sc.nextInt();
            sc.nextLine();

            // adiciona o contrato
            worker.addContract(new HourContract(date, vph, duration));
        }

        System.out.print("\nEnter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.nextLine();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment());
        System.out.printf("Income for %s: %.2f", monthAndYear, worker.income(year, month));

        sc.close();
    }
}
