import java.util.InputMismatchException;
import java.util.Scanner;

public class calcularQuadrado {
    public static void main(String[] args) {
        int numero = 0;
        boolean validar;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.printf("Digite um numero: ");
            numero = sc.nextInt();
            validar = true;
        } catch (InputMismatchException e) {
            System.out.printf("Opa... Acho que você se enganou! Digite novamente...");
            validar = false;
        }

        if (validar) {
            System.out.printf("O quadrado de %d é %d.", numero, numero * numero);
        }
    }
}
