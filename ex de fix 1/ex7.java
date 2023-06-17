import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        double j, c, i, t, imovel;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite o valor do imovel: R$ ");
            imovel = sc.nextDouble();
            System.out.print("Digite o valor do capital inicial investido: R$ ");
            c = sc.nextDouble();
            System.out.print("Digite a taxa de juros: ");
            i = sc.nextDouble();
            System.out.print("Digite o tempo da aplicação: ");
            t = sc.nextDouble();
        }

        j = (c*i)*t;

        System.out.print("O valor total a ser pago no imovel é R$ " + imovel*j + ".");
    }
}
