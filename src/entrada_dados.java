import java.util.Locale;
import java.util.Scanner;

public class entrada_dados {
    public static void main(String[] args) {

        //declarar antes do scanner para mudar separador decimal
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        /*
        // PARTE 1

        // ler STRING
        String s;
        s = sc.next();
        System.out.println("você digitou: " + s);

        // ler INTEIRO
        int i;
        i = sc.nextInt();
        System.out.println("você digitou: " + i);

        // ler DOUBLE
        double d;
        d = sc.nextDouble(); // tbm aceita inteiros
        System.out.println("você digitou: " + d);

        // ler CHAR
        char c;
        c = sc.next().charAt(0); // lê primeiro caractere de uma string
        System.out.println("você digitou: " + c);
        */

        // PARTE 2
        int n;
        String s1, s2, s3;

        n = sc.nextInt();
        sc.nextLine(); // para consumir a quebra de linha deixada pelo nextInt()
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados inseridos: ");
        System.out.println(n);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();

    }
}
