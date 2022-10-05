package um;

public class Professor extends Pessoa {
    private String titulacao;

    public Professor(String nome, int anoNascimento, String titulacao, int horasProjetos, double valorProjetos) {
        super(nome, anoNascimento, horasProjetos, valorProjetos);
        this.titulacao = titulacao;
    }
}// class
