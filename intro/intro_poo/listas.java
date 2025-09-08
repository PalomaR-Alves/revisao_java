package intro_poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class listas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // List é uma interface e portanto ñ pode ser instanciada, assim list será um ArrayList,
        // que é uma classe que implementa esta interface
        List<String> list = new ArrayList<>();

        // add elementos na lista
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Ana");
        list.add(2, "Marco"); // add elemento em posição específica, movendo o já existente à frente

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("tamanho da lista original: " + list.size());

        // remove um dado através de comparação de valores
        list.remove("Ana");

        // remove um dado através de seu índice
        list.remove(1);

        // remove toda string s da lista que começa com 'M'
        list.removeIf(s -> s.charAt(0) == 'M');

        System.out.println("--------------------");
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("Índice de Bob: " + list.indexOf("Bob"));
        System.out.println("Índice de Marco (ñ existe): " + list.indexOf("Marco"));

        System.out.println("--------------------\nREADIÇÃO");
        list.add("Alex");
        list.add("Ana");
        for (String x : list) {
            System.out.println(x);
        }

        // converte a lista pra stream que é um tipo que aceita operações com expressões
        // lambda, aplica o filtro, converte pra List novamente e guarda o resultado em result.
        // só serão retornados os elementos que começam com o caractere A
        List<String> result = list.stream().filter(s -> s.charAt(0) == 'A').toList();
        System.out.println("--------------------\nSÓ NOMES QUE COMEÇAM COM 'A'");
        for (String x : result) {
            System.out.println(x);
        }

        // caso a condição não seja atendida é retornado NULL
        String name = result.stream().filter(s -> s.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println("--------------------\nPRIMEIRO NOME QUE COMEÇA COM 'A'");
        System.out.println(name);

        sc.close();
    }
}
