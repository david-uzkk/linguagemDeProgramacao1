import java.util.Scanner;

public class aa1ex2 {
    public static void main(String[] args) {
        int gol1, gol2;
        String time1, time2;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.printf("Digite o nome do time 1: ");
            time1 = sc.next();
            System.out.printf("\nDigite quantos gols o time 1 fez: ");
            gol1 = sc.nextInt();
            System.out.printf("\n\nDigite o nome do time 2: ");
            time2 = sc.next();
            System.out.printf("\nDigite quantos gols o time 2 fez: ");
            gol2 = sc.nextInt();
        }

        if (gol1 > gol2) {
            System.out.printf("\nTime %s GANHOU!!!", time1);
        }
        else if (gol2 > gol1) {
            System.out.printf("\nTime %s GANHOU!!!", time2);
        }
        else {
            System.out.printf("\nFoi EMPATE.", time2);
        }
    }
}
