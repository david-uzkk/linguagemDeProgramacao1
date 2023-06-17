import java.util.Scanner;

public class lista4ex3 {
    public static void main(String[] args) {
        int n, r;
        int nn = 0;
        int b = 0;
        int p = 1;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite um numero inteiro de ate 5 digitos: ");
            n = sc.nextInt();
        }

        System.out.printf("\nDecimal = %d", n);

        while (nn != n) {
            r = n % 2;
            n /= 2;
            b += r * p;
            p *= 10;
            nn++;
        }
        System.out.printf("\nBinario = %d", b);
    }
}