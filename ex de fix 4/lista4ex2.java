public class lista4ex2 {
    public static void main(String[] args) {
        int i, p, x, c = 0;

        System.out.printf("Os numeros primos entre 5.000 e 7.000 sao: \n");

        for (i = 5000; i <= 7000; i++) {
            p = 1;
            for (x = 2; x < i; x++) {
                if (i % x == 0) {
                    p = 0;
                }
            }
            if (p == 1) {
                System.out.printf("%d ", i);
                c++;
                if (c % 33 == 0)
                System.out.printf("\n");
            }
        }
    }
}