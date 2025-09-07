package intro_poo;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_vetores {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
        // EX. Negativos
        System.out.print("Insira um inteiro: ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        System.out.println("Insira " + n + " inteiros:");
        for (int i = 0; i < vect.length; i++) {
            vect[i] = sc.nextInt();
        }

        System.out.println("Números NEGATIVOS:");
        for (int i = 0; i < n; i++) {
            if (vect[i] < 0) {
                System.out.println(vect[i]);
            }
        }
        */

        // EX. Alturas
        /*
        System.out.println("Quantas pessoas serão digitadas?");
        int qtd = sc.nextInt();
        sc.nextLine();

        Pessoa[] pessoas = new Pessoa[qtd];

        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            sc.nextLine();

            pessoas[i] = new Pessoa(nome, idade, altura);
        }

        double alturas = 0.0;

        for (int i = 0; i < pessoas.length; i++) {
            alturas += pessoas[i].getAltura();
        }
        System.out.printf("\nAltura média: %.2f\n", alturas/qtd);

        double maior_16 = 0.0;

        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() < 16) {
                maior_16++;
            }
        }

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", maior_16/qtd*100);

        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() < 16) {
                System.out.println(pessoas[i].getNome());
            }
        }
        */

        // EX. Aprovados

        System.out.print("Quantos alunos serão digitados? ");
        int qtda = sc.nextInt();
        sc.nextLine();

        String[] nomes = new String[qtda];
        double[] notas1 = new double[qtda];
        double[] notas2 = new double[qtda];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + " aluno:");
            nomes[i] = sc.nextLine();
            notas1[i] = sc.nextDouble();
            sc.nextLine();
            notas2[i] = sc.nextDouble();
            sc.nextLine();
        }

        System.out.println("Alunos aprovados:");
        for (int i = 0; i < nomes.length; i++) {
            if ((notas1[i] + notas2[i])/2 >= 6) {
                System.out.println(nomes[i]);
            }
        }

        sc.close();
    }
}
