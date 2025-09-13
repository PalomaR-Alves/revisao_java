package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class MainAccount {
    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex", 1000.0);
        BusinessAccount bacc = new BusinessAccount(1002,"Maria", 1000.0, 500.0);

        // UPCASTING: subclasse -> superclasse
        // um objeto da subclasse É um objeto da superclasse
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Anna", 1000.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Bob", 1000.0, 0.01);
        // na memória acc2 e acc3 continuam sendo respectivamente BusinessAccount e SavingsAccount

        // DOWNCASTING
        // como o compilador ñ sabe se o casting de uma superclasse para uma subclasse
        // é de fato seguro precisamos explicitar o casting
        BusinessAccount acc4 = (BusinessAccount) acc2; // Account -> BusinessAccount
        acc4.loan(100.0);

        // acc3 é uma SavingsAccount, e um objeto deste tipo NÃO É uma BusinessAccount e sim uma Account
        // o erro ñ é mostrado mas será levantada uma exceção em tempo de execução
        /*
        BusinessAccount acc5 = (BusinessAccount) acc3;
        */
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(100.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

        // TESTE DE SOBREPOSIÇÃO
        acc.withdraw(200); // Account
        System.out.println(acc.getBalance()); // saque com taxa: 5

        SavingsAccount acc6 = new SavingsAccount(1004, "Terry", 1000.0, 0.01);
        acc6.withdraw(200); // SavingsAccount
        System.out.println(acc6.getBalance()); // saque sem taxa

        bacc.withdraw(200); // BusinessAccount
        System.out.println(bacc.getBalance()); // saque com taxa: 5+2

    }
}
