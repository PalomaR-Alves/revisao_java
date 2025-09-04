package poo;

public class Account {

    private final int number; // uma vez atribuído um valor ele não poderá ser modificado
    private String holder;
    private double balance;

    public Account(int number, String holder, double deposit) {
        this.number = number;
        this.holder = holder;
        deposit(deposit);
    }

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public int getNumber() {
        return number;
    }

    public void deposit(double value) {
        this.balance += value;
    }

    public void withdraw(double value) {
        this.balance -= value + 5;
    }

    public String toString() {
        return "Account " + this.number
                + ", Holder: " + this.holder
                + ", Balance: $ " + this.balance;
    }

}
