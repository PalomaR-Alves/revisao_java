package intro_poo;

import java.util.Locale;
import java.util.Scanner;

public class main_currency {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("What is the dollar price? %.2f\n", CurrencyConverter.DOLLAR);
        System.out.print("How many dollars will be bought? ");
        double dollars = sc.nextDouble();
        dollars = CurrencyConverter.convert(dollars); // valor convertido
        System.out.printf("Amount to be paid in reais = %.2f", dollars);

    }
}
