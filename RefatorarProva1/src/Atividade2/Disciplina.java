package Atividade2;

import java.util.Arrays;

public class Disciplina {
        private String sigla;
        private double[] notasFinais = new double[5];
        private boolean[][] frequencia = new boolean[5][10];

    public Disciplina(String sigla, double[] notasFinais, boolean[][] frequencia) {
        this.sigla = sigla;
        this.notasFinais = notasFinais;
        this.frequencia = frequencia;
    }// constructor
    public Disciplina(){}
    public double mediaGeral() {
        int media = 0;
        for (int i = 0; i < 5; i++) {
            media += notasFinais[i];
        }
        return (media/5.0);
    }// mediaGeral

    public void aprovadoNota() {
        int totalAprovados = 0;
        for (int i = 0; i < 5; i++) {
            if (notasFinais[i] >= 6) {
                totalAprovados++;
                System.out.printf("  Índice %d: aluno aprovado por nota\n", i+1);
            }
        }
        System.out.printf("  Foram aprovados %d alunos por nota.\n", totalAprovados);
    }// aprovadoNota

    public void aprovadoPresenca() {
        int totalAprovados = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                if (frequencia[i][j]) {
                    totalAprovados++;
                }
            }// for j
            if (totalAprovados >= 8) {
                System.out.printf("  Índice %d: aluno aprovado por frequência\n", i+1);
                totalAprovados = 0;
            }
        }// for i
    }// aprovadoPresença

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public double[] getNotasFinais() {
        return notasFinais;
    }

    public void setNotasFinais(double[] notasFinais) {
        this.notasFinais = notasFinais;
    }

    public boolean[][] getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(boolean[][] frequencia) {
        this.frequencia = frequencia;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "sigla='" + sigla + '\'' +
                ", notasFinais=" + Arrays.toString(notasFinais) +
                ", frequencia=" + Arrays.toString(frequencia) +
                '}';
    }
}// class
