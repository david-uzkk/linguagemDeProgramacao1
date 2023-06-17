package exdefix7.ex2;

import java.util.Scanner;

public class inserirQuantidade {
    protected int quantidade;

    public void inseriraQuantidade(int quantidade){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite a quantidade de equipamentos que o caminhao vai carregar: ");
            quantidade = sc.nextInt();
        }
    }
    public int inseriraPluvimetro(int beta,int alfa){
        if (quantidade > 5000){
            return beta;
        }
        else return alfa;
    }
}
