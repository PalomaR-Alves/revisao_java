package sequencial;

import java.util.Locale;
import java.util.Scanner;
import static java.lang.Math.abs;

public class exercicio_condicionais {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        // Ex. 1
        /*
        System.out.println("Insira um número inteiro: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NAO NEGATIVO");
        }
        */

        // Ex. 2
        /*
        System.out.println("Insira um número inteiro: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
        */

        // Ex. 3
        /*
        int x, y;
        System.out.println("Insira dois números inteiros: ");
        x = sc.nextInt();
        y = sc.nextInt();

        if (x > y) {
            if (x % y == 0) {
                System.out.println("São múltiplos!");
            } else {
                System.out.println("Não são múltiplos");
            }
        } else {
            if (y % x == 0) {
                System.out.println("São múltiplos!");
            } else {
                System.out.println("Não são múltiplos");
            }
        }
        */

        // Ex. 4
        /*
        int x, y;
        System.out.println("Insira a hora inicial e final: ");
        x = sc.nextInt();
        y = sc.nextInt();

        if (x == y) {
            System.out.println("Duração mínima: 1 hora");
        }

        if (x > y) {
            System.out.printf("\nO jogo durou %d hora(s)", (24-x)+y);
        } else {
            System.out.printf("\nO jogo durou %d hora(s)", abs(x-y));
        }
        */

        // Ex. 5
        /*
        int x;
        double y;
        System.out.println("Insira o código do item e a quantidade: ");
        x = sc.nextInt();
        y = sc.nextDouble();

        if (x == 1) {
            System.out.printf("\nTotal: R$ %.2f", y*4.0);
        }
        if (x == 2) {
            System.out.printf("\nTotal: R$ %.2f", y*4.5);
        }
        if (x == 3) {
            System.out.printf("\nTotal: R$ %.2f", y*5.0);
        }
        if (x == 4) {
            System.out.printf("\nTotal: R$ %.2f", y*2.0);
        }
        if (x == 5) {
            System.out.printf("\nTotal: R$ %.2f", y*1.5);
        }
        */

        // Ex. 6

        double x;

        System.out.println("Insira um número: ");
        x = sc.nextDouble();

        if (x < 0 || x > 100) {
            System.out.println("Fora de intervalo");
        } else {
            if (x <= 25) {
                System.out.println("Intervalo [0,25]");
            }
        }

        if (x == 0) {
            System.out.println("Intervalo [0,25)");
        }


        if (x > 25 && x <= 50) {
            System.out.println("Intervalo (25,50]");
        }

        if (x > 50 && x <= 75) {
            System.out.println("Intervalo (50,75]");
        }

        if (x > 75 && x <= 100) {
            System.out.println("Intervalo (75, 100]");
        }

        sc.close();

    }
}
