package ex1;

public class calc {
    public String matricula;
    public String nome;
    public double notaP1;
    public double notaP2;
    public double notaT;
    public double nFinal;

    public void nMedia() {
        this.notaT = (notaP1*0.25) + (notaP2*0.25) + (notaT*0.20);
    }

    public void nFinal() {
        this.nFinal = ((notaP1*0.25) + (notaP2*0.25) + (notaT*0.20));
        if (this.nFinal < 4) {
            System.out.printf("Falta %.1f para a prova final.", 4 - this.nFinal);
        }
        else {
            System.out.printf("Falta 0 para a provra final. %f");
        }
    }
    
    public static void main(String[] args) {

        calc aluno1 = new calc();
        aluno1.matricula = "CG3010333";
        aluno1.nome = "David";
        aluno1.notaP1 = 2;
        aluno1.notaP2 = 2;
        aluno1.notaT = 2;
        aluno1.nFinal();
    }
}
