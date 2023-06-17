import java.util.Scanner;

public class aa1ex1 {
    public static void main(String[] args) {
        double valor;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite o valor para fabricar o carro: ");
            valor = sc.nextFloat();
        }
        valor += (valor*0.28);
        valor += (valor*0.45);
        
        System.out.printf("\nO valor do carro, incluindo impostos é %.2f.", valor);
    }
}