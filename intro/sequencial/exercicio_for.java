package sequencial;

import java.util.Scanner;

public class exercicio_for {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Ex. 1
        /*
        System.out.println("Insira o num para calcular seu fatorial: ");
        int n = sc.nextInt();
        int fat = 1;

        for (int i = 1; i <= n; i++) {
            fat = fat * i;
        }

        System.out.printf("Fatorial de %d: %d", n, fat);
         */

        // Ex. 2
        /*
        System.out.println("Insira o num para calcular seus divisores: ");
        int x = sc.nextInt();
        System.out.printf("divisores de %d:\n", x);

        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                System.out.println(i);
            }
        }
        */

        // Ex. 3
        System.out.println("Insira um número: ");
        int y = sc.nextInt();

        System.out.println("num da linha, quadrado e cubo:");
        for (int i = 1; i <= y; i++) {
            System.out.printf("%d, %d, %d\n", i, i*i, i*i*i);
        }

        sc.close();

    }
}
