import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        double valor;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite o valor da conta: ");
            valor = sc.nextDouble();
        }

        System.out.print("Valor da conta com a taxa do garçon é R$ " + (valor + (valor*0.1)) + ".");
    }
}
