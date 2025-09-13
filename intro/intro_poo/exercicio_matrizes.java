package intro_poo;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_matrizes {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o N e M da matriz NxM: ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] mat = new int[n][m];

        System.out.println("Agora, preencha a matriz:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.print("Escolha um número existente na matriz: ");
        int num = sc.nextInt();


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == num) { // encontrou uma ocorrência do número
                    System.out.printf("Position %d, %d:\n", n, m);
                    // verificação de números ao redor
                    if (i-1 >= 0) { // linha acima válida?
                        System.out.println("Up: " + mat[i-1][j]);
                    }
                    if (i+1 < n) { // linha abaixo válida?
                        System.out.println("Down: " + mat[i+1][j]);
                    }
                    if (j-1 >= 0) { // coluna à esquerda válida?
                        System.out.println("Left: " + mat[i][j-1]);
                    }
                    if (j+1 < m) { // coluna à direita válida?
                        System.out.println("Right: " + mat[i][j+1]);
                    }
                }
            }
        }

        sc.close();
    }
}
