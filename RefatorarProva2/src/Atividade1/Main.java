package Atividade1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Matriz matriz = new Matriz(5);
        matriz.preencher();
        System.out.println("*********************************************");
        System.out.println("  Quantidade de números pares e impares respectivamente: "+ Arrays.toString(matriz.parImpar()));
        System.out.println("*********************************************");
        matriz.somaColuna();
        System.out.println("*********************************************");

    }
}