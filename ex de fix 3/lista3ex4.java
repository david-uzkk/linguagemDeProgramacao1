import java.util.Scanner;

public class lista3ex4 {

    public static void main(String[] args) {
        double n1, n2, n3, nf;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite a nota do trabalho: ");
            n1 = sc.nextDouble();
            System.out.println("Digite a nota da prova: ");
            n2 = sc.nextDouble();
            System.out.println("Digite a nota do laboratorio: ");
            n3 = sc.nextDouble();
        }

        nf = (n1*0.2)+(n2*0.5)+(n3*0.3);

        if (nf < 4){
            System.out.printf("Reprovado!");
        }
        else if (nf >= 4 || nf < 7){
            System.out.printf("Exame final!");
        }
        else if (nf >= 7){
            System.out.printf("Aprovado");
        }
    
    }
}