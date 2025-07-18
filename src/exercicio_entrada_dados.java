import java.util.Locale;
import java.util.Scanner;

public class exercicio_entrada_dados {
    public static void main(String[] args){

        // exercicios de https://github.com/acenelio/nivelamento-java/tree/master/src

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Ex. 1
        /*
        int a, b, sum;

        a = sc.nextInt();
        b = sc.nextInt();

        sum = a + b;
        System.out.println("SOMA = " + sum);
        */

        // Ex. 2
        /*
        int radius;
        double area, pi;
        pi = 3.14159;

        radius = sc.nextInt();

        area = pi * Math.pow(radius, 2);
        System.out.printf("A = %.4f", area);
        */

        // Ex. 3
        /*
        int x, y, z, w;
        double diferenca;

        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        w = sc.nextInt();

        diferenca = ((x*y)-(z*w));
        System.out.println("DIFERENCA = " + diferenca);
        */

        // Ex. 4
        /*
        int num_emp, wkd_hours;
        double value_ph, salary;

        num_emp = sc.nextInt();
        wkd_hours = sc.nextInt();
        value_ph = sc.nextDouble();

        salary = wkd_hours * value_ph;
        System.out.println("NUMBER = " + num_emp);
        System.out.println("SALARY = U$ " + salary);
        */

        // Ex. 5
        /*
        int pcode1, pnumber1, pcode2, pnumber2;
        double pvalue1, pvalue2, total_value;

        // peça 1
        pcode1 = sc.nextInt();
        pnumber1 = sc.nextInt();
        pvalue1 = sc.nextDouble();

        total_value = pnumber1 * pvalue1;

        // peça 2
        pcode2 = sc.nextInt();
        pnumber2 = sc.nextInt();
        pvalue2 = sc.nextDouble();

        total_value += (pnumber2 * pvalue2);

        System.out.printf("VALOR A PAGAR: R$ %.2f", total_value);
         */

        // Ex. 6

        double f, g, h, pi, triangulo, circulo, trapezio, quadrado, retangulo;
        pi = 3.14159;

        f = sc.nextDouble();
        g = sc.nextDouble();
        h = sc.nextDouble();

        triangulo = (f * h) / 2;
        circulo = pi * Math.pow(h, 2);
        trapezio = ((f + g) * h) / 2;
        quadrado = Math.pow(g, 2);
        retangulo = f * g;

        System.out.printf("TRIANGULO: %.3f\n", triangulo);
        System.out.printf("CIRCULO: %.3f\n", circulo);
        System.out.printf("TRAPEZIO: %.3f\n", trapezio);
        System.out.printf("QUADRADO: %.3f\n", quadrado);
        System.out.printf("RETANGULO: %.3f\n", retangulo);

        sc.close();

    }
}
