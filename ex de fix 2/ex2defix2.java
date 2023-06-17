import java.util.Scanner;

public class ex2defix2 {

    public static double ant(double x, double y) {
        return x - y;
    }

    public static double suc(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        double padrao = 1, valor;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Entre com um numero: ");
            valor = sc.nextDouble();
        }
        System.out.println("Antecessor: " + ant(valor, padrao));
        System.out.println("Sucessor:  " + suc(valor, padrao));
    }
}