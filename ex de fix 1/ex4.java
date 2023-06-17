import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        double ipi, valor1, quant1, valor2, quant2;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite a percentagem do IPI: ");
            ipi = sc.nextDouble();

            System.out.print("Digite o valor da peça 1: ");
            valor1 = sc.nextDouble();
            System.out.print("Digite a quantidade da peça 1: ");
            quant1 = sc.nextDouble();

            System.out.print("Digite o valor da peça 2: ");
            valor2 = sc.nextDouble();
            System.out.print("Digite a quantidade da peça 2 : ");
            quant2 = sc.nextDouble();
        }

        System.out.print("O valor total a ser pago é R$ " + (((valor1 * quant1) + (valor2 * quant2)) * (ipi / 100 + 1)) + ".");
    }
}
