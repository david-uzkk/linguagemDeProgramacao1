import java.util.Scanner;

public class lista4ex5 {
    public static void main(String[] args) {
        int ini, fin, pas;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite o valor inicial: ");
            ini = sc.nextInt();
            System.out.println("Digite o valor final: ");
            fin = sc.nextInt();
            System.out.println("Digite Digite o passo [1]: ");
            pas = sc.nextInt();
        }

        System.out.printf("");

        do {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.printf("%d ", (ini-1)+pas);
            }
            pas++;
            fin--;
        } while (ini <= fin);
    }
}