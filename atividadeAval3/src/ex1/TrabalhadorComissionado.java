package ex1;

public class TrabalhadorComissionado extends Empregado{

    @Override
    public double calcularGanho() {
        return this.salarioTC(10, 5, 2);
    }

    public TrabalhadorComissionado(String primeiroNome, String ultimoNome) {
        super(primeiroNome, ultimoNome);
    }

    public double salarioTC(double salario, double comissao, double quantidade) {
        return salario + (comissao * quantidade);
    }
}
