import java.util.Scanner;

public class lista4ex1 {
    public static void main(String[] args) {
        int n, s = 0, d = 1;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite o numero: ");
            n = sc.nextInt();

            while (d < n) {
                if (n % d == 0) {
                    s = d + s;
                    d++;
                } else
                    d++;
            }

            if (n == s) {
                System.out.printf("\nO numero %d e' perfeito!", n);
            } else {
                System.out.printf("\nO numero %d nao e' perfeito!", n);
            }
        }
    }
}