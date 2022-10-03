package Atividade2;

import java.util.Random;
import java.util.Scanner;

public class Auxiliar {
    Disciplina[] disciplinas;
    public Disciplina[] obterDados(int qntDisciplinas) {
        disciplinas = new Disciplina[qntDisciplinas];
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        double[] notas = new double[5];
        boolean[][] frequencia = new boolean[5][10];

        for (int i = 0; i < qntDisciplinas; i++) {
            disciplinas[i] = new Disciplina();
            System.out.println("Informe a sigla da disciplina: ");
            disciplinas[i].setSigla(sc.next());
            for (int j = 0; j < 5; j++) {
                notas[j] = random.nextDouble(10);
            }
            disciplinas[i].setNotasFinais(notas);
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 10; k++) {
                    frequencia[j][k] = random.nextBoolean();
                }
            }
            disciplinas[i].setFrequencia(frequencia);
        }
        return disciplinas;
    }
}// class
