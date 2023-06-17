import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        double valor;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite o valor do premio: ");
            valor = sc.nextDouble();
        }

        System.out.print("Valor do premio da sena: R$ " + (valor*0.6) + ".");
        System.out.print("\nValor do premio da quina: R$ " + (valor*0.3) + ".");
        System.out.print("\nValor do premio da quadra: R$ " + (valor*0.1) + ".");
    }
}