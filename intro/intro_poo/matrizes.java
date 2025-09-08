package intro_poo;

import java.util.Locale;
import java.util.Scanner;

public class matrizes {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o N da matriz NxN: ");
        int n = sc.nextInt();

        int[][] mat =  new int[n][n]; // instanciação da matriz n (linhas) x n (colunas)

        System.out.printf("Agora os valores da matriz %dx%d:\n", n, n);

        for (int i = 0; i < mat.length; i++) { // mat.length obtém o numero de linhas da matriz
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int neg_numbers = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] < 0) {
                    neg_numbers++;
                }
            }
        }

        System.out.println("\nDiagonal principal:");
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }

        System.out.print("\nNúmeros negativos: " + neg_numbers);

        sc.close();
    }
}