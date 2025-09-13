package sequencial;

import java.util.Scanner;

public class exercicio_while {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ex. 1
        /*
        int senha = 2002, input;
        System.out.println("Digite a senha correta: ");
        input = sc.nextInt();

        while (input != 2002) {
            System.out.println("Senha inválida,");
            System.out.println("Digite a senha correta: ");
            input = sc.nextInt();
        }

        System.out.println("Acesso permitido.");
        */

        // Ex. 2

        int x, y;

        System.out.println("Insira coordenadas X e Y: ");
        x = sc.nextInt();
        y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("primeiro\n");
                System.out.println("Insira coordenadas X e Y: ");
                x = sc.nextInt();
                y = sc.nextInt();
            } else if (y > 0) { // com x < 0, se chegou aqui já é True
                System.out.println("segundo\n");
                System.out.println("Insira coordenadas X e Y: ");
                x = sc.nextInt();
                y = sc.nextInt();
            } else if (x < 0) { // com y < 0, se chegou aqui já é True
                System.out.println("terceiro\n");
                System.out.println("Insira coordenadas X e Y: ");
                x = sc.nextInt();
                y = sc.nextInt();
            } else { // com x < 0 e y < 0, se chegou aqui já é True
                System.out.println("quarto\n");
                System.out.println("Insira coordenadas X e Y: ");
                x = sc.nextInt();
                y = sc.nextInt();
            }
        }

        System.out.println("Coordenada nula.");

        sc.close();
    }
}
