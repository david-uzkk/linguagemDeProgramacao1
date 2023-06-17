package ex2;

public class Conta {
    public double saldo;

    public double getSaldo() {
        return this.saldo;
    }

    public void deposita(int i) {
        this.saldo += i;
    }

    public void saca(Double valor) {
        this.saldo -= valor;
    }

    public void atualiza(Double taxa) {
        this.saldo += this.saldo * taxa;
    }
}
