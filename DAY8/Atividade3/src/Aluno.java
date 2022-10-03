import java.util.ArrayList;
import java.util.Arrays;

public class Aluno {
    private int id, anoNascimento;
    private String nome;
    private double[] nota;

    public Aluno(int id, int anoNascimento, String nome, double[] nota) {
        this.id = id;
        this.anoNascimento = anoNascimento;
        this.nome = nome;
        this.nota = nota;
    }

    public Aluno () {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNota() {
        return nota;
    }

    public void setNota(double[] nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", anoNascimento=" + anoNascimento +
                ", nome='" + nome + '\'' +
                ", nota=" + Arrays.toString(nota) +
                '}';
    }
}