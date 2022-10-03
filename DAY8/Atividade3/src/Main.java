import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sala s1 = new Sala(001,2022, "Teste Automatico");
        s1.addAluno();
        System.out.println(s1);

        Relatorio re = new Relatorio();
        System.out.println("Média das notas de cada estudante: "+ Arrays.toString(re.calcularMediaPorAluno(s1)));
        System.out.println("Média Total dos estudantes: "+re.mediaNotaTotal(s1));
        System.out.println("A menor idade da turma é: "+re.obterAlunoMaisNovo(s1));
        System.out.println("A Maior idade da turma é: "+re.obterAlunoMaisVelho(s1));
        System.out.println("A media da idade é de : "+re.obterMediaIdade(s1));

    }
}