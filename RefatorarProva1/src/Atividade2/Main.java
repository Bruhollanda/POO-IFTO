package Atividade2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Auxiliar auxiliar = new Auxiliar();

        System.out.println("Informe a quantidade de disciplinas: ");
        int quantidadeDisciplinas = sc.nextInt();

        Disciplina[] disciplinas = auxiliar.obterDados(quantidadeDisciplinas);

        Relatorio relatorio = new Relatorio();
        System.out.println("*********************************************");
        System.out.println("  Média geral das disciplinas: ");
        System.out.println(relatorio.mediaGeralDisciplinas(disciplinas));
        System.out.println("*********************************************");
        System.out.println("Alunos aprovados por disciplina: ");
        relatorio.alunosAprovados(disciplinas);
        System.out.println("*********************************************");
    }
}
