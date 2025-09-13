package entities;

public class ContaEmpresarial extends Conta {
    private Double loanLimit;

    public ContaEmpresarial() {super();}

    public ContaEmpresarial(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (amount <= loanLimit) {
            balance += amount - 10;
        }
    }

    // o saque é efetuado usando o método implementado na superclasse Account, porém
    // deve ser descontada uma taxa de +2 além dos 5 já descontados
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        balance -= 2;
    }
}
