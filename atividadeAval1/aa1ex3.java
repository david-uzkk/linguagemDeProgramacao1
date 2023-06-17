import java.util.Scanner;

public class aa1ex3 {
    public static void main(String[] args) {
        double valorT = 0;
        double maior = 0;
        double[] valores = new double[20];

        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 1; i <= 15; i++) {
                System.out.printf("Digite o valor do produto %d: R$ ", i);
                valores[i] = sc.nextDouble();
            }
        }

        for (int i = 1; i <= 15; i++) {
            if(valores[i] > maior)  {
                maior = valores[i];
            }
            valorT += valores[i]; 
        }
        System.out.printf("\n\nO maior preço lido é R$ %.2f.", maior);
        System.out.printf("\nA media aritmética dos preços é R$ %.2f. ", valorT/15);
        System.out.printf("\nO valor total dos produtos é R$ %.2f.", valorT);


    }
}