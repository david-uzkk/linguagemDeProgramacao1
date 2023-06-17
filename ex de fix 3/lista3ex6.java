import java.util.Scanner;
import java.util.Random;

public class lista3ex6 {

    public static void main(String[] args) {
        int pessoa;

        Random random = new Random(); 
        int maquina = random.nextInt(2);   

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("\n*      ESCOLHA    *");
            System.out.println("------------------");
            System.out.println("  PEDRA   |   0   ");
            System.out.println("  PAPEL   |   1   ");
            System.out.println("  TESOURA |   2   ");
            System.out.println("------------------");
            pessoa = sc.nextInt();
        }

        if(maquina == 0) {
            System.out.println("\nO computador escolheu PEDRA!\n");
            if(pessoa == 0) {
                System.out.println("Empate!");
            }
            else if(pessoa == 1) {
                System.out.println("Você Ganhou!");
            } 
            else if(pessoa == 2) {
                System.out.println("Você perdeu!");
            }
        }
        if(maquina == 1) {
            System.out.println("\nO computador escolheu PAPEL!\n");
            if(pessoa == 0) {
                System.out.println("Você perdeu!");
            }
            else if(pessoa == 1) {
                System.out.println("Empate!");
            } 
            else if(pessoa == 2) {
                System.out.println("Você ganhou!");
            }
        }
        if(maquina == 2) {
            System.out.println("\nO computador escolheu TESOURA!\n");
            if(pessoa == 0) {
                System.out.println("Você Ganhou!");
            }
            else if(pessoa == 1) {
                System.out.println("Você perdeu!");
            } 
            else if(pessoa == 2) {
                System.out.println("Empate!");
            }
        }

    
    }
}