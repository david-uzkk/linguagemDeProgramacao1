import java.util.Scanner;

public class lista5ex4 {
    public static void main(String[] args) {
        int[] valor1 = new int[5];
        int[] valor2 = new int[5];

        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 1; i < 4; i++) {
                System.out.printf("Digite o valor %d valor do vetor 1: ", i );
                valor1[i] = sc.nextInt();
                System.out.printf("Digite o valor %d valor do vetor 2: ", i);
                valor2[i] = sc.nextInt();
                System.out.printf("\n", i);
            }

            for (int i = 1; i < 4; i++) {
                if (valor1[i] == valor2[i]) {
                    System.out.printf("\nO valor %d é igual!", i);
                }  
                else {
                    System.out.printf("\nO valor %d nao é igual!", i);
                }
            }
        }
    }

}