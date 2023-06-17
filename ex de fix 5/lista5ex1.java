import java.util.Scanner;

public class lista5ex1 {
    public static void main(String[] args) {
        int dados[] = new int[6];

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite sua idade: ");
            dados[1] = sc.nextInt();
            System.out.println("Digite quantos irmaos voce tem: ");
            dados[2] = sc.nextInt();
            System.out.println("Digite seu tamanho de calçado: ");
            dados[3] = sc.nextInt();
            System.out.println("Digite sua altura [cm]: ");
            dados[4] = sc.nextInt();
            System.out.println("Digite seu peso [kg]: ");
            dados[5] = sc.nextInt();
        }

        System.out.printf("\nIdade: %d anos.", dados[1]);
        System.out.printf("\nNumeros de irmaos: %d.", dados[2]);
        System.out.printf("\nTamanho do calçado: %d.", dados[3]);
        System.out.printf("\nAltura: %dcm.", dados[4]);
        System.out.printf("\nPeso: %dkg.", dados[5]);
    }
    
}