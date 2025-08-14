package sequencial;

import java.util.Scanner;

public class repeticao_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o número de repetições pra somar: ");
        int n = sc.nextInt();

        int soma = 0;

        for (int i = 0; i < n; i++) {
            System.out.printf("número %d: ", i+1);
            int x = sc.nextInt();
            soma += x;
        }

        System.out.printf("\nSOMA: %d", soma);

        sc.close();

    }
}
