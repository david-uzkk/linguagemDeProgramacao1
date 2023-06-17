import java.util.Scanner;

public class lista5ex2 {
    public static void main(String[] args) {
        int[] pontos1 = new int[11];
        int[] pontos2 = new int[11];

        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 1; i < 11; i++) {
                System.out.printf("\n\nJOGO %d\n", i);
                System.out.printf("Digite o pontos do time 1: ");
                pontos1[i] = sc.nextInt();
                System.out.printf("Digite o pontos do time 2: ");
                pontos2[i] = sc.nextInt();
            }
        }
    }

}