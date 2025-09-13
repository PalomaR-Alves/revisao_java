package application;

import model.entities.ContaBancaria;
import model.exceptions.ContaBancariaException;

import java.util.Scanner;

public class MainContaBancaria {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            System.out.print("Initial Balance: ");
            double balance = sc.nextDouble();
            sc.nextLine();
            System.out.print("Withdraw limit: ");
            double wlimit = sc.nextDouble();

            ContaBancaria cb = new ContaBancaria(number, holder, balance, wlimit);
            System.out.print("\nEnter amount for withdraw: ");
            double amount = sc.nextDouble();

            cb.withdraw(amount);

        }
        catch (ContaBancariaException e) {
            System.out.println(e.getMessage());
        }
        finally {
            sc.close();
        }
    }
}
