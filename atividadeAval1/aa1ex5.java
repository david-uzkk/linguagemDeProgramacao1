import java.util.Scanner;

public class aa1ex5 {
    public static void main(String[] args) {
        int linha, coluna, decisao;
        int cont = 0;
        int v[][] = new int[6][5];

        try (Scanner sc = new Scanner(System.in)) {
            for (int j = 0; j < 4; j++) {
                for (int i = 0; i < 5; i++) {
                    System.out.printf("Digite o valor da linha %d coluna %d: ", i + 1, j + 1);
                    v[i][j] = sc.nextInt();
                }
                System.out.printf("\n");
            }

            System.out.printf("\nVoce deseja somar linha ou somar coluna?\n");
            System.out.printf("Linha = 0           |         Coluna = 1\n");
            decisao = sc.nextInt();

            if (decisao == 0) {
                System.out.printf("Digite a linha que deseja somar: ");
                linha = sc.nextInt();
                linha -= 1;

                for (int i = 0; i < 4; i++) {
                    cont += v[linha][i];
                }
                System.out.printf("\n\nA soma da linha %d é %d.", linha+1, cont);
            } else {
                System.out.printf("Digite a coluna que deseja somar: ");
                coluna = sc.nextInt();
                coluna -= 1;

                for (int i = 0; i < 5; i++) {
                    cont += v[i][coluna];
                }
                System.out.printf("\n\nA soma da coluna %d é %d!", coluna+1, cont);
            }
        }
    }
}
