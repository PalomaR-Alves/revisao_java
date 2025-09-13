package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class repeticao_do_while {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        char resp;

        do {
            System.out.print("Digite uma temperatura em Celsius: ");
            double c = sc.nextDouble();
            double f = 9.0 * c / 5.0 + 32;
            System.out.printf("Equivalente em Fahrenheit: %.2f\n", f);
            System.out.println("Deseja repetir? (s/n)");
            resp = sc.next().charAt(0);
        } while (resp == 's');

        sc.close();

    }
}
