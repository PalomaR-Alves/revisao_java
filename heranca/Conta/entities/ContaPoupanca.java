package entities;

public class ContaPoupanca extends Conta {
    private Double interestRate; // taxa de juros de rendimento da conta poupança

    public ContaPoupanca () {super();}

    public ContaPoupanca(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }

    @Override // indica sobreposição de método definido na superclasse
    public final void withdraw(double amount) { // final: ñ pode ser sobrescrito em subclasses
        balance -= amount; // saque sem taxa
    }
}
