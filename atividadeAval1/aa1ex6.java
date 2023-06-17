import java.util.Scanner;

public class aa1ex6 {
    public static void main(String[] args) {
        boolean cond;
        int cont = 0;
        int[] numeroPlaca = new int[50];
        String[] letraPlaca = new String[50];
        String[] nomeProprie = new String[50];
        String[] tipoAuto = new String[50];
        String[] mes = new String[50];
        String test = "Automovel";

        try (Scanner sc = new Scanner(System.in)) {
            do {

                System.out.printf("Deseja adiocionar um novo veiculo a lista? [true | false]\n");
                cond = sc.nextBoolean();

                if (cond) {
                    System.out.printf("\nDigite as letras da placa: ");
                    letraPlaca[cont] = sc.next();
                    System.out.printf("Digite as numeros da placa: ");
                    numeroPlaca[cont] = sc.nextInt();
                    System.out.printf("Digite o tipo: ");
                    tipoAuto[cont] = sc.next();
                    System.out.printf("Digite o nome do proprietario: ");
                    nomeProprie[cont] = sc.next();
                    cont++;
                    System.out.printf("\n");
                }

            } while (cond);

            for (int i = 0; i < cont; i++) {
                if ( tipoAuto[i].equals(test)) {
                    if (numeroPlaca[i] % 10 == 1) {
                        mes[i] = "Abril";
                    } else if (numeroPlaca[i] % 10 == 2) {
                        mes[i] = "Ate Maio";
                    } else if (numeroPlaca[i] % 10 == 3) {
                        mes[i] = "Ate Junho";
                    } else if (numeroPlaca[i] % 10 == 4) {
                        mes[i] = "Ate Julho";
                    } else if (numeroPlaca[i] % 10 == 5 || numeroPlaca[i] % 10 == 6) {
                        mes[i] = "Ate Agosto";
                    } else if (numeroPlaca[i] % 10 == 6) {
                        mes[i] = "Ate Agosto";
                    } else if (numeroPlaca[i] % 10 == 7) {
                        mes[i] = "Ate Setembro";
                    } else if (numeroPlaca[i] % 10 == 8) {
                        mes[i] = "Ate Outubro";
                    } else if (numeroPlaca[i] % 10 == 9) {
                        mes[i] = "Ate Novembro";
                    } else if (numeroPlaca[i] % 10 == 0) {
                        mes[i] = "Ate Dezembro";
                    }
                } else {
                    if (numeroPlaca[i] % 10 == 1 || numeroPlaca[i] % 10 == 2) {
                        mes[i] = "Ate Setembro";
                    } else if (numeroPlaca[i] % 10 == 3 || numeroPlaca[i] % 10 == 4 || numeroPlaca[i] % 10 == 5) {
                        mes[i] = "Ate Outubro";
                    } else if (numeroPlaca[i] % 10 == 6 || numeroPlaca[i] % 10 == 7 || numeroPlaca[i] % 10 == 8) {
                        mes[i] = "Ate Novembro";
                    } else if (numeroPlaca[i] % 10 == 9 || numeroPlaca[i] % 10 == 0) {
                        mes[i] = "Ate Dezembro";
                    }
                }
            }

            System.out.printf(" PLACA     | TIPO         | NOME DO PROPRIETARIO | MES DO LICENCIAMENTO\n");
            System.out.printf("-----------------------------------------------------------------------\n");
            for (int i = 0; i < cont; i++) {
                if(cont == 0){
                    break;
                }
                System.out.printf(" %s %-6d| %-13s| %-21s| %-20s\n", letraPlaca[i], numeroPlaca[i], tipoAuto[i],
                        nomeProprie[i], mes[i]);
            }
        }
    }
}
