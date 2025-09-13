package entities;

public class Individual extends TaxPayer {

    private Double healthExpense;

    public Individual() {super();}

    public Individual(String name, Double annualIncome, Double healthExpense) {
        super(name, annualIncome);
        this.healthExpense = healthExpense;
    }

    public Double getHealthExpense() {
        return healthExpense;
    }

    public void setHealthExpense(Double healthExpense) {
        this.healthExpense = healthExpense;
    }

    @Override
    public double payTax() {
        if (getAnnualIncome() < 20000) {
            if (healthExpense > 0) {
                return getAnnualIncome() * 0.15 - (healthExpense * 0.5);
            }
            return getAnnualIncome() * 0.15;
        } else {
            if (healthExpense > 0) {
                return getAnnualIncome() * 0.25 - (healthExpense * 0.5);
            }
            return getAnnualIncome() * 0.25;
        }
    }
}
