import java.util.Scanner;

public class lista5ex5 {
    public static void main(String[] args) {
        int[][] valor1 = new int[3][3];

        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 1; i < 3; i++) {
                System.out.printf("Digite o valor %d valor do vetor %d: ", i, i);
                valor1[i][1] = sc.nextInt();
                System.out.printf("Digite o valor %d valor do vetor %d: ", i + 1, i);
                valor1[i][2] = sc.nextInt();
                System.out.printf("\n");
            }
            if (valor1[1][2] == valor1[2][1]) {
                System.out.printf("\né simetrica!");
            } else {
                System.out.printf("\nnao é simetrica!");

            }
        }
    }

}