package Atividade1;

import java.util.Arrays;
import java.util.Random;

public class Matriz {
    int size;
    int[][] matriz;

    public Matriz(int size) {
        this.size = size;
        this.matriz = new int[size][size];
    }// constructor

    public void preencher() {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matriz[i][j] = random.nextInt(100);
            }// for j
        }// for i
    }// preencher

    public int sum() {
        int total = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size-1 || j == 0 || j == size-1) {
                    total += matriz[i][j];
                }// for j
            }// for i
        }
        return total;
    }// sum

    public void maiorElemento() {
        int[] maior = new int[size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 && (maior[j] < matriz[i][j])) {
                    maior[j] = matriz[i][j];
                }
            }// for j
        }// for i
        for (int i = 0; i < size; i++) {
            System.out.printf("  O maior elemento da linha %d é: %d\n", i+1, maior[i]);
        }
    }// maiorElemento

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    @Override
    public String toString() {
        return "Atividade1.Matriz{" +
                "size=" + size +
                ", matriz=" + Arrays.toString(matriz) +
                '}';
    }
}// class
