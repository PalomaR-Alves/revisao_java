package intro_poo;
import java.util.Locale;
import java.util.Scanner;

public class vetores {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        /*
        // VETOR DE TIPO PRIMITIVO
        System.out.print("Insira um inteiro: ");
        int n = sc.nextInt();

        double[] vect = new double[n]; //tipo e num de posições que o vetor terá

        for (int i = 0; i < n; i++) {
            System.out.print("Insira a altura " + (i+1) + ": ");
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }

        System.out.printf("Altura média: %.2f", sum/3);
        */

        // VETOR DE OBJETOS PRODUCT
        System.out.print("Insira um inteiro: ");
        int j = sc.nextInt();

        Product[] pvect = new Product[j]; // cria o vetor de Products com tamanho j

        for (int i = 0; i < pvect.length; i++) {
            System.out.println("Insira abaixo nome e preço do produto " + (i+1) + ": ");
            sc.nextLine(); // consome \n deixada pelo nextInt
            String nome = sc.nextLine();
            double preco = sc.nextDouble();
            pvect[i] = new Product(nome, preco); // a posição i do vetor recebe a referência aos dados do objeto criado
        }

        double psum = 0.0;
        for (int i = 0; i < j; i++) {
            psum += pvect[i].getPrice(); // soma os preços dos objetos
        }

        System.out.printf("Preço médio dos produtos: %.2f", psum/3);

        sc.close();

    }
}
