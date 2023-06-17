package ex3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DecimalFormat;

public class vendasLojas {
    public static String USER_DIR = System.getProperty("user.dir") + "\\src\\ex3";
    public static String SEPARATOR = System.getProperty("file.separator");
    File file;
    public String test = "";
    public String loja1 = "";
    public double[] l1 = new double[10];
    public String loja2 = "";
    public double[] l2 = new double[10];
    public String loja3 = "";
    public double[] l3 = new double[10];
    public String loja4 = "";
    public double[] l4 = new double[10];
    double valorf1;
    double valorf2;
    double valorf3;
    double valorf4;

    public void lerArquivo() {
        try {
            FileReader leitor = new FileReader(USER_DIR + SEPARATOR + "\\vendasFiliais.txt");
            try (BufferedReader bfr = new BufferedReader(leitor)) {
                loja1 += bfr.readLine() + "\n" + bfr.readLine();
                loja1 = loja1.replaceAll("1,", "");
                loja3 += bfr.readLine() + "\n";
                loja3 = loja1.replaceAll("3,", "");
                loja4 += bfr.readLine() + "\n";
                loja4 = loja4.replaceAll("4,", "");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            FileReader leitor = new FileReader(USER_DIR + SEPARATOR + "\\vendasFiliais.txt");
            try (BufferedReader bfr = new BufferedReader(leitor)) {
                test = bfr.readLine() + "\n";
                test = test.replaceAll("1,", "");
                l1 [0] = Double.parseDouble (test);
                test = bfr.readLine();
                test = test.replaceAll("1,", "");
                l1 [1] = Double.parseDouble (test);
                test = bfr.readLine();
                test = test.replaceAll("3,", "");
                l3 [0] = Double.parseDouble (test);
                test = bfr.readLine();
                test = test.replaceAll("4,", "");
                l4 [0] = Double.parseDouble (test);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void criarArquivos() {
        try {
            for (int i = 1; i <= 4; i++) {
                File file = new File(USER_DIR + SEPARATOR + "filial" + i + ".txt");
                file.createNewFile();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void ValorFinal() {
        valorf1 += l1 [0] + l1 [1];
        loja1 += "\n" + "R$ " + String.valueOf(valorf1);
        valorf2 += 0;
        loja2 += "\n" + "R$ " + String.valueOf(valorf2);
        valorf3 += l3 [0];
        loja3 += "\n" + "R$ " + String.valueOf(valorf3);
        valorf4 += l4 [0];
        loja4 += "R$ " + String.valueOf(valorf4);
    }

    public void escreverVendas() {
        try {
            FileWriter escrever = new FileWriter(USER_DIR + "\\filial1.txt");
            BufferedWriter bfw = new BufferedWriter(escrever);
            String tmp = "";
            tmp = this.loja1;
            bfw.write(tmp);
            bfw.close();
            escrever.close();
        } catch (Exception e) {
            e.getMessage();
        }

        try {
            FileWriter escrever = new FileWriter(USER_DIR + "\\filial2.txt");
            BufferedWriter bfw = new BufferedWriter(escrever);
            String tmp = "";
            tmp = this.loja2;
            bfw.write(tmp);
            bfw.close();
            escrever.close();
        } catch (Exception e) {
            e.getMessage();
        }

        try {
            FileWriter escrever = new FileWriter(USER_DIR + "\\filial3.txt");
            BufferedWriter bfw = new BufferedWriter(escrever);
            String tmp = "";
            tmp = this.loja3;
            bfw.write(tmp);
            bfw.close();
            escrever.close();
        } catch (Exception e) {
            e.getMessage();
        }

        try {
            FileWriter escrever = new FileWriter(USER_DIR + "\\filial4.txt");
            BufferedWriter bfw = new BufferedWriter(escrever);
            String tmp = "";
            tmp = this.loja4;
            bfw.write(tmp);
            bfw.close();
            escrever.close();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void escreverValorTotal() {
        System.out.println("Filial 1: R$ " + valorf1);
        System.out.println("Filial 2: R$ " + valorf2);
        System.out.println("Filial 3: R$ " + valorf3);
        System.out.println("Filial 4: R$ " + valorf4);
    }


    public static void main(String[] args) throws Exception {

        vendasLojas v = new vendasLojas();
        v.lerArquivo();
        v.criarArquivos();
        v.ValorFinal();
        v.escreverVendas();
        v.escreverValorTotal();
    }
}
