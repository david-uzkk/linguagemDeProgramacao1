import java.util.Scanner;

public class ex3defix2 {

    public static int ult(int v) {
        v = v/100;
        return v;
    }

    public static int mei(int v) {
        v = v%100;
        v = v/10;
        return v*10;
    }

    public static int pri(int v) {
        v = v%100;
        v = v%10;
        return v*100;
    }

    public static void main(String[] args) {
        int valor;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Entre com um numero: ");
            valor = sc.nextInt();
        }
        System.out.println(pri(valor)+mei(valor)+ult(valor));
    }
}