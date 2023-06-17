import java.util.Scanner;

public class ex4defix2 {

    public static float sum(float x, float y) {
        return x + y;
    }
    public static float sub(float x, float y) {
        return x - y;
    }
    public static float mul(float x, float y) {
        return x * y;
    }
    public static float div(float x, float y) {
        return x / y;
    }

    public static void main(String[] args) {
        float a, b;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Entre com um numero: ");
            a = sc.nextInt();
            System.out.println("Entre com outro numero: ");
            b = sc.nextInt();
        }
        System.out.printf("\n%.0f + %.0f = %.1f", a, b, sum(a, b));
        System.out.printf("\n%.0f - %.0f = %.1f", a, b, + sub(a, b));
        System.out.printf("\n%.0f * %.0f = %.1f", a, b, mul(a, b));
        System.out.printf("\n%.0f / %.0f = %.1f", a, b, div(a, b));
    }
}