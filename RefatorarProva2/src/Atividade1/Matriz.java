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

    public int[] parImpar() {
        int[] parEImpar = new int[2];
        int par = 0, impar = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (matriz[i][j] % 2 != 0) {
                    par++;
                } else {
                    impar++;
                }
            }// for j
        }// for i
        parEImpar[0] = par;
        parEImpar[1] = impar;
        return parEImpar;
    }// sum

    public void somaColuna() {
        int soma = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                soma += matriz[j][i];
            }// for j
            int div = 0;
            for (int k = 1; k <= soma; k++) {
                if (soma % k == 0) {
                    div++;
                }
            }
            if (div > 2) {
                System.out.printf("A soma da coluna  %d não é um número primo.", i+1);
            } else {
                System.out.printf("A soma da coluna %d é um número primo.", i+1);
            }
        }// for i
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
