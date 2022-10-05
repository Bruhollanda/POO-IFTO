package um;

public class Estudante extends Pessoa {
    private int matricula;

    public Estudante(String nome, int anoNascimento, int matricula, int horasProjetos, double valorProjetos) {
        super(nome, anoNascimento, horasProjetos, valorProjetos);
        this.matricula = matricula;
    }
}// class
