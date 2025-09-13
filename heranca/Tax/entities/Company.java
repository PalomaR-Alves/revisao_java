package entities;

public class Company extends TaxPayer {

    private Integer employeeQuantity;

    public Company() {}

    public Company(String name, Double annualIncome, Integer employeeQuantity) {
        super(name, annualIncome);
        this.employeeQuantity = employeeQuantity;
    }

    public Integer getEmployeeQuantity() {
        return employeeQuantity;
    }

    public void setEmployeeQuantity(Integer employeeQuantity) {
        this.employeeQuantity = employeeQuantity;
    }

    @Override
    public double payTax() {
        if (employeeQuantity <= 10) {
            return getAnnualIncome() * 0.16;
        } else {
            return getAnnualIncome() * 0.14;
        }
    }
}
