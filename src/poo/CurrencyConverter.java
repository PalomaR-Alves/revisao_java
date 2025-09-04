package poo;

public class CurrencyConverter {

    public static final double DOLLAR = 5.43;
    public static final double IOF = 0.06;

    public static double convert(double value) {
        double converted_value = value * DOLLAR;
        return converted_value + (converted_value * IOF);
    }

}
