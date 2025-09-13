package intro_poo;

import java.util.Locale;
import java.util.Scanner;

public class for_each {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String[] vect = new String[] {"Maria", "Bob", "Alex"}; // cria vetor já com os valores

        // for convencional
        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }
        System.out.println("----------------");
        // for each (simplificado): pra cada obj em vect printa obj
        for (String obj : vect) {
            System.out.println(obj);
        }

        sc.close();
    }
}
