package entities;

public final class SavingsAccount extends Account { // final: ñ pode ser herdada
    private Double interestRate; // taxa de juros de rendimento da conta poupança

    public SavingsAccount () {
        super();}

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
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
