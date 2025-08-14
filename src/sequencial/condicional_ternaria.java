package sequencial;

import java.util.Scanner;

public class condicional_ternaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double preco;
        System.out.println("Insira o preço: ");
        preco = sc.nextDouble();

        double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;

        System.out.println("Desconto aplicado: " + desconto);

        sc.close();
    }
}
