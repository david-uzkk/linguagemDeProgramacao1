import java.util.Scanner;

public class ex3 {
	public static void main(String[] args){
		final short DA = 365;
		final short DM = 30;
		int d, m, a;
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Anos: ");
			a = sc.nextInt();
			
			System.out.print("Meses: ");
			m = sc.nextInt();
			
			System.out.print("Dias: ");
			d = sc.nextInt();
		}
		
		d += (a * DA) + (m * DM);
		
		System.out.println("\n\nSua idade em dias é de " + d);
	}
}