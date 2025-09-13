package entities;

public final class OutsorcedEmployeee extends Employee {
    private Double additionalCharge;

    public OutsorcedEmployeee() {}

    public OutsorcedEmployeee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public Double payment() {
        // terceirizados recebem hours*valuePerHour + 110% do additionalCharge
        return super.payment() + additionalCharge + (additionalCharge*0.1);
    }
}
