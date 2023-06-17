import java.util.Scanner;
import java.util.Random;

public class lista4ex4 {
    public static void main(String[] args) {
        int n;
        int t = 0;
        int c = 0;

        Random r = new Random();

        do {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Digite um numero [0-99]: ");
                n = sc.nextInt();
            }
            if (n < 0 || n > 99) {
                System.out.printf("\nNumero invalido!!!\n");
            }
        } while (n < 0 || n > 99);

        while (true) {
            if (t != n) {
                t = r.nextInt(99)+1;
                c++;
            } else
                break;
        }

        System.out.printf("\nForam necessarias %d tentativas.", c);
    }
}