public class casting {
    public static void main(String[] args) {

        // caso 1: divisão de inteiros com resultado double
        int a, b;
        double result;

        a = 5;
        b = 2;

        result = (double) a/b; // sem (double) a parte decimal não é armazenada

        System.out.println(result);

        // caso 2: conversão de double para inteiro
        double x;
        int y;

        x = 5.0;
        y = (int) x;
        /* sem (int) o compilador reclama de type mismatch
           ele entende que de double para int pode haver
           perda de informação */

        System.out.println(y);
    }
}
