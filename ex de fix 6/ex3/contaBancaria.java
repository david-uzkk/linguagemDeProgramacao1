package ex3;

public class contaBancaria {
    public String conta;
    public double saldo;
    public double retirar;
    public double valorDep;

    public void extrato() {
        System.out.printf("\nCONTA %s", this.conta);
        System.out.printf("\nSaldo: %.2f\n", this.saldo);
    }

    public void saque() {
        this.saldo = this.saldo - this.retirar;
        System.out.printf("\nSaldo: %.2f\n", this.saldo);
    }

    public void deposito() {
        this.saldo = this.saldo + this.valorDep;
        System.out.printf("\nSaldo: %.2f\n", this.saldo);
    }
    public static void main(String[] args) {

        contaBancaria aluno1 = new contaBancaria();
        aluno1.conta = "85114 14145 1154";
        aluno1.saldo = 1000;
        aluno1.retirar = 500;
        aluno1.valorDep = 250;
        aluno1.extrato();
        aluno1.saque();
        aluno1.deposito();
    }
}
