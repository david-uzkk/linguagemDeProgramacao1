import java.util.Scanner;

public class lista3ex3 {

    public static void main(String[] args) {
        int n1, n2, n3;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Entre o primeiro numero: ");
            n1 = sc.nextInt();
            System.out.println("Entre o segundo numero: ");
            n2 = sc.nextInt();
            System.out.println("Entre o terceiro numero: ");
            n3 = sc.nextInt();
        }
        if (n1 < n2) {
            if (n2 < n3) {
                System.out.printf("\n%d %d %d", n1, n2, n3);
            }
            else if (n1 <n3) {
                System.out.printf("\n%d %d %d", n1, n3, n2);
            }
            else {
                System.out.printf("\n%d %d %d", n3, n1, n2);
            }
        }
        else if (n2 < n3) {
            if (n1 < n3) {
                System.out.printf("\n%d %d %d", n2, n1, n3);
            }
            else{
                System.out.printf("\n%d %d %d", n2, n3, n1);
            }
        }
    
    }
}