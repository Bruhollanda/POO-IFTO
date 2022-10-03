package Atividade2;

public class Relatorio {
    public double mediaGeralDisciplinas(Disciplina[] disciplinas) {
        double soma = 0;
        for (int i = 0; i < disciplinas.length; i++) {
            soma += disciplinas[i].mediaGeral();
        }
        return soma/5.0;
    }// mediaGeralDisciplinas

    public void alunosAprovados(Disciplina[] disciplinas) {
        for (int i = 0; i < disciplinas.length; i++) {
            System.out.println("*********************************************");
            System.out.printf("  %s: \n", disciplinas[i].getSigla());
            disciplinas[i].aprovadoNota();
            System.out.println();
            disciplinas[i].aprovadoPresenca();
        }
    }// alunosAprovados
}// class
