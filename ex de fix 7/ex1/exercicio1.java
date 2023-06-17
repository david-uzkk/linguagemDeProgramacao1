package exdefix7.ex1;

import java.util.Scanner;

public class exercicio1 {

    private int quant;
    int numeroEquipamentos [] = new int[quant];
    int mesdeCompra [] = new int[quant];

    public void Equipamento() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Entre com o numero de equipamentos");
            quant = sc.nextInt();
        }
    }

    public int getnumeroEqiequipamentos() {
        return quant;
    }

    public int getValor(int numEqui) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Entre com o numero do equipamento: ");
            numEqui = sc.nextInt();
        }
        return numeroEquipamentos[numEqui];
    }

    public void setValor(int numEqui, int valor) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Entre com o numero do equipamento: ");
            numEqui = sc.nextInt();
            System.out.println("Entre com o valor do equipamento: ");
            valor = sc.nextInt();
            numeroEquipamentos[numEqui] = valor;
        }
    }

    public int getMesCompra(int numEqui) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Entre com o numero do equipamento: ");
            numEqui = sc.nextInt();
        }
        return mesdeCompra[numEqui];
    }

    public void setMesCompra(int numEqui, int mes) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Entre com o numero do equipamento: ");
            numEqui = sc.nextInt();
            System.out.println("Entre com o mes de compra do equipamento: ");
            mes = sc.nextInt();
        }
        mesdeCompra [numEqui] = mes;
    }
    
}
