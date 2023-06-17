import java.util.Scanner;

public class ex6defix2 {

    public static double imc(double x, double y) {
        return x / (y*y);
    }

    public static void main(String[] args) {
        double p, a;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Qual o peso [kg]? ");
            p = sc.nextDouble();
            System.out.println("Qual a altura [m]? ");
            a = sc.nextDouble();
        }
        System.out.printf("\nIMC = %.2f\n\n", imc(p,a));

        System.out.println("----------------------------------------------------");
        System.out.println("Condicao             Mulheres          Homens       ");
        System.out.println("----------------------------------------------------");
        System.out.println("abaixo do peso     < 19.1            < 20.7         ");
        System.out.println("peso normal          19.1 - 25.8       20.7 - 26.4  ");
        System.out.println("acima do peso        25.8 - 32.3       26.4 - 31.1  ");
        System.out.println("obeso              > 32.3            > 31.1         ");
        System.out.println("----------------------------------------------------");
    }
}