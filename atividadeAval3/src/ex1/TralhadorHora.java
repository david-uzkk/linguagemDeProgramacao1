package ex1;

public class TralhadorHora extends Empregado{

    @Override
    public double calcularGanho() {
        return this.salarioTH(1, 10);
    }

    public TralhadorHora(String primeiroNome, String ultimoNome) {
        super(primeiroNome, ultimoNome);
    }

    public double salarioTH(double salarioHora, double horas) {
        return salarioHora * horas;
    }
}
