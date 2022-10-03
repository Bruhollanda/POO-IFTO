import java.util.Arrays;

public class Relatorio {

    public double[] calcularMediaPorAluno(Sala a){
        double media[] = new double[a.alunos.size()], n[];
        for (int i = 0; i < a.alunos.size(); i++) {
            n = a.alunos.get(i).getNota();
            media[i] = ((n[0]+n[1]+n[2])/3);
        }
        return media;
    }

    public double mediaNotaTotal(Sala a){
        double notatortal = 0;
        for (double n : calcularMediaPorAluno(a)) {
            notatortal = n +notatortal;
        }
        return  (notatortal/a.alunos.size());
    }

    public int obterAlunoMaisNovo(Sala a){
        int idadeMenor[] = new int[a.alunos.size()];
        for (int i = 0; i < a.alunos.size(); i++) {
            idadeMenor[i] = (2022-a.alunos.get(i).getAnoNascimento());
        }
        Arrays.sort(idadeMenor);
        return idadeMenor[0];
    }

    public int obterAlunoMaisVelho(Sala a){
        int idadeMaior[] = new int[a.alunos.size()];
        for (int i = 0; i < a.alunos.size(); i++) {
            idadeMaior[i] = (2022-a.alunos.get(i).getAnoNascimento());
        }
        Arrays.sort(idadeMaior);
        return idadeMaior[(a.alunos.size()-1)];
    }

    public int obterMediaIdade(Sala a){
        int idadeTotal = 0;
        for (int i = 0; i < a.alunos.size(); i++) {
            idadeTotal = idadeTotal+(2022-a.alunos.get(i).getAnoNascimento());
        }
        return (idadeTotal/a.alunos.size());
    }

}