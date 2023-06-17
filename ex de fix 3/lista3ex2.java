import java.util.Scanner;

public class lista3ex2 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int l1, l2, l3;

            System.out.print("Digite o primeiro lado: ");
            l1 = sc.nextInt();

            System.out.print("Digite o segundo lado: ");
            l2 = sc.nextInt();

            System.out.print("Digite o terceiro lado: ");
            l3 = sc.nextInt();

            if (l1 < l2 + l3 && l2 < l1 + l3 && l3 < l1 + l2) {
                if (l1 == l2 && l2 == l3) {
                    System.out.print("\nÉ um triangulo equilatero.");
                } else if (l1 == l2 || l1 == l3 || l2 == l3) {
                    System.out.print("\nÉ um triangulo isosceles.");
                } else {
                    System.out.print("\nÉ um triangulo escaleno.");
                }
            }
            else {
                System.out.print("\nNão é um triangulo.");
            }
        }

    }
}