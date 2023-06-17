public class lista5ex3 {
    public static void main(String[] args) {
        int[] vetor1 = {1, 5, 8, 3, 9};
        int[] vetor2 = {8, 6, 2, 0, 7};
        int[] vetor3 = new int[6];
        int valorV1, valorV2;

        valorV1 = (vetor1[1]*10000)+(vetor1[2]*1000)+(vetor1[3]*100)+(vetor1[4]*10)+(vetor1[5]);
        valorV2 = (vetor2[1]*10000)+(vetor2[2]*1000)+(vetor2[3]*100)+(vetor2[4]*10)+(vetor2[5]);
        vetor3[1] = valorV1 + valorV2;

        System.out.printf("\nV[1] = %d", vetor1[1], vetor1[2], vetor1[3], vetor1[4], vetor1[5]);
        System.out.printf("\nV[2] = %d", vetor2[1], vetor2[2], vetor2[3], vetor2[4], vetor1[5]);
        System.out.printf("\n\nV[3] = %d", vetor3);
    }
    
}