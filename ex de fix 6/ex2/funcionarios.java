package ex2;

public class funcionarios {
    public String departamento;
    public String nome;
    public String data;
    public double salario;
    public double rg;
    public double aumento;
    public double porAumento;
    public double anual;

    public void recebeAumento() {
        this.aumento = this.salario + (this.salario*this.porAumento);
        System.out.printf("\nO valor do salario depois aumento fica R$ %.2f", this.aumento);
    }

    public void calculaGanhoAnual() {
        this.anual = this.salario*12;
        System.out.printf("\nO valor do salario anul é R$ %.2f", this.anual);
    }
    
    public static void main(String[] args) {

        funcionarios func1 = new funcionarios();
        func1.departamento = "CG3010333";
        func1.nome = "David";
        func1.salario = 1000;
        func1.porAumento = 0.1;
        func1.data = "30/08/2014";
        func1.rg = 502458456;
        func1.recebeAumento();
        func1.calculaGanhoAnual();
    }
}