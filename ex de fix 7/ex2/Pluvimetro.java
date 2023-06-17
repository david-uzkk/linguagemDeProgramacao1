package exdefix7.ex2;

import java.util.Scanner;

public class Pluvimetro {
    protected String tipo;

    public void Pluviometro (String tipo){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite o tipo de equipamento: ");
            tipo = sc.next();
        }
    }
    public String getTipo(){
        return tipo;

    }
    public int getPeso(int peso){
        return peso;
    }
    public int getCapacidade(int capacidade){
        return capacidade;
    }

    
}
