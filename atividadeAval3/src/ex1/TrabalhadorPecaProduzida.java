package ex1;

public class TrabalhadorPecaProduzida extends Empregado{

    @Override
    public double calcularGanho() {
        return this.salarioTPP(10, 1);
    }

    public TrabalhadorPecaProduzida(String primeiroNome, String ultimoNome) {
        super(primeiroNome, ultimoNome);
        
    }

    public double salarioTPP(double remuneracão, double quantidade) {
        return remuneracão * quantidade;
    }
}
