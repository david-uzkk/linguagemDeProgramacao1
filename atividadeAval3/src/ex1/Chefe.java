package ex1;

public class Chefe extends Empregado{

    @Override
    public double calcularGanho() {
        return this.salarioMensal(10);
    }

    public Chefe(String primeiroNome, String ultimoNome) {
        super(primeiroNome, ultimoNome);
    }

    public double salarioMensal (double salarioSemanal){
        return salarioSemanal * 4;
    }
}
