import java.util.Arrays;
import java.util.Random;

public class Vetor {
    int[] vetor;

    public void create(int size) {
        Random rand = new Random();
        vetor = new int[size];
        for (int i = 0; i < size; i++) {
            vetor[i] = rand.nextInt(100);
        }
    }

    public void printCrescentOrder() {
        Arrays.sort(vetor);
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("["+vetor[i]+"]");
        }
    }// printCrescentOrder

}// Vetor
