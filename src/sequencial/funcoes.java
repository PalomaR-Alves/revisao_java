package sequencial;

import java.util.Scanner;

public class funcoes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x = Math.sqrt(25.0); // raiz quadrada
        System.out.println(x);

        System.out.println("Bota 3 números aí: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a, b, c);
        System.out.println("Higher: " + higher);

    }

    public static int max(int x, int y, int z) {
        int aux;
        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }

}
