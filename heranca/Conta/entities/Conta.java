package entities;

public abstract class Conta {
    /*
    Não é possível instanciar um objeto Conta pois esta classe é ABSTRATA
    classes ABSTRATAS ñ podem ser instanciadas, apenas HERDADAS, assim somente
    suas subclasses podem ser instanciadas.
    Classes abstratas são úteis quando é preciso realizar operações em todos
    os objetos, por exemplo totalizar o saldo de todas as contas, independente
    se é empresarial ou poupança.
    */

    private Integer number;
    private String holder;
    protected Double balance;

    public Conta () {}

    public Conta(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
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

    public void withdraw(double amount) {
        balance -= amount + 5; // saque com taxa
    }

    public void deposit(double amount) {
        balance += amount;
    }

}
