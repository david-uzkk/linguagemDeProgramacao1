import java.util.Scanner;

public class ex1defix2 {

    public static double calc(double x, double y) {
        return x * y;
    }

    public static void main(String[] args) {
        double g5 = 0.05, g10 = 0.1, g20 = 0.2, valor;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Entre com o valor em kg de ouro: R$ ");
            valor = sc.nextDouble();
        }
        System.out.printf("\n5 g: R$ %.2f\n", calc(valor, g5));
        System.out.printf("10 g: R$ %.2f\n", calc(valor, g20));
        System.out.printf("20 g: R$ %.2f", calc(valor, g10));
    }
}