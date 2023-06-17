package ex4;

public class data {
    public int dia;
    public int mes;
    public int ano;
    public int cdia;
    public int cmes;
    public int cano;
    public String mesS;
    public String dataR;

    public void construtor() {
        System.out.printf("\n%d/%d/%d", dia, mes, ano);
        if(this.dia < 0 || this.dia > 30) {
            System.out.printf("\nDia errado!");
        }
        else{
            System.out.printf("\nDia certo!");
        }
        if(this.dia < 0 || this.dia > 12) {
            System.out.printf("\nMes errado!");
        }
        else{
            System.out.printf("\nMes certo!");
        }
        if(this.dia < 0) {
            System.out.printf("\nAno errado!");
        }
        else{
            System.out.printf("\nAno certo!");
        }
    }

    public void compara() {
        if (cano == ano){
            System.out.printf("\n\n0");
        }
        else if (cano > ano){
            System.out.printf("\n\n1");
        }
        else{
            System.out.printf("\n\n-1");
        }
    }

    public void getDia() {
        System.out.printf("\n\nDia: %d", this.dia);
    }

    public void getMes() {
        System.out.printf("\n\nMes: %d", this.mes);
    }

    public void getMesExtenso() {
        if (this.mes == 1){
            System.out.printf("\n\nMes: Janeiro");
        }
        else if (this.mes == 2){
            System.out.printf("\n\nMes: Fevereiro");
        }
        else if (this.mes == 3){
            System.out.printf("\n\nMes: Março");
        }
        else if (this.mes == 4){
            System.out.printf("\n\nMes: Abril");
        }
        else if (this.mes == 5){
            System.out.printf("\n\nMes: Maio");
        }
        else if (this.mes == 6){
            System.out.printf("\n\nMes: Junho");
        }
        else if (this.mes == 7){
            System.out.printf("\n\nMes: Julho");
        }
        else if (this.mes == 8){
            System.out.printf("\n\nMes: Agosto");
        }
        else if (this.mes == 9){
            System.out.printf("\n\nMes: Setembro");
        }
        else if (this.mes == 10){
            System.out.printf("\n\nMes: Outubro");
        }
        else if (this.mes == 11){
            System.out.printf("\n\nMes: Novembro");
        }
        else if (this.mes == 12){
            System.out.printf("\n\nMes: Dezembro");
        }
    }

    public void getAno() {
        System.out.printf("\n\nAno: %d", this.ano);
    }

    public void isBissexto() {
       if(this.ano / 1000 == 0){
        System.out.printf("\n\ntrue");
       }
       else{
        System.out.printf("\n\nfalse");
       }
    }

    public void cloneR() {
        System.out.printf("\n\n%d/%d/%d", dia, mes, ano);
    }
    public static void main(String[] args) {

        data aluno1 = new data();
        aluno1.dia = 30;
        aluno1.mes = 8;
        aluno1.ano = 2001;
        aluno1.dia = 30;
        aluno1.mes = 8;
        aluno1.ano = 2001;
        aluno1.construtor();
        aluno1.compara();
        aluno1.getDia();
        aluno1.getMes();
        aluno1.getMesExtenso();
        aluno1.getAno();
        aluno1.isBissexto();
        aluno1.cloneR();
    }
}
