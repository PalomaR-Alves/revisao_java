package poo;

import java.util.Locale;
import java.util.Scanner;

public class main_account {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double deposit;
        Account acc;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there an initial deposit? (y/n) ");
        char isDeposit = sc.next().charAt(0);

        if (isDeposit == 'y') {
            System.out.print("Enter initial deposit value: ");
            deposit = sc.nextDouble();
            acc = new Account(number, holder, deposit);
        } else {
            acc = new Account(number, holder);
        }

        System.out.println("\nAccount data:");
        System.out.println(acc);

        System.out.print("Enter a deposit value: ");
        deposit = sc.nextDouble();
        acc.deposit(deposit);
        System.out.println("Updated account data:");
        System.out.println(acc);

        System.out.print("Enter a withdraw value: ");
        double wdr = sc.nextDouble();
        acc.withdraw(wdr);
        System.out.println("Updated account data:");
        System.out.println(acc);

        sc.close();
    }
}
