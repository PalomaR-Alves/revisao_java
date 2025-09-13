package model.entities;

import model.exceptions.ContaBancariaException;

public class ContaBancaria {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public ContaBancaria(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws ContaBancariaException {
        if (amount > withdrawLimit) {
            throw new ContaBancariaException("The amount exceeds withdraw limit.");
        }
        if (balance == 0) {
            throw new ContaBancariaException("Not enough balance.");
        }

        System.out.println("New balance: " + balance);
    }
}
