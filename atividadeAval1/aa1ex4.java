import java.util.Scanner;

public class aa1ex4 {
    public static void main(String[] args) {
        int[] valores = new int[35];
        int cont = 0;
        int maisum;

        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 1; i <= 30; i++) {
                System.out.printf("Digite um numero: ");
                valores[i] = sc.nextInt();
            }

            System.out.printf("Digite mais um numero qualquer: ");
            maisum = sc.nextInt();
        }
        for (int i = 1; i <= 30; i++) {
            if(valores[i] == maisum)  {
                cont++;
            }
        }

        System.out.printf("O numeros de vezes que o numero %d apareceu no vetor foi %dx.", maisum, cont);
    }
}
