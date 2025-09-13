package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MainExcecao {
    public static void main(String[] args) {
        File file = new File("C:\\temp\\in.txt");
        Scanner sc = null;

        // tenta rodar o bloco de código
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e) { // captura uma possível exceção levantada durante execução
            System.out.println("Error opening file: " + e.getMessage());
        }
        finally { // executa bloco finally independente se foi ou não gerada alguma exceção
            if (sc != null) {
                sc.close();
            }
        }
    }
}
