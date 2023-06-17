import java.util.Scanner;

public class lista3ex5 {

    public static void main(String[] args) {
        int escolha, n1, n2;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("\n* Escolha a operação *");
            System.out.println("----------------------");
            System.out.println("    +     |     1     ");
            System.out.println("    -     |     2     ");
            System.out.println("    /     |     3     ");
            System.out.println("    *     |     4     ");
            System.out.println("----------------------");
            escolha = sc.nextInt();
            System.out.println("\nEntre o primeiro numero: ");
            n1 = sc.nextInt();
            System.out.println("Entre o segundo numero: ");
            n2 = sc.nextInt();
        }

        if (escolha == 1) {
            System.out.printf("\n%d + %d = %d", n1, n2, n1+n2);
        }
        else if (escolha == 2) {
            System.out.printf("\n%d - %d = %d", n1, n2, n1-n2);
        }
        else if (escolha == 3) {
            System.out.printf("\n%d / %d = %d", n1, n2, n1/n2);
        }
        else if (escolha == 4) {
            System.out.printf("\n%d * %d = %d", n1, n2, n1*n2);
        }
    }
}