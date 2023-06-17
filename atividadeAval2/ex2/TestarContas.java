package ex2;

public class TestarContas {
    public static void main(String[] args) {
         Conta c = new Conta();
         ContaCorrente cC = new ContaCorrente();
         ContaPoupanca cP = new ContaPoupanca();
         c.deposita(500);
         cC.deposita(500);
         cP.deposita(500);
         c.atualiza(0.5);
         cC.atualiza(0.5);
         cP.atualiza(0.5);
         System.out.println(c.getSaldo());
         System.out.println(cC.getSaldo());
         System.out.println(cP.getSaldo());
    }
}
