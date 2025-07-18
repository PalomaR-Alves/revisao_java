import java.util.Locale;

public class saida_dados {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // para definir pontuação usada . ou ,

        int y = 32;
        double x = 10.35784;
        String nome = "paloma";

        System.out.println(y);
        System.out.printf("%.2f\n", x); // arredonda o número
        System.out.println("eu amo java");
        System.out.println("o número é: " + x + " metros");
        System.out.printf("Testando %.5f de outra forma\n", x);

        System.out.printf("%s tem um lápis de %.2f metros com %d anos\n", nome, x, y);
    }
}