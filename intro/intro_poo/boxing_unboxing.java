package intro_poo;

import java.util.Locale;
import java.util.Scanner;

public class boxing_unboxing {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
        BOXING é a conversão de uma variável do tipo valor (tipo PRIMITIVO) para
        outro tipo referência (OBJETO) compatível.
        */

        int x = 20; // cria x na STACK
        Object obj = x; // este objeto cria e aponta para o valor de x na HEAP (Boxing)
        int y = (int) obj; // cria y na STACK com o valor para o qual obj aponta (Unboxing e casting entre ())

        // WRAPPER CLASSES
        // são classes equivalentes aos tipos primitivos, torna boxing e unboxing naturais
        // são usadas em entidades (classes) pois tipos referência aceitam valor null e usufruem dos recursos OO
        int a = 10;
        Integer object = a; // boxing natural sem casting
        System.out.println(object);
        int b = object * 2; // unboxing
        System.out.println(b);

        sc.close();
    }
}
