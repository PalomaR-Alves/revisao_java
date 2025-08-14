package sequencial;

public class funcoes_string {
    public static void main(String[] args) {
        String original = " abcde FGHIJ ABC abc DEFG     ";

        // 1
        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(3); // recorta string a partir do index 3
        String s05 = original.substring(3, 9); // recorta string entre intervalo de indexes (inclusivos)
        String s06 = original.replace('a', 'x'); // troca a por x
        String s07 = original.replace("abc", "xy");
        int i = original.indexOf("bc"); // index da primeira ocorrencia da string "bc"
        int j = original.lastIndexOf("bc"); // index da ultima ocorrencia da string "bc"
        System.out.println("ORIGINAL: " + "-" + original + "-");
        System.out.println("MINUSCULA toLowerCase(): "+ "-" + s01 + "-");
        System.out.println("MAIUSCULA toUpperCase();: " + "-" + s02 + "-");
        System.out.println("SEM ESPAÇOS (inicio e fim) trim(): " + "-" + s03 + "-");
        System.out.println("SUBSTRING substring(3): " + "-" + s04 + "-");
        System.out.println("SUBSTRING (intervalo) substring(3, 9): " + "-" + s05 + "-");
        System.out.println("REPLACE replace('a', 'x'): " + "-" + s06 + "-");
        System.out.println("REPLACE replace(\"abc\", \"xy\"): " + "-" + s07 + "-");
        System.out.println("INDEX OF indexOf(\"bc\"): " + i);
        System.out.println("INDEX OF lastIndexOf(\"bc\"): " + j);

        System.out.println();

        // 2
        String s = "potato apple lemon";
        String[] vect = s.split(" "); // reparte strings a cada espaço em branco
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);

    }
}
