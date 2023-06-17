import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        int marc1, marc2;
        double distancia, km40, km50, km60, km70, km80;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite o marco quilometrico da primeira cidade: ");
            marc1 = sc.nextInt();
            System.out.print("\nDigite o marco quilometrico da segunda cidade: ");
            marc2 = sc.nextInt();

        }

        distancia = marc2 - marc1;
        km40 = distancia / 40;
        km50 = distancia / 50;
        km60 = distancia / 60;
        km70 = distancia / 70;
        km80 = distancia / 80;

        System.out.print("Em 40 km/h levou " + km40 + "hrs.");
        System.out.print("\nEm 50 km/h levou " + km50 + "hrs.");
        System.out.print("\nEm 60 km/h levou " + km60 + "hrs.");
        System.out.print("\nEm 70 km/h levou " + km70 + "hrs.");
        System.out.print("\nEm 80 km/h levou " + km80 + "hrs.");
    }
}
