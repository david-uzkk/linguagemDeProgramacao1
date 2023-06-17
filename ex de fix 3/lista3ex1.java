import java.util.Scanner;

public class lista3ex1 {
    
    static int resto(int a, int b, int c, int d1, int d2, int e){
        return(((a+b+c+d1+d2-2)*e)%7);
    }
    
    static int trunca(int a){
        return (int) ((2.6*a)-0.1);
    }
    
    static int quociente(int a, int b){
        return (a%b);
    }

    public static void main(String[] args) {

	    int d, m, a, s, semana;
        int q = 4;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite o dia: ");
            d = sc.nextInt();
            System.out.println("Digite o mes: ");
            m = sc.nextInt();
            System.out.println("Digite os primeiros dois digitos do ano: ");
            s = sc.nextInt();
            System.out.println("Digite os ultimos dois digitos do ano: ");
            a = sc.nextInt();
        }

        semana = resto(trunca(m),d,a,quociente(a,q),quociente(s,q),s);

        System.out.printf("\nO dia da semana e' %d.\n\n", semana);
    }
}