package application;

import entities.Conta;
import entities.ContaEmpresarial;
import entities.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;

public class MainConta {
    public static void main (String[] args) {

        List<Conta> list = new ArrayList<>();

        list.add(new ContaPoupanca(1001, "Alex", 500.0,0.01 ));
        list.add(new ContaEmpresarial(1002, "Maria", 1000.0, 400.0));
        list.add(new ContaPoupanca(1004, "Bob", 300.0, 0.01));
        list.add(new ContaPoupanca(1005, "Anna", 500.0, 500.0));

        double sum = 0.0;

        //
        for (Conta acc : list) {
            sum += acc.getBalance();
        }

        System.out.printf("total balance: %.2f ", sum);

        for (Conta acc : list) {
            acc.deposit(10);
            System.out.printf("\nSaldo atualizado da conta %d: %.2f", acc.getNumber(), acc.getBalance());
        }

    }
}
