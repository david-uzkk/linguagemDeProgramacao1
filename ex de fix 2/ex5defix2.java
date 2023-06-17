import java.util.Scanner;

public class ex5defix2 {

    public static float resto(float a, float b, float c, float d1, float d2, float e) {
        return (((a + b + c + d1 + d2 - 2) * e) % 7);
    }

    public static float trunca(float a) {
        return (float) ((2.6 * a) - 0.1);
    }

    public static float quociente(float a, float b) {
        return (a % b);
    }

    public static void main(String[] args) {
        float d, m, a, s, semana, quatro = 4;

        System.out.println("Codigo para dizer dia da semana.\n\n");

        /*
        System.out.println("*------MES-------*");
        System.out.println("|================|");
        System.out.println("| 1 |  MARCO     |");
        System.out.println("| 2 |  ABRIL     |");
        System.out.println("| 3 |  MAIO      |");
        System.out.println("| 4 |  JUNHO     |");
        System.out.println("| 5 |  JULHO     |");
        System.out.println("| 6 |  AGOSTO    |");
        System.out.println("| 7 |  SETEMBRO  |");
        System.out.println("| 8 |  OUTUBRO   |");
        System.out.println("| 9 |  NOVEMBRO  |");
        System.out.println("| 10|  DEZEMBRO  |");
        System.out.println("| 11|  JANEIRO   |");
        System.out.println("| 12|  FEVEREIRO |");
        System.out.println("|================|\n");
        */

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite o dia: ");
            d = sc.nextFloat();
            System.out.println("Digite o mes: ");
            m = sc.nextFloat();
            System.out.println("Digite os primeiros dois digitos do ano: ");
            s = sc.nextFloat();
            System.out.println("Digite os ultimos dois digitos do ano: ");
            a = sc.nextFloat();
        }

        semana = resto(trunca(m),d,a,quociente(a,quatro),quociente(s,quatro),s);

        System.out.println("O dia da semana é " + semana + ".");

        /*
        System.out.println("\n*-----SEMANA-----*");
        System.out.println("|================|");
        System.out.println("| 0 |  DOMINGO   |");
        System.out.println("| 1 |  SEGUNDA   |");
        System.out.println("| 2 |  TERCA     |");
        System.out.println("| 3 |  QUARTA    |");
        System.out.println("| 4 |  QUINTA    |");
        System.out.println("| 5 |  SEXTA     |");
        System.out.println("| 6 |  SABADO    |");
        System.out.println("|================|"); 
        */
    }
}